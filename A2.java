package tools.mathops;

class Karthik{
    public void showGrade(){
        A2 obj = new A2();
        System.out.println(obj.grade);
    }
}
public class A2 {
    public int marks = 90;
    protected String grade = "A";
    public void show(){
        System.out.println("in A2 show");
    }
    
}
