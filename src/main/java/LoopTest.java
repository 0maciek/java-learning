public class LoopTest {
    public static void main(String[] args) {

        System.out.println("Odliczanie startu serwera:");

        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println("Sekunda: " + i);
        }

        System.out.println("SERWER WYSTARTOWAŁ!");
    }
}