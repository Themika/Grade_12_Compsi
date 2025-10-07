package Practice.TestAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.FileReader;

public class readFileData {
    public static void main(String[] args) {
        String directoryPath = "Practice\\TestAssignment";
        try {
            File directory = new File(directoryPath);
            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".txt");
                }
            };
            File[] files = directory.listFiles(filter);
            if (files != null) {
                for (File f : files) {
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    String line = "";
                    int lineCount = 0;
                    while ((line = br.readLine()) != null) {
                        lineCount++;
                    }
                    br.close();
                    System.out.println("File: " + f.getName() + ", Line count: " + lineCount);
                }
            }

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
