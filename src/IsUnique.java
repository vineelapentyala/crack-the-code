import java.util.Set;
import java.util.HashSet;
public class IsUnique {
    //using a hash
    public static boolean isUnique(String s){
        Set<Character> charactersInString = new HashSet<>();
//        check for null value
        if (s == null) throw new IllegalArgumentException("Null values are invalid inputs");
        for (int i = 0; i < s.length(); i++){
            Character thisChar = s.charAt(i);
            if (charactersInString.contains(thisChar)){
                return false;
            }
            charactersInString.add(thisChar);
        }
        return true;
    }

    //using no additional data structures
    //a more optimal method might be to sort the string in place and check if any two adjacent chars are same.
    public static boolean isUniqueNoAdditionalDS(String s){
        if (s == null) throw new IllegalArgumentException("Null values are invalid inputs");
        for (int i = 0; i < s.length()-1; i++){
            Character thisChar = s.charAt(i);
            for (int j = i+1; j < s.length(); j++ ){
                if (thisChar == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "abcdefgg";
        String s3 = "a";
        String s4 = "adbceefgh";
        String s5 = "";
        System.out.println(isUnique(s1));
        System.out.println(isUniqueNoAdditionalDS(s1));
        System.out.println(isUnique(s2));
        System.out.println(isUniqueNoAdditionalDS(s2));
        System.out.println(isUnique(s3));
        System.out.println(isUniqueNoAdditionalDS(s3));
        System.out.println(isUnique(s5));
        System.out.println(isUniqueNoAdditionalDS(s5));
        System.out.println(isUnique(s4));
        System.out.println(isUniqueNoAdditionalDS(s4));
    }
}
