public class twoStringMethods {

//    public static void main(String[] args) {
//        String text = "";
//        boolean result = abcTest( text );
//    }

    //--------------------------------
    // Returns true if the input String contains an “abc” not directly preceded by a dot
    public static boolean abcTest(String text) {
//        if ( text.length() >= 3 && text.substring(0, 3).equals("abc") )
        if ( text.indexOf("abc") == 0 )
            return true;

        for (int i = 0; i < text.length() - 3; i++) {
            if (!text.substring(i, i+1).equals(".") && text.substring(i+1, i+4).equals("abc"))
                return true;
        }

        return false;
    }

    //---------------------------------
    // Given two strings, str1 and str2, create an output string made of the first character of str1,
    // the first character of str2, the second character of str1, the second character of str2, and so on.
    // Any leftover characters from either String go at the end of the result.
    public static String alternateStrings( String str1, String str2 ) {
        String result = "";
        int len_max = str1.length() > str2.length() ? str1.length() : str2.length();

        for (int i = 0; i < len_max; i++) {
            String letter1 = i < str1.length() ? str1.substring(i, i+1) : "";
            String letter2 = i < str2.length() ? str2.substring(i, i+1) : "";
            result += letter1 + letter2;
        }

        return result;
    }
}
