public class Main {
    static void finalScore(int score, int levelCompleted, int bonus) {
        int myScore = score + (levelCompleted * bonus);
        System.out.println("Final Score: " + myScore);
    }


    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 8;
        int bonus = 100;

        if(gameOver) {
            finalScore(score, levelCompleted, bonus);
        }
        finalScore(10000, 8, 200);
    }


}
