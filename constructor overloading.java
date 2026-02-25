class Student{
    String Name;
    int Age;
    Student(){
        Name="kiya";
        Age=0;
    }
    Student(String n){
        Name=n;
        Age=0;
    }
    Student(String n,int a){
        Name=n;
        Age=a;
    }
    void display(){
        System.out.println("Name:"+Name+",Age:"+Age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("disha");
        Student s3 = new Student("disha",20);
        s1.display();
        s2.display();
        s3.display();
        
    }
    
}
