public class Gracz {
    String nick;
    int level;
    double coins;

    Gracz(String nick, int level, double coins) {
        this.nick = nick;
        this.level = level;
        this.coins = coins;
    }

    void pokazProfil() {
        System.out.println("Nick: " + nick);
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);
    }

    void dodajCoins(double ile) {
        this.coins = this.coins + ile;
    }
}
