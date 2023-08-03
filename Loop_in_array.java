public class Loop_in_array {
    public static void main(String[] args) {
        //For loop:
        int[] marks = {67,98,75,73,37};
        System.out.println("printing using for loop");
        for (int i=marks.length-1;i>=0; i--){
            System.out.println(marks[i]);
        }

        //For-Each loop:
        System.out.println("printing using for-each loop");
        for (int element: marks){
            System.out.println(element);
        }
    }
}
