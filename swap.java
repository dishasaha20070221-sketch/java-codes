class Swap {
    int num;
    Swap(int x) {
        num = x;
    }
    void swap(Swap obj1, Swap obj2) {
        int temp;
        temp = obj1.num;
        obj1.num = obj2.num;
        obj2.num = temp;
    }

    void display() {
        System.out.println(num);
    }

    public static void main(String[] args) {

        Swap s1 = new Swap(10);
        Swap s2 = new Swap(20);
        Swap s = new Swap(0);

        s.swap(s1, s2);

        System.out.println("After Swapping:");

        s1.display();
        s2.display();
    }
}