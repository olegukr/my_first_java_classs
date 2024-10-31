package org.factoriaf5.ex;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
   
        Person chip = new Person("Chip", "Justice", 0, "30-10-1943");
        Person dale = new Person("Dale", "Justice", 0, "30-10-1943");
        chip.outputAllAttributes();
        dale.outputAllAttributes();

    }
}
