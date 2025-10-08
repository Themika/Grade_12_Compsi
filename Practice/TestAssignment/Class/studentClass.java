package Practice.TestAssignment.Class;

public class studentClass {
    private String name;
    private int age;
    private float average;
    private String studentID;

    public studentClass(String name, int age, float average, String studentID) {
        this.name = name;
        this.age = age;
        this.average = average;
        this.studentID = studentID;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getStudentID() {
        return studentID;
    }
    public float getAverage() {
        return average;
    }
}
