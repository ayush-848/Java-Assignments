import java.util.*;

public class file {
    public static void main(String[] args) {
        String inputFileName = "abc.txt";
        String outputFileName = "output.txt";
        int sum = 0;
        double average = 0.0;
        List<Integer> list = FileProcessing.readFile(inputFileName);

        if (list.isEmpty()) {
            System.out.println("The file is empty or corrupted");
            return;
        }else{
            sum=findSum(list);
            average=findAverage(list,sum);
        }

        FileProcessing.writeFile(outputFileName, sum,average);
    }
    private static int findSum(List<Integer>list){
        int sum=0;
       for (int i:list){
           sum+=i;
       }
        return sum;
    }

    private static double findAverage(List<Integer>list, int sum){
        if(sum==0){
            return 0.0;
        }else{
            return (double) sum/list.size();
        }
    }
}