public class method_Overloading {
    static void foo(){
        System.out.println("Hello bro");
    }

    static void foo(int a){
        System.out.println("Happy birthday " + a + " bro");
    }
    static void foo(int a, int b){ // Parameters(Int a , int b are parameters_)
        System.out.println("Love you " + a + " bro");
        System.out.println("Love you " + b + " bro");
    }
    /*static void tellTruth(){
        System.out.println("Aaj phir chutti marli college ki\n" + " -Bhot bdhiya");
    }

    public static void main(String[] args) {
        tellTruth();
    }
}*/
    static void Pt(){
        System.out.println("Monday ko jana jaruri hai\n"+ "-Guddu Pandit");
    }

    public static void main(String[] args) {
        Pt();
        foo();
        foo(3000);
        foo(3000,4000);
        //Arguments are actual! (3000,4000 are arguments)
}}
