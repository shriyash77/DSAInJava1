import java.util.*;

public class variablearguments {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    //we doesnt need to write this every time instead we can use variableargments
    static int sum(int ...arr){ // ...arr means store every element in array
        // ...arr behaves like int arr[]
        int value = 0;
        for(int i: arr){ //for i in arr
            value += i;
        }
        return value;
    }
    public static void main(String[] args) {
        System.out.println("the sum of 2 and 5 is :" + sum(2, 5));
        System.out.println("the sum of 2, 7 and 5 is :" + sum(2, 7, 5));
        System.out.println("the sum of 2, 8, 9 and 5 is :" + sum(2, 8, 9, 5));
    }
}
