class Maximum {
    int a, b, c;
    Maximum(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }
    void max() {
        if (a >= b && a >= c) {
            System.out.println("Maximum is " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Maximum is " + b);
        } 
        else {
            System.out.println("Maximum is " + c);
        }
    }

    public static void main(String[] args) {
        Maximum obj = new Maximum(5, 9, 3);
        obj.max();
    }
}