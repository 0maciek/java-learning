public class MethodsTest {

    public static void main(String[] args) {
        wyswietlPowitanie();

        int wynik = dodajMonety(50, 30);
        System.out.println("Nowe monety: " + wynik);


        int pomnozLevel = staryLevel(20);
        System.out.println("Pomnozony level: " + pomnozLevel);


        sprawdzDostep(20);
    }

    static void sprawdzDostep (int wiek) {
        if (wiek >= 16) System.out.println("Dostęp przyznany");
        else System.out.println("Dostęp zabroniony");
    }

    static void wyswietlPowitanie() {
        System.out.println("Witaj na naszym serwerze!");
        System.out.println("Zyczymy milej gry.");
    }

    static int dodajMonety(int obecne, int zdobyte) {
        int suma = obecne + zdobyte;
        return suma;
    }

    static int staryLevel(int aktualny) {
        int obliczone = aktualny * 2;
        return obliczone;
    }
}
