public class ObjectTest {
    public static void main(String[] args) {
        Gracz gracz1 = new Gracz("Maciek",16,67.9);
        Gracz gracz2 = new Gracz("Aimen",31,42.7);

        gracz1.pokazProfil();
        gracz2.pokazProfil();

        gracz1.dodajCoins(50);
        gracz1.pokazProfil();
        gracz2.dodajCoins(43);
        gracz2.pokazProfil();
    }
}
