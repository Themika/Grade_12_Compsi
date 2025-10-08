package Practice.TestAssignment.Class;

public class studentClass {
    private String name;
    private int age;
    private float average;
    private boolean isHonors;
    private float[] grades;

    public studentClass(String name, int age, float average,float[] grades) {
        this.name = name;
        this.age = age;
        this.average = average;
        this.grades = grades;
    }
    
    public static void printInfo(studentClass student) {
        System.out.println("Name: " + student.getName() 
        + ", Age: " + student.getAge() 
        + ", Average: " + student.getAverage() 
        + ", Honors: " + student.isHonors());
    }
    public String getName() {
        if(name == null || name.isEmpty()) {
            name = "Unknown";
        }
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age<0){
            System.out.println("Age cannot be negative. Setting age to 0.");
            age = 0;
        }
        if(age>100){
            System.out.println("Age seems unrealistic. Setting age to 100.");
            age = 100;
        }
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public float getAverage() {
        float temp = 0.0f;
        for(int i = 0; i < grades.length; i++) {
            temp += grades[i];
        }
        average = temp / (100*grades.length);
        average = average * 100;
        if(average < 0.0f || average > 100.0f) {
            System.out.println("Average must be between 0 and 100. Setting average to 0.");
            average = 0.0f;
        }
        return average;
    }
    public void setAverage(float average) {
        this.average = average;
    }

    public boolean isHonors() {
        System.out.println(grades.length);
        float temp = 0.0f;
        for(int i = 0; i < grades.length; i++) {
            temp += grades[i];
        }
        if(temp / (grades.length * 100) >= 0.85f) {
            isHonors = true;
        } else {
            isHonors = false;
        }
        return isHonors;
    }
    public void setHonors(boolean isHonors) {
        this.isHonors = isHonors;
    }
    
}
