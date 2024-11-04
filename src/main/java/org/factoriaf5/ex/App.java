package org.factoriaf5.ex;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    public static void main(String[] args) {
   
        Person chip = new Person("Chip", "Justice", 0, "30-10-1943", "USA", 'H');
        Person dale = new Person("Dale", "Justice", 0, "31-10-1943", "USA", 'H');
        chip.outputAllAttributes();
        dale.outputAllAttributes();
    }
}
