public class Recursion {
    public static void main(String[] args) {
        String fullName = "kent nicholas lope dela cruz";
        removeLetter(fullName);
    }
    static void removeLetter(String str) {
        System.out.println(Recurse(str));
    }
    
    public static String Recurse(String str){
        
        if (str.length() == 0) {
            return str;
        }

        char c = str.charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == ' ') {
            return c + Recurse(str.substring(1));
        } else {
            return Recurse(str.substring(1));
        }
    }
}