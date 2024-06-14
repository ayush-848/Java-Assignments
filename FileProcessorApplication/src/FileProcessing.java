import java.io.*;
import java.util.*;

public class FileProcessing {
    public static List<Integer> readFile(String fileName) {
        List<Integer> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                try{
                    int a=Integer.parseInt(line);
                    words.add(a);
                }catch(NumberFormatException e){
                    return new ArrayList<>();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
            return new ArrayList<>(); // Return an empty list if an exception occurs
        }
        return words;
    }

    public static void writeFile(String fileName, int sum, double average) {
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("The sum of the numbers is = " + sum + "\n");
            bufferedWriter.write("The average is = " + average + "\n");
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}