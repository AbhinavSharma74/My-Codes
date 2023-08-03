import java.util.Scanner;
public class practice_set4 {
    public static void main(String[] args) {
        //Question 1:
        //type 1
        /*float[] arr = new float[6];
        arr[1] = 6.5f;
        arr[2] = 6.5f;
        arr[3] = 6.5f;
        arr[4] = 6.5f;
        arr[5] = 6.5f;
        float sum = arr[1] + arr[2]+ arr[3] + arr[4] + arr[5];
        System.out.println(sum);*/

        //type 2
       /* float[] arr = {44.5f, 55.5f, 22.3f, 66.7f,88.5f};
        float sum = 0;
        for (float element:arr){
            sum = sum + element;
        }
        System.out.println(sum);*/


        //Question 2: Finding an element in array
    /*float [] array = {66.5f, 33.3f, 44.4f,99.3f ,78.5f};
    Scanner s = new Scanner(System.in);
    float num = s.nextFloat();
    boolean isInArray = false;
    for (float element:array){
        if (element==num){
            isInArray = true;
            break;
        }
    }
    if (isInArray){
        System.out.println("Element is in Array");
    }
    else{
        System.out.println("Element is not in the array");
    }*/

        //Question 3: Calculating the average marks-
       /*float[] Physics = {66.5f, 33.3f, 44.4f, 99.3f, 78.5f};
        float sum = 0;
        for (float element : Physics) {
            sum = (sum + element);
        }
        System.out.println("the average of the numbers is " + sum/Physics.length);*/

    }}
