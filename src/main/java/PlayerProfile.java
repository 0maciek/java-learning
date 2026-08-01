public class PlayerProfile {
    public static void main(String[] args) {
        String nick = "maciek";
        int level = 16;
        level = 3;
        double coins = 1200.21;
        boolean premium = false;
        int kills = 10;

        System.out.println("Nick: " + nick);
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);
        System.out.println("Premium: " + premium);
        System.out.println("Kills: " + kills);

        if (level >= 10) {
            System.out.println("pl.sonitolbito.Gracz ma wysoki poziom.");
        } else {
            System.out.println("pl.sonitolbito.Gracz ma niski poziom.");
        }

        if (level >= 10 && coins >= 100.0) {
            System.out.println("Możesz kupić rangę VIP!");
        } else {
            System.out.println("Nie spełniasz wymagań na VIPa.");
        }

        if (nick.equals("maciek") || level >= 50) {
            System.out.println("Masz dostęp do specjalnej strefy!");
        } else {
            System.out.println("Nie masz dostępu do specjalnej strefy.");
        }
    }
}