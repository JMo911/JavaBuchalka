public class MethodChallenge {
    public static void main(String[] args) {
        int firstScore = calculateHighScorePosition(1500);
        int secondScore = calculateHighScorePosition(900);
        displayHighScorePosition("J", firstScore);
        displayHighScorePosition("A", secondScore);
        displayHighScorePosition("C", calculateHighScorePosition(400));
        displayHighScorePosition("O", calculateHighScorePosition(50));
    }
    public static int calculateHighScorePosition(int score) {
        // if(score >=1000) {
        //     return 1;
        // } else if(score >= 500 && score < 1000) {
        //     return 2;
        // } else if(score >= 100 && score < 500) {
        //     return 3;
        // }
        // second conditions were redundant.. implied by prior conditions.
        // if(score >=1000) {
        //     return 1;
        // } else if(score >= 500) {
        //     return 2;
        // } else if(score >= 100) {
        //     return 3;
        // }
        // return 4;

        int position = 4;
        if(score >=1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }
        return position;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get to position " + position + " on the high score table.");
    }

}
