package it.develhope.javadoc1;

/**
 * This class has the main method
 * @author Lorenzo Balestrini
 */

public class Tester {
    public static void main(String[] args) {

        WordGames wordGames = new WordGames();

        System.out.println(wordGames.addHelloWord("everyone"));
        System.out.println(wordGames.getFullName("Lorenzo", "Balestrini"));
    }
}
