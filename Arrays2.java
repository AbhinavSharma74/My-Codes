public class Arrays2 {
    public static void main(String[] args) {
        int[] marks = {78,89,45,69,56};
        System.out.println(marks.length);
        String[] students = {"abhinav", "guddu", "sharma", "college"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);}

        System.out.println("==========================");
        int[] roll_nos = {02,03,04,05,06};
        System.out.println(roll_nos.length);
        System.out.println(roll_nos[2]);
        System.out.println("==========================");
        for (int i=0; i<roll_nos.length; i++){
            System.out.println(roll_nos[i]);
        }
    }
}