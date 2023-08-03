public class Strings_SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(2));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //Inserting
        sb.insert(2,'n');
        System.out.println(sb);

        //Deleting the extra n
        sb.delete(2,3);
        System.out.println(sb);


    }
}
