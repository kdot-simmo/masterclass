package lambdas;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class LambdasChallenge {

    public static void main(String[] args) {

        List<String> topNames = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie", "Harry", "Jacob");

        long count = topNames.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .filter(s -> s.startsWith("A"))
                .count();

        System.out.println(count);




    }
}
