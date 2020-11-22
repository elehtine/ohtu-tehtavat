package ohtu;

public class TennisGame {

    private static final String[] SCORE_STRINGS = new String[] { "Love", "Fifteen", "Thirty", "Forty" };
    private static final String[] GREAT_STRINGS = new String[] { "Win for ", "Advantage ", "Deuce", "Advantage ", "Win for " };

    private int score1 = 0;
    private int score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            score1++;
        } else {
            score2++;
        }
    }

    public String getEqualScore() {
        return SCORE_STRINGS[score1] + "-All";
    }

    public String getSmallScore() {
        return SCORE_STRINGS[score1] + "-" + SCORE_STRINGS[score2];
    }

    public String getGreatScore() {
        int diff = score1 - score2;
        if (diff > 2) {
            diff = 2;
        }
        if (diff < -2) {
            diff = -2;
        }

        String score = GREAT_STRINGS[diff + 2];
        if (diff == 0) {
            return score;
        }

        if (diff < 0) {
            return score + player2Name;
        }
        return score + player1Name;
    }

    public String getScore() {
        if (score1 >= 4 || score2 >= 4) {
            return getGreatScore();
        } else if (score1 == score2) {
            return getEqualScore();
        } 
        return getSmallScore();
    }

}
