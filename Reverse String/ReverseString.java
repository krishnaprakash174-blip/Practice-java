public class ReverseString {
    public static void main(String[] args) {
        // Reverse a string 
        String str1 = "hello";
        String rev = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            rev = rev + str1.charAt(i);
        }
        System.out.println("Reversed string is: " + rev);

        // Check palindrome
        String str2 = "madam";
        String rev2 = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            rev2 = rev2 + str2.charAt(i);
        }
        if (str2.equals(rev2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Count vowels
        String str3 = "hello";
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str3.length(); i++) {
            char ch = str3.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        // Count Characters
        String str4 = "java";
        System.out.println("Total characters: " + str4.length());

        // Count Lowercase and Uppercase
        String str5 = "java";
        System.out.println("Uppercase: " + str5.toUpperCase());

        // Count Words in a Sentence
        String str6 = "I love java";
        String[] words = str6.trim().split("\\s+");
        System.out.println("Total words: " + words.length);

        // Remove Spaces
        String str7 = "ja va code";
        String result = str7.replace(" ", "");
        System.out.println("After removing spaces: " + result);

        // Count Specific Character
        String str8 = "banana";
        char ch = 'a';
        int count = 0;

        for (int i = 0; i < str8.length(); i++) {
            if (str8.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Character Count: " + count);

        // Compare Two Strings
        String str9 = "java";
        String str10 = "java";
        System.out.println(str10.equals(str10));

        // Remove Duplicate Characters
        // String str11 = "programming";
        // String result1 = "";
        // for (int i = 0; i < str11.length(); i++) {
        //     char ch = str11.charAt(i);
            
        //     if (result1.indexOf(ch) == -1) {
        //         result1 += ch;
        //     }
        // }
        // System.out.println("After removing duplicates: " + result1);
    }
}