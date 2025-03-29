public class Student {
    String name;
    int rollNo;
    String dept;
    String college;

    public Student(String n,int roll,String d,String c){
        name = n;
        rollNo = roll;
        dept = d;
        college = c;
    }
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Roll no: "+this.rollNo);
        System.out.println("Dept: "+this.dept);
        System.out.println("College Name: "+this.college);
    }
    public static void main(String[] args) {
        Student s1 = new Student("P",122,"cse","rns");
        s1.display();
    }
}
