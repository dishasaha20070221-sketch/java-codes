class Outer{
    int x = 5;
    class Inner{
        void display(){
            System.out.println("value of x is:"+ x);
        }
    }
    public static void main(String args[]){
    Outer obj = new Outer();
    Outer.Inner in = obj.new Inner();
    in.display();
    }
}
