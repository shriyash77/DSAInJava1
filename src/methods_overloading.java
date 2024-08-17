public class methods_overloading {
    static void foo(){
        System.out.println("Hello World");
    }
    static void foo(int a){
        System.out.println("Hello World" + a);
    }
    static void foo(int a, int b){
        System.out.println("Hello World" + a + b); //here a and b are parameters
    }
    public static void main(String[] args){
        foo();
        foo(10);
        foo(10, 20); // 10 and 20 are arguments
        // Arguments are actual
    }
}
