public class Count {
    public static void main(String[] args) {
        String str = "java code java";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals("")) {
                continue;
            }

            if(str.substring(0, str.indexOf(words[i])).contains(words[i])) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                }
            }
            System.out.println(words[i] + " = " + count);
        }
    }
}
