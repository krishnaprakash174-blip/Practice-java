import java.util.Arrays;

public class StringMethods {
     void main() {
        String s = "Java Programming";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String a = "Java Programming";
        String b = "one";
        System.out.println(a == b);
        String c = new String("a");
        String d = new String("A");
        System.out.println(c.equals(d));
        System.out.println(c.equalsIgnoreCase(d));
        System.out.println(s.contains("Java"));
        System.out.println(s.startsWith("Java"));
        System.out.println(s.endsWith("g"));
        System.out.println(s.indexOf("a", 5));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.substring(0, 5).length());
        System.out.println(s.replace("Java", "Python"));
        
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(s.trim());
        System.out.println(s.strip());
        String word1 = "Hello";
        String word2 = "Developer";
        System.out.println(s.concat(word1.concat(word2)));
        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());
        System.out.println(s.compareTo(a));
        String m = "12345678sadreE";
        System.out.println(m.matches("[0-9]+[a-z]+[A-Z]"));
        String[]word = {"one", "two", "three", "four"};
        System.out.println("".join("-", word));
        int age = 50;
        String convert = "".valueOf(age);
        System.out.println(convert);
        System.out.println(convert.getClass());
        System.out.println(word.getClass());

        String sentence = "hello";
        char[] arr = sentence.toCharArray();

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        String name = "murugan developer";
        int ages = 15;
        System.out.println("Name is :%s Age is %s".formatted(name, ages));
        System.out.println(name.trim().toUpperCase().replace(" ", "_"));

        String names = "ajay,ganesh, suresh kumar, ramesh kumar, krishna prakash, madam";
        String[] values = names.split(",");

        for (String v : values) {
            if(v.contains("kumar")) {
                System.out.println(v);
            }
        String reversedAns = "";

        for (int i = v.length() -1; i >= 0; i--) {
            reversedAns += v.charAt(i);
        }

        if(v.equals(reversedAns)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
        }

        String let = "madam";
        System.out.println(let.charAt(0));

        int[] num = {20,85,69,96,32,45,754,124,96,36,25,85,536};
        int max=num[0];
        int smax=num[0];
        for(int n:num) {
            if(n>max) {
                smax=max;
                max=n;
            }
            else if(n>smax && smax!=max) {
                smax=n;
            }
        }
        System.out.println(smax);

        String[] sentences = {"All the best", "better luck next time", "Don't Lose your hope", "Time is gold"};

        for(String k:sentences) {
            System.out.println(k.length());
        }
    }
}
