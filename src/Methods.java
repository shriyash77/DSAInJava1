public class Methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = (x + y) * 5;
        } else {
            z = (x + y) / 5;
        }

        return z;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        int c = logic(a, b);
        System.out.println(c);
    }
}
