package Practice.TestAssignment.Class;

public class studentClass {
    private String name;
    private int age;
    private float average;
    private boolean isHonors;

    public studentClass(String name, int age, float average) {
        this.name = name;
        this.age = age;
        this.average = average;
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
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public float getAverage() {
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
        if(average >= 85.0) {
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
