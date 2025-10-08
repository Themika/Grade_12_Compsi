package Practice.TestAssignment.Class;

public class studentDemo {
    
    public static void main(String[] args) {
        studentClass student1 = new studentClass("Alice", 20, 88.5f, "S12345");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Average: " + student1.getAverage());
        System.out.println("Student ID: " + student1.getStudentID());
    }
}
    

