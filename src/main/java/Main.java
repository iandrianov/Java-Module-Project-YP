
public class Main {
    public static void main(String[] args) throws InterruptedException {
        showGameStartAnimation();
        Race race = new Race();
        String raceWinnerName = race.findRaceWinner(race.createRace()).name;
        showWinner(raceWinnerName);

    }

    public static void showWinner(String raceWinnerName) throws InterruptedException {

        Thread.sleep(500);

        String[] fireworks = {
                "🎆         ",
                "   🎇      ",
                "      🎆   ",
                "         🎇",
                "   🎆      ",
                "      🎇   "
        };

        for (int i = 0; i < 2; i++) {
            for (String fire : fireworks) {
                System.out.print("\r" + fire);
                Thread.sleep(150);
            }
        }

        System.out.println("\n====================================");
        System.out.println("🚗💨  " + raceWinnerName.toUpperCase() + " пересёк финиш первым!  💨🚗");
        System.out.println("====================================");


        String message = "🏆 П О Б Е Д А ! 🏆";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            Thread.sleep(120);
        }

        System.out.println("\n🎇 Поздравляем чемпиона! 🎇");
    }

    public static void showGameStartAnimation() throws InterruptedException {
        String[] frames = {
                "        🚗💨",
                "           🚗💨",
                "              🚗💨",
                "                 🚗💨",
                "                    🚗💨",
                "                       🚗💨",
                "                          🚗💨",
                "                             🚗💨",
                "                                🚗💨",
                "                                   🚗💨"
        };

        for (String frame : frames) {
            System.out.print("\r" + frame);
            Thread.sleep(150);
        }

        Thread.sleep(500);

        String message = "🚀 И Г Р А   Н А Ч А Л А С Ь ! 🚀";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            Thread.sleep(120);
        }

        System.out.println("\n===============================");
        System.out.println("      Добро пожаловать!       ");
        System.out.println("===============================");
    }

}

