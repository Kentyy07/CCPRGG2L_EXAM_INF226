public class Recursion1 {
    public static void main(String[] args) {
        String fullName = "kent nicholas dela cruz";
        removeLetter(fullName, 0);
    }

    static void removeLetter(String str, int index) {
        if(index == str.length()) {
            return;
        }

        char ch = str.charAt(index);
        if(ch == 'k' || ch == 'n' || ch == 't' || ch == 'c' || ch == 'h' || ch == 'l' || ch == 's' || ch == 'd' || ch == 'r' || ch == 'z') {
            str = str.substring(0, index) + str.substring(index + 1);
            removeLetter(str, index);
        } else {
            removeLetter(str, index + 1);
        }
        System.out.println(str);
    }
}