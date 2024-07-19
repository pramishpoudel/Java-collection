import java.util.Scanner;
public class DataFlowExample {

    public static void main(String[] args) {
        // Start
        System.out.println("Start");

        // Receive Input
        String input = receiveInput();
        System.out.println("Received Input: " + input);

        // Process Data
        String processedData = processData(input);
        System.out.println("Processed Data: " + processedData);

        // Generate Output
        generateOutput(processedData);

        // End
        System.out.println("End");
    }

    // Method to receive input
    public static String receiveInput() {
        // Simulating receiving input
        return "Sample Input Data";
    }

    // Method to process data
    public static String processData(String data) {
        // Simulating data processing
        return data.toUpperCase();
    }

    // Method to generate output
    public static void generateOutput(String data) {
        // Simulating generating output
        System.out.println("Generated Output: " + data);
    }
}
