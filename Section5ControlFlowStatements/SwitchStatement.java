public class SwitchStatement {
    public static void main(String[] args) {
        int value = 1;
        // if (value == 1) {
        //     System.out.println("value was 1");
        // } else if (value == 2) {
        //     System.out.println("value was 2");
        // } else {
        //     System.out.println("value was not 1 or 2");
        // }


// MAKE SURE TO INCLUDE BREAK STATEMENTS IN YOUR CASES, OTHERWISE ALL CASES WILL BE RUN. SEE BELOW
        // switch (value) {
        //     case 1: // same is if (value == 1)
        //         System.out.println("value was 1");
        //         break; // terminates control switch statement and continues at the line below the switch block

        //     case 2:
        //         System.out.println("value was 2");
        //         break;

        //     case 3: case 4: case 5:
        //         System.out.println("value was 3, or 4, or 5");
        //         break;
        
        //     default: // similar to the else statement.. any other case not covered in the above
        //         System.out.println("value was not 1, 2, 3, 4, or 5");
        //         break;
        // }

        // MISSING BREAKS
        // switch (value) {
        //     case 1: // same is if (value == 1)
        //         System.out.println("value was 1");
        //         // break; // terminates control switch statement and continues at the line below the switch block

        //     case 2:
        //         System.out.println("value was 2");
        //         // break;

        //     case 3: case 4: case 5:
        //         System.out.println("value was 3, or 4, or 5");
        //         // break;
        
        //     default: // similar to the else statement.. any other case not covered in the above
        //         System.out.println("value was not 1, 2, 3, 4, or 5");
        //         break;
        // }
        char myChar = 'F';


        // CHALLENGE
        // switch(myChar) {
        //     // case 'A':
        //     //     System.out.println("Char was " + myChar);
        //     //     break;
        //     // case 'B':
        //     //     System.out.println("Char was " + myChar);
        //     //     break;
        //     // case 'C':
        //     //     System.out.println("Char was " + myChar);
        //     //     break;
        //     // case 'D':
        //     //     System.out.println("Char was " + myChar);
        //     //     break;
        //     // case 'E':
        //     //     System.out.println("Char was " + myChar);
        //     //     break;
        //     case 'A': case 'B': case 'C': case 'D': case 'E':
        //         System.out.println("Char was " + myChar);
        //         break;
        //     default:
        //         System.out.println("Char was not A, B, C, D, or E.");
        //         break;
        // }

        // STRING EXAMPLE
        // String month = "January";
        // switch(month.toLowerCase()) {
        //     case "january": case "june":
        //         System.out.println(month);
        //         break;
        //     default:
        //         System.out.println("not sure");
        //         break;
        // }
            printDayOfTheWeek(1);
            printDayOfTheWeekIf(8);
    }


        // DAY OF THE WEEK CHALLENGE
        public static void printDayOfTheWeek(int day) {
            switch(day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("InvalidDay");
                    break;
            }
        }

        // DAY OF THE WEEK CHALLENGE
        public static void printDayOfTheWeekIf(int day) {
            if(day == 0) {
                System.out.println("Sunday");
            } else if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Invalid Day");
            }
        }
}
