public class CharBoolean {
    public static void main(String[] args) {
        // this errors out, can't store 2 characters
        // char myChar = 'DA';
        char myChar2 = 'D';
        char myUnicode = '\u0044';
        char myUnicode2 = '\u00A9';
        // System.out.println(myChar2);
        // System.out.println(myUnicode);
        // System.out.println(myUnicode2);

        boolean myTrueBool = true;
        boolean myFalseBool = false;
        System.out.println(myTrueBool);
        System.out.println(myFalseBool);
        boolean isCustOverTwentyOne = true;
        System.out.println(isCustOverTwentyOne);
    }
}
