//Write a method to replace all the spaces in a string with ‘%20’. You may assume that the string has sufficient space at the end to hold the additional characters and that you are given the “true” length of the string
//(Note: if implementing in java, please use a character array so that you can perform this operation in place.)
public class URLify {
    public static void urlify(String s, int length){
        char[] charArray = s.toCharArray();
        int left = length - 1;
        int arrayPointer= s.length() - 1;
        while(left >= 0 && arrayPointer >= 0){
            if (charArray[left] != ' '){
                charArray[arrayPointer--] =  charArray[left--];
            }
            else{
                left--;
                charArray[arrayPointer--] = '%';
                charArray[arrayPointer--] = '0';
                charArray[arrayPointer--] = '2';
            }
        }
        System.out.println(String.valueOf(charArray));
    }

    public static void main(String[] args) {
        String s = "";
        urlify(s, 0);
//        System.out.println(urlify(s, 13));
    }
}
