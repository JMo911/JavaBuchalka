public class MethodChallenge {
    public static void main(String[] args) {
        // int firstScore = calculateHighScorePosition(1500);
        // int secondScore = calculateHighScorePosition(900);
        // displayHighScorePosition("J", firstScore);
        // displayHighScorePosition("A", secondScore);
        // displayHighScorePosition("C", calculateHighScorePosition(400));
        // displayHighScorePosition("O", calculateHighScorePosition(50));
        // System.out.println(getDurationString(1, 10));
        // System.out.println(getDurationString(200));
        // System.out.println(getDurationString(0, 10));
        // System.out.println(getDurationString(2, -10));
        // System.out.println(getDurationString(-10));
        // System.out.println(getDurationString(72, 10));
        // System.out.println(getDurationString(360000000));
        // System.out.println(getDurationString(61, 0));
        // System.out.println(area(5.0));
        // System.out.println(area(-1));
        // System.out.println(area(5.0, 4.0));
        // System.out.println(area(-1.0,4.0));
        // printYearsAndDays(525600);
        // printYearsAndDays(1051200);
        // printYearsAndDays(561600);
        // printEqual(1, 1, 1);
        // printEqual(1, 1, 2);
        // printEqual(-1, -1, -1);
        // printEqual(1, 2, 3);
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }


    // public static int calculateHighScorePosition(int score) {
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

    //     int position = 4;
    //     if(score >=1000) {
    //         position = 1;
    //     } else if(score >= 500) {
    //         position = 2;
    //     } else if(score >= 100) {
    //         position = 3;
    //     }
    //     return position;
    // }

    // public static void displayHighScorePosition(String name, int position) {
    //     System.out.println(name + " managed to get to position " + position + " on the high score table.");
    // }

    // SECONDS AND MINUTES CHALLENGE
    // public static String getDurationString(int minutes, int seconds) {
    //     if(minutes < 0 || seconds < 0 || seconds > 59) return "Invalid value";
    //     int hours = minutes / 60;
    //     int remainingMin = minutes % 60;
    //     String formattedHours = "";
    //     String formattedRemainingMinutes = "";
    //     String formattedSeconds = "";

    //     if (hours < 10) {
    //         formattedHours = String.format("0%s", hours);
    //     }
    //     if (remainingMin < 10) {
    //         formattedRemainingMinutes = String.format("0%s", remainingMin);
    //     }
    //     if (seconds < 10) {
    //         formattedSeconds = String.format("0%s", seconds);
    //     }

    //     return String.format("%sh %sm %ss", formattedHours.length()> 0 ? formattedHours : hours, 
    //                                         formattedRemainingMinutes.length()> 0 ? formattedRemainingMinutes : remainingMin, 
    //                                         formattedSeconds.length()> 0 ? formattedSeconds : seconds);
    // }

    // public static String getDurationString(int seconds) {
    //     if(seconds < 0) return "Invalid value";
    //     int minutes = (int)Math.floor(seconds/60);
    //     return getDurationString(minutes, seconds-minutes*60);
    // }

    // AREA CALCULATOR EXERCISE
    // public static double area(double radius) {
    //     if (radius < 0) return -1;
    //     return radius * radius * Math.PI;
    // }

    // public static double area(double x, double y) {
    //     if (x < 0 || y < 0) return -1;
    //     return x * y;
    // }

    // MINUTES TO YEARS AND DAYS CALCULATOR
    // public static void printYearsAndDays(long minutes) {
    //     if (minutes < 0) {
    //         System.out.println("Invalid Value");
    //     } else {

    //         long hours = minutes / 60;
    //         long days = hours / 24;
    
    //         System.out.println(minutes + " min = " + days / 365 + " y and " + days % 365 + " d");
    //     }
    // }

    // EQUALITY PRINTER
    // public static void printEqual(int x, int y, int z) {
    //     if (x < 0 || y < 0 || z < 0) {
    //         System.out.println("Invalid Value");
    //     } else if (x == y && x == z) {
    //         System.out.println("All numbers are equal");
    //     } else if (x != y && x != z && y != z) {
    //         System.out.println("All numbers are different");
    //     } else {
    //         System.out.println("Neither all are equal or different");
    //     }
    // }

    // PLAYING CAT
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (temperature >= 25 && temperature <= 35) || (summer && temperature >= 25 && temperature <= 45);
    }
}
