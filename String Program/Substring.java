public class Substring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = 1; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (temp.indexOf(ch) == -1) {
                    break;
            }
            temp += ch;

            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }
        System.out.println("Substring : " + longest);
        System.out.println("Length : " + longest.length());
    }
}
}