package practice_4;

public class GameSettings {
    static int maxPlayers = 100;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    int addPlayer () {
        if (currentPlayers < maxPlayers) {
            return currentPlayers ++;
        }
        return currentPlayers;
    }

    void printGameStatus() {
        System.out.println("Игра: " + gameName + ", Текущее количество игроков: " + currentPlayers + ", Максимальное количество игроков: " + maxPlayers);
    }

    public static void main (String[] args) {
        GameSettings game1 = new GameSettings("Дота", 97);
        GameSettings game2 = new GameSettings("Коты", 100);
        GameSettings.maxPlayers = 110;
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();
    }
}
