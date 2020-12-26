package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> bingoNumbers = Arrays.asList("A12", "B14", "G6", "D8", "E9", "G2");

        List<String> gNum = new ArrayList<>();

        bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Employee john = new Employee("John Doe", 30);
        Employee steve = new Employee("Steve Smith", 27);
        Employee rebecca = new Employee("Rebecca Salvia", 26);
        Employee jack = new Employee("Jack Ripper", 47);

        Department hr = new Department("Human Resources");
        hr.addEmployee(steve);
        hr.addEmployee(rebecca);
        hr.addEmployee(jack);

        Department accounts = new Department("Accounts");
        accounts.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounts);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

    }
}
