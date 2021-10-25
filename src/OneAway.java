public class OneAway {
    public static boolean oneAway(String s1, String s2){
        //Insert; Remove; Replace; -> one operation
        //If the difference between the lengths of the strings is > 1, then it can't be done in 1 operation
        //If both the strings are same length, make sure that they don't differ in more than one place
        //if length of String 1 is greater than length of String 2, remove 1 char, lese, insert one char
        if (Math.abs(s1.length()-s2.length()) > 1){
            return false;
        }
        int pointerOne = 0;
        int pointerTwo = 0;
        boolean diffCount = false;
        while(pointerOne < s1.length() && pointerTwo<s2.length()){
            if (s1.charAt(pointerOne) != s2.charAt(pointerTwo)){
                if (s1.length() == s2.length()){
                    return s1.substring(pointerOne).equals(s2.substring(pointerTwo));
                }
                else if (s1.length() < s2.length()){
                    return s1.substring(pointerOne).equals(s2.substring(pointerTwo + 1));
                }
                else{
                    return s1.substring(pointerOne + 1).equals(s2.substring(pointerTwo));
                }
            }
            pointerOne++;
            pointerTwo++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "bae";
        System.out.println(oneAway(s2, s1));
    }
}
