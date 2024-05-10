package pratica.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int target = 100;

        for(int i = 0; n1 < target; i++) {
            System.out.println(n1);
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
