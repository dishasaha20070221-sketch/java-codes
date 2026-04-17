class DivisionExample {
    public static void main(String[] args) {
        int num = 10;   
        int den = 5;   

        try {
            int result = num / den;
            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
