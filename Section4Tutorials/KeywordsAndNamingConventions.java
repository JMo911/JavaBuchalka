public class KeywordsAndNamingConventions {
    public static void main(String[] args) {
        //  throws an error because int is a reserved keyword
        // double int = 50.00d;
        double salesRepMiles = 50.00d;
        int dailyCustomers = 10;
        char lastKeyPressed = 'A';

        // the calculation on the right is done first, then we assign the resultant value to the variable 'kilometers'.. thus the equal sign assignment operator is right associative. it evaluates right-to-left..
        double kilometers = (100d * 1.603944d);
            // ------------------------------ this is the entire expression (no semi colon or data type)

        // declaration statements    
        int finalScore = 50;
        int playersHighScore;

        // expression statements
        // finalScore = 60 // an assignment EXPRESSION
        finalScore = 60; // an assignment EXPRESSION STATEMENT.. diff is the semi-colon
        int calculatedScore = finalScore = 60; // declaration statement..
        // System.out.println(calculatedScore);

        int playerLives = 3;
        // playerLives--; //decrementer.. an EXPRESSION STATEMENT, deducts 1 from playerLives
        // System.out.println(playerLives--); // just an EXPRESSION here.. but still returns 3 here, because it's a postfix -> decrement gets executed after evaluating this line
        // System.out.println(playerLives); // now it returns 2
        // System.out.println(--playerLives); // returns 1 because it's a prefix now.. decrement is executed before result of operation is returned.. 
        // System.out.println(++playerLives);

        if (calculatedScore > 59) { // a control flow statement.. depending on the value in the parentheses we're altering the standard flow of our program, which is typically top to bottom..
            System.out.println("I calculate your score as being more than 59!");
        }
    }
}
