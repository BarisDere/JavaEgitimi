package io.barisdere.java.newfeatures;

public class EnhancedSwitch {
    public static void main(String[] args) {
        String text = someText();
        switch (text) {
            case "H":
            case "Hello":
                System.out.println("Hello");
                break;
            case "World":
                System.out.println("World");
                break;
            default:
                System.out.println("default");
        }

        switch (text) {
            case "H", "Hello" -> System.out.println("Hello");
            case "World" -> System.out.println("World");
            default -> System.out.println("default");
        }
    }

    private static String someText() {
        return "";
    }
}
