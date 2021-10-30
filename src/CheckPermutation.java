public class CheckPermutation {
    //"abc", "acb"; "abcd", "abc"; "abcd", "abce"; "","";

    public static boolean checkPermutation(String s1, String s2){
        if (s1 == null || s2 == null) throw new IllegalArgumentException("Null inputs are invalid");
        if (s1.length() != s2.length()){
            return false;
        }
        int[] numOfChars = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            int val1 = s1.charAt(i);
            int val2 = s2.charAt(i);
            numOfChars[val1]++;
            numOfChars[val2]--;
        }
        for (int i = 0; i < 128; i++){
            if (numOfChars[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        System.out.println(checkPermutation(s1, s2));
    }
}
