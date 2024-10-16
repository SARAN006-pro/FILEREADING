import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Specify the file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";
        
        // Read from input file and write to output file
        try {
            // FileReader to read the input file
            FileReader reader = new FileReader(inputFilePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            // FileWriter to write to the output file
            FileWriter writer = new FileWriter(outputFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Write the content to the output file
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // For adding a new line in the output file
            }
            
            // Close the resources
            bufferedReader.close();
            bufferedWriter.close();
            
            System.out.println("File read and written successfully!");
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
