public class StringRotation {
    public static boolean stringRotation(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        String compound = s1 + s1;
        return compound.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewar";
        System.out.println(stringRotation(s1, s2));
    }
}
