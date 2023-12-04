// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Sword rustySword = new Sword("Rusty sword",4);
        Knight a1 = new Knight("marl",5, rustySword);
        a1.mainHandStats();
    }
}