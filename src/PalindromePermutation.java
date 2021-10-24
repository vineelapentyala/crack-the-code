import java.util.Set;
import java.util.HashSet;
public class PalindromePermutation {
    //Hash implementation
    //ask about spaces
    //ask about cases
    public static boolean palindromePermutation(String s){
        Set<Character> charsInString = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            char thisChar = Character.toLowerCase(s.charAt(i));
            if (thisChar != ' ') { //ask the interviewer about spaces
                if (charsInString.contains(thisChar)) {
                    charsInString.remove(thisChar);
                } else {
                    charsInString.add(thisChar);
                }
            }
        }
        return charsInString.size()<=1;
    }

    public static void main(String[] args) {
        String s = "Tact Cob";
        System.out.println(palindromePermutation(s));
    }

}
