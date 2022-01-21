import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.temporal.IsoFields;

public class CodeExercises {
    // public static long toMilesPerHour(double kilometersPerHour) {
    //     if (kilometersPerHour < 0) return -1;
    //     return Math.round(kilometersPerHour / 1.609);
    // }

    // public static void printConversion(double kilometersPerHour) {
    //     if (kilometersPerHour < 0) {
    //         System.out.println("Invalid Value");
    //     } else {
    //         System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    //     }
    // }

    // public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    //     if (kiloBytes < 0) {
    //         System.out.println("Invalid Value");
    //     } else {
    //         System.out.println(kiloBytes + " KB = " +  kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB");
    //     }
    // }

    // public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
    //     if (hourOfDay < 0 || hourOfDay > 23) return false;
    //     if(isBarking && (hourOfDay < 8 || hourOfDay > 22)) {
    //         return true;
    //     }

    //     return false;
    // }

    // public static boolean isLeapYear(int year) {
    //     if (year < 1 || year > 9999) return false;
    //     if (year % 4 == 0) {
    //         if (year % 100 == 0) {
    //             if (year % 400 == 0) {
    //                 return true;
    //             } else {
    //                 return false;
    //             }
    //         } else {
    //             return true;
    //         }
    //     } 
    //     return false;
    // }

    // public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // String s1=String.valueOf(num1);  
        // String s2=String.valueOf(num2);  
        // String[] parts1 = s1.split(".");
        // String[] parts2 = s2.split(".");
        // System.out.println(parts1[0] + " " + parts1[2]+ " " + parts2[0]+ " " + parts2[2]);
        // // if (parts1.length > 1 && parts2.length > 1) {
        // //     return parts1[0] == parts2[0] && parts1[1].substring(0, 4) == parts2[1].substring(0, 4);
        // // } else {
        // //     return parts1[0] == parts2[0];
        // // }
        // return false;

        // Q&A solutions
    //     return (int) (num1*1000) == (int) (num2*1000);
    // }


    // public static boolean hasEqualSum(int num1, int num2, int num3) {
        
    //     return num1 + num2 == num3;
    // }

    public static boolean hasTeen(int num1, int num2, int num3) {
        
        return (num1 >= 13 && num1 <=19) || (num2 >= 13 && num2 <=19) || (num3 >= 13 && num3 <=19) ;
    }

    public static boolean isTeen(int myNum) {
        
        return myNum >= 13 && myNum <=19 ;
    }


    public static void main(String[] args) {
        // printConversion(1.5);
        // printConversion(10.25);
        // printConversion(-5.6);
        // printConversion(25.42);
        // printConversion(75.114);
        // printMegaBytesAndKiloBytes(2500);
        // printMegaBytesAndKiloBytes(-1024);
        // printMegaBytesAndKiloBytes(5000);
        // System.out.println(shouldWakeUp(true, 1));
        // System.out.println(shouldWakeUp(false, 2));
        // System.out.println(shouldWakeUp(true, 8));
        // System.out.println(shouldWakeUp(true, -1));
        // System.out.println(isLeapYear(-1600));
        // System.out.println(isLeapYear(1600));
        // System.out.println(isLeapYear(2017));
        // System.out.println(isLeapYear(2000));
        // System.out.println(isLeapYear(1924));
        // System.out.println(hasEqualSum(1,1,1));
        // System.out.println(hasEqualSum(1,1,2));
        // System.out.println(hasEqualSum(1,-1,0));
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,24));
        
        
        
        
        
    }
}
