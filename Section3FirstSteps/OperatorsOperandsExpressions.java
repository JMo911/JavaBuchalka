public class OperatorsOperandsExpressions {
    public static void main(String[] args) {

        int result = 1 + 2;
        // System.out.println("1 + 2 = " + result);
        int prevResult = result;
        // System.out.println("prevResult " + prevResult);
        result = result - 1; // 3-1 = 2
        // System.out.println(result);
        //  prevResult stays with value 3
        // System.out.println("prevResult " + prevResult);

        result = result * 10; // 2 * 10 = 20
        // System.out.println(result);

        result = result / 5; // 20/5 = 4
        // System.out.println(result);

        // modulus gives remainder of 4 % 3 = 1
        result = result % 3;
        // System.out.println(result);

        // ABBREVIATING OPERATORS
        result++; // 1 + 1 = 2
        // System.out.println(result);

        result--; // 2 - 1 = 1
        // System.out.println(result);

        // result = result + 2
        result += 2; //1 + 2 = 3
        // System.out.println(result);

        // result = result * 2
        result *= 10; // 3 * 10 = 30
        // System.out.println(result);

        // result = result / 3
        result /= 3; // 10 / 3 = 10
        // System.out.println(result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        // System.out.println(result);

        // boolean isAlien = false;
        // if(!isAlien) {
        //     System.out.println("it is not an alien!");
        //     System.out.println("seriously it is not an alien!");
        // } else {
        //     System.out.println("it's an alien!");
        // }

        int topScore = 80;
        if(topScore < 80) {
            // System.out.println("you got the high score!");
        }

        int secondTopScore = 95;
        if(topScore > secondTopScore && topScore < 100) {
            // System.out.println("greater than second top score and less than 100");
        }

        if((topScore > secondTopScore) && (topScore < 100)) {
            // System.out.println("greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            // System.out.println("either or both conditions true");
        }

        int newValue = 50;
        // if (newValue = 50) {
        //     System.out.println("this is an error");
        // }
        if (newValue == 50) {
            // System.out.println("this is correct");
        }

        boolean isCar = false;
        // if(isCar = true) {
        //     System.out.println("this shouldn't happen");
        // }
        if(!isCar) {
            // System.out.println("this is correct syntax");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            // System.out.println("wasCar is true");
        }

        // OPERATOR PRECEDENCE AND CHALLENGE
        double myDouble = 20.00;
        double secondDouble = 80.00;
        double thirdDouble = (myDouble + secondDouble) * 100;
        System.out.println("third double " + thirdDouble);
        double remainder = thirdDouble % 40.00d;
        System.out.println("my remainder " + remainder);
        boolean isRemainder = remainder != 0;
        System.out.println(isRemainder);
        if (isRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
