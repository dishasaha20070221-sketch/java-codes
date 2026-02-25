class Fibonacci {
    int n;
    Fibonacci(int x) {
        n = x;
    }
    void show() {

        int a = 0, b = 1, c;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) { 
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci(7);
        f.show();
    }
}