public class VariableArguments {
    /*static void tellTruth() {
        System.out.println("Tomorrow will be holiday!\n" + "-Dean A");
    }*/
    static int sum(int x , int ...arr) {
        int answer = x;
        for (int a : arr) {
            answer += a;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("The value of answer is :" + sum(3,4,5,3));
    }

   // public static void main(String[] args) {
     //   tellTruth();


    }
