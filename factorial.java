class Factorial {
    int num;
    Factorial(int n){
        num=n;
    }
    int Fact(){
        int f = 1;
        for(int i = 1;i<=num;i++){
            f=f*i;
        }
        return f;
    }
    public static void main (String args[]){
        Factorial obj = new Factorial(5);
        int result = obj.Fact();
        System.out.println("factorial is:"+result);
    }
}
