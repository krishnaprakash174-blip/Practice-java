public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println("Welcome to the World");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int c = 50;
        c += 10;
        System.out.println(c);
        c -= 5;
        System.out.println(c);
        c *= 3;
        System.out.println(c);

        int d = 21;
        int e = 20;
        System.out.println(d<e);
        System.out.println(d>e);
        System.out.println(d==e);
        System.out.println(d!=e);
        System.out.println(d>=e);
        System.out.println(d<=e);

        boolean studied = true;
        boolean land = true;
        boolean gold = false;
        System.out.println(studied || land || gold);
        System.out.println(studied && land);

        if(studied && land && gold) {
            System.out.println("I wil marry her");
        }
        else if(studied && land || gold) {
            System.out.println("Marry her it's ok");
        }
        else {
            System.out.println("I will marry her");
        }

        String email = "abcd@gmail.com";
        String pwd = "123";
        if(email.equals("abcd@gmail.com") && pwd.equals("123")) {
            System.out.println("logined");
        }
        else {
            System.out.println("not login");
        }
    }
}
