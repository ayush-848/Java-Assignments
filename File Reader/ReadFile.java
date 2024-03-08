import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

    // Function to count the occurence of a given character from a given String
    static int count_character(String s, char ch){
         int count=0;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
         }return count;
    }

    public static void main(String[] args) throws Exception {
        String line;
        int full_stop_count=0, semicol_count=0, comma_count = 0, count = 0;
        String[] words = new String[0];

        // Provide the absolute path to the file located on the D drive
        String filePath = "D:\\lorem.txt";


        // Opens a file in read mode
        FileReader file = new FileReader(filePath);
        BufferedReader br = new BufferedReader(file);

        // Gets each line till end of file is reached
        while ((line = br.readLine()) != null) {

        // Splits each line into words
            words = line.split(" ");

        // Counts each word
            count += words.length;
        }

        // Getting the frequency of occurence of the required characters
        for (String i : words){
            comma_count = comma_count + count_character(i,',');
            full_stop_count = full_stop_count + count_character(i,'.');
            semicol_count = semicol_count + count_character(i,';');

        }

        System.out.println("\n\n");
        System.out.println("Number of words present in given file: " + count);
        System.out.println("Number of commas (,) present in given file: " + comma_count);
        System.out.println("Number of semi-colons (;) present in given file: " + semicol_count);
        System.out.println("Number of full-stops (.) present in given file: " + full_stop_count);

        br.close();
    }
}