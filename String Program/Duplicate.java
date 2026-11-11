public class Duplicate {
    public static void main(String [] args) {
        String str = "java is java easy";
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if(!result.contains(words[i])) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += words[i];
            }
        }
        System.out.println(result);
    }    
}
