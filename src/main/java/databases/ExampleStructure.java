package databases;

import java.sql.*;

public class ExampleStructure {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Kyle\\IdeaProjects\\MasterClass\\src\\main\\javA\\databases\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " TEXT, " +
                    COLUMN_PHONE + " INTEGER, " +
                    COLUMN_EMAIL + " TEXT)");

            insertContact(statement, "Steve", 12345, "steve@gmail.com");
            insertContact(statement, "John", 6789, "john@gmail.com");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM contacts");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(COLUMN_NAME) + " " +
                        resultSet.getInt(COLUMN_PHONE) + " " +
                        resultSet.getString(COLUMN_EMAIL));
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('" + name + "', " + phone + ", '" + email +"')");
    }
}
