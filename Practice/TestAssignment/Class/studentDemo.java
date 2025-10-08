package Practice.TestAssignment.Class;

public class studentDemo {
    
    public static void main(String[] args) {
        studentClass themika = new studentClass("Alice", 20, 88.5f, new float[]{90.0f, 95.5f, 97.0f, 92.0f, 98.5f});
        themika.setName("Themika");
        themika.setAge(17);
        themika.setAverage(97.0f);
        studentClass.printInfo(themika);
    }
}
    

