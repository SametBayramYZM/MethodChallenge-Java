public class MethodChallenge {

    public static void main(String[] args) {

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Samet",playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim",playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("James",playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("John",playerPosition);

        playerPosition = calculateHighScorePosition(25);
        displayHighScorePosition("Adam",playerPosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore>=100) {
            position = 3;
        }
        return position;
    }
}
