import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> gracze = new ArrayList<>();

        gracze.add("Maciek");
        gracze.add("Kacper");
        gracze.add("Steve");
        gracze.add("Ania");
        gracze.add("Robert");

        System.out.println("Gracz numer 1: " + gracze.get(0));
        System.out.println("Ilosc graczy: " + gracze.size());

        gracze.remove("Kacper");
        System.out.println("Ilosc graczy po wyjsciu Kacpra: " + gracze.size());


        System.out.println("Lista wszystkich graczy:");
        for (int i = 0; i < gracze.size(); i++) {
            System.out.println("Gracz na pozycji " + i + ": " + gracze.get(i));
        }
    }
}