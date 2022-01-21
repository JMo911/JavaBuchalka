public class MethodOverloading {
    public static void main(String[] args) {
        // int newScore = calculateScore("J", 500);   
        // System.out.println("New score is " + newScore);
        // calculateScore(100);
        // calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(7,5));
        System.out.println(calcFeetAndInchesToCentimeters(-1,1));
        System.out.println(calcFeetAndInchesToCentimeters(0,1));
        System.out.println(calcFeetAndInchesToCentimeters(6,0));
        System.out.println(calcFeetAndInchesToCentimeters(6,13));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    // public static int calculateScore(String playerName, int score) {
    //     System.out.println("Player " + playerName + " scored " + score + " points");
    //     return score*1000;
    // }

    // public static int calculateScore(int score1, int score2) {
    //     System.out.println("Player scored " + score1+ " points first and " + score2 + " points second");
    //     return score1+score2;
    // }

    // public static int calculateScore(int score) {
    //     System.out.println("Unnamed Player scored " + score + " points");
    //     return score*1000;
    // }

    // public static int calculateScore() {
    //     System.out.println("No Player name, no player score ");
    //     return 0;
    // }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) return -1;
        double totalInches = feet * 12 + inches;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) return -1;
        double totalFeet = Math.floor(inches / 12);
        return calcFeetAndInchesToCentimeters(totalFeet, inches % 12);
    }

}
