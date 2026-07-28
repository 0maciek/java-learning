public class WhileTest {
    public static void main(String[] args) {
        int level = 1;

        while (level < 20) {
            level = level + 3;
            System.out.println("Masz już: " + level + " level.");
        }

        System.out.println("Masz wystarczający level!");


        int duration = 5;

        while (duration - 1 > 0) {
            duration = duration - 1;
            System.out.println("Efekt działa pozostało: " + duration + " sekund");
        }

        System.out.println("Efekt potki wygasł!");


        int blocksToMine = 15;
        int blocksMined = 0;

        while (blocksMined < blocksToMine) {
            blocksMined = blocksMined + 3;
            System.out.println("Uderzenie! Wykopano już: " + blocksMined + " bloków");
        }

        System.out.println("Wykopano wszystkie bloki!");
    }
}