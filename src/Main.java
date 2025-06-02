public class Main {
    public static void main(String[] args) {
        Player Raquel = new Player("Raquel");
        Player Mario = new Player("Marioooooo");

        Game game = new Game (Raquel, Mario);

        game.start();

    }
}