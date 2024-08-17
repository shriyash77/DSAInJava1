public class problemsOnMethods {
    static int fibi(int n){
        if(n==1){
            return 0;
        } else if(n==2) return 1;
        return fibi(n-1) + fibi(n-2);

    }
    static int sumRec(int n){
    if(n==1) return 1;
    return n + sumRec(n-1);
    }
    static void patternPrinting1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d x %d = %d\n" , n , i , n*i );
        }
    }
    public static void main(String[] args) {
        //1.table of number n
        //multiplication(4);

        //2.pattern printing
        //patternPrinting1(5);

        //3.sum of n natural numbers using recursion
        //System.out.println(sumRec(5));

        // 4.fibinnachi series
        System.out.println(fibi(5));

    }
}
