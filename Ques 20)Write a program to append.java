//Ques 20)Write a program to append data into a file.
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendExample {
    public static void main(String[] args) {
        try {
            // Source file path
            String filePath = "interd.md"; // Replace with the actual file path

            // String to append
            String dataToAppend = "\nLearning C programming at Codeforwin is simple and easy.";

            // Create FileWriter object with append mode
            FileWriter writer = new FileWriter(filePath, true);

            // Append data to the file
            writer.append(dataToAppend);

            // Close the FileWriter object
            writer.close();

            System.out.println("Data appended to the file successfully.");

        } catch (IOException e) {
            System.out.println("Error: Unable to append data to the file.");
            e.printStackTrace();
        }
    }
}