public class IfThenElseAndMethods {
    public static int calcFinalScore(int score, boolean isGameOver, int levelCompleted, int bonus) {
        if (isGameOver) {
            return score + (levelCompleted * bonus);
            // System.out.println("Your final score was " + finalScore);
        } 
        // -1 conventionally used to indicate an error
        return -1;
    }
    public static void main(String[] args) {
	    // int score = 800;
	    // boolean isGameOver = true;
	    // int levelCompleted = 5;
	    // int bonus = 100;

//	    if ((score < 5000) && (score > 1000)) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score <= 1000) {
//            System.out.println("Your score was less than or equal to 1000");
//        } else {
//            System.out.println("Got here");
//        }

        // if (isGameOver) {
        //     int finalScore = score + (levelCompleted * bonus);
        //     System.out.println("Your final score was " + finalScore);
        // }

        // print out second score on the screen w/ score=10000, levelCompleted = 8, bonus = 200, but display first score as well.
        int firstFinalScore = calcFinalScore(800, true, 5, 100);
        System.out.println(firstFinalScore);
        System.out.println(calcFinalScore(10000, true, 8, 200));
    }
}

// previous solution
// static int finalScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//     if(gameOver) {
//         int myScore = score + (levelCompleted * bonus);
//         return myScore;
//     }
//     return -1;
// }


// public static void main(String[] args) {
//     System.out.println(finalScore(true, 500, 8, 100));
//     System.out.println(finalScore(true, 10000, 8, 200));
//     int myNum = 5 + 5;
//     int secondNum = 12;
//     int thirddNum = 6;
//     int myTotal = myNum + secondNum + thirddNum;
//     int myLastOne = myTotal - 1000;
//     System.out.println(myLastOne);
// }
