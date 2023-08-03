import java.util.Locale;

public class String_methods {
    public static void main(String[] args) {
        String name = "Abhinav";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);
        System.out.println(lstring.toUpperCase());

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String untrimmed = "     Abhinav     ";
        System.out.println(untrimmed.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(0,4));

        System.out.println(name.replace('v','b'));
        System.out.println(name.replace("nav","shek"));

        System.out.println(name.startsWith("Abhi"));
        System.out.println(name.endsWith("nav"));
        System.out.println(name.endsWith("shek"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("na"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("ab",2));
        String newString = "Congratulation";
        System.out.println(newString.lastIndexOf("ula",7));
    }
}
