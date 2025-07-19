package zxf.java.jdk17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDK17Tests {
    public static void main(String[] args) {
        // Java 8
        Map<String, List<Integer>> map1 = new HashMap<>();

        // Java 10+
        var map2 = new HashMap<String, List<Integer>>();

        var value = "A";
        // Java 8 traditional switch statement
        int result1;
        switch (value) {
            case "A":
                result1 = 1;       // Assign value for case "A"
                break;            // Prevent fall-through
            default:
                result1 = 0;       // Default case assignment
        }

        // Java 12+ switch expression (concise and returns a value)
        int result2 = switch (value) {
            case "A" -> 1;       // Directly returns 1 for case "A"
            default -> 0;        // Returns 0 for any other value
        };

        //Java 15+ with Text Blocks
        String json = """
              {
                "name": "Ainan",
                "role": "Developer"
              }
              """;

        Object obj = "13234";
        // Java 8
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }

        // Java 17
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }

    // Java 8 version
    public static class User1 {
        // A private final field to store the user's name
        private final String name;

        // Constructor to initialize the name
        public User1(String name) {
            this.name = name;
        }

        // Getter method to access the name
        public String getName() {
            return name;
        }
    }

    // Java 16+ version using records
    // 'record' automatically creates:
    // - private final fields
    // - constructor
    // - getters (named exactly like the field, i.e., user.name())
    // - equals(), hashCode(), and toString() methods
    record User2(String name) {}
}
