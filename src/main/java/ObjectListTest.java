import java.util.ArrayList;

public class ObjectListTest {
    public static void main(String[] args) {
        ArrayList<Gracz> gracze = new ArrayList<>();

        gracze.add(new Gracz("g1",1,11));
        gracze.add(new Gracz("g2",2,22));
        gracze.add(new Gracz("g3",3,33));

        for (int i = 0; i < gracze.size(); i++) {
            gracze.get(i).pokazProfil();
        }
    }
}
