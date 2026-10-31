public class StringBuf {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello Python");
        s1.append(" World");
        s1.insert(2, " World");

        s1.replace(6, 12, "java");
        s1.delete(6, 10);
        s1.deleteCharAt(1);
        StringBuffer name = new StringBuffer("Murugan");
        name.reverse();
        System.out.println(name);
        System.out.println(name.charAt(0));
        name.setCharAt(0, 'm');
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.capacity());
        System.out.println(name.substring(5));

        System.out.println(s1.indexOf("python"));
    }
}
