public class PrimitiveRecapAndString {
    public static void main(String[] args) {
        // String myString = "\"this is a string\"";
        // System.out.println(myString);
        // myString = myString + ", this is more.";
        // System.out.println(myString);
        // myString = myString + "\u00A9 2019";
        // System.out.println(myString);

        // String numberString = "250.55";
        // numberString = numberString + "49.95";
        // outputs 250.5549.95
        // System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        // outputs 1050.. just appending the int as text
        System.out.println(lastString);
    }
}
