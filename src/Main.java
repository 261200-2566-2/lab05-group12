// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Sword rustySword = new Sword("Rusty sword",40);
        Knight a1 = new Knight("Marl",5, rustySword);
        Knight a2 = new Knight("Park",1, rustySword);
        a1.mainHandStats();
        a1.attack(a2);
        a2.statsDisplay();
    }
}