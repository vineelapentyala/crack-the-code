public class StringCompression {
    public static String stringCompression(String s){
        if (s.length()== 0) return "";
        int leftPointer = 0;
        int rightPointer = 0;
        StringBuilder sb = new StringBuilder();
        while(rightPointer < s.length()){
            if (s.charAt(leftPointer) != s.charAt(rightPointer)){
                sb.append(s.charAt(leftPointer) +""+ (rightPointer - leftPointer));
                leftPointer = rightPointer;
            }
            rightPointer++;
        }
        sb.append(s.charAt(leftPointer)+ "" +(rightPointer - leftPointer));

        return sb.length() < s.length() ? sb.toString() : s;
    }

    public static void main(String[] args) {
        String s = "abcc";
        System.out.println(stringCompression(s));
    }
}
