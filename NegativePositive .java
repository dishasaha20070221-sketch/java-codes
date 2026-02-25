class NegativePositive {

    int num;

    void check() {
        if (num > 0) {
            System.out.println("Number is Positive");
        } 
        else if (num < 0) {
            System.out.println("Number is Negative");
        } 
        else {
            System.out.println("Number is Zero");
        }
    }

    public static void main(String[] args) {
        NegativePositive obj = new NegativePositive();
        obj.num = 7;
        obj.check();
    }
}