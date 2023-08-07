package io.barisdere.java.newfeatures;

public class EnhancedString {
    public static void main(String[] args) {
        String json = "{\n" +
                "\t\"name\": \"Baris Dere\",\n" +
                "\t\"youtube\": \"@BarisDere\",\n" +
                "\t\"website\": :\"www.barisdere.io\"\n" +
                "}";

        String newJson = """
                {
                    "name": "Baris Dere",
                    "youtube": "@BarisDere",
                    "website": :"www.barisdere.io"
                }
                """;
    }
}
