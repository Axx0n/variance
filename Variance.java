
import java.util.ArrayList;

public class Variance {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int number : list) {
            sum += number;
        }
        return sum;
    }
    
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        double average = (double) sum / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double average = average(list);
        double helperSum = 0;
        for(double number : list) {
            helperSum += (number - average) * (number - average);
        }            
        double variance = helperSum / (list.size() - 1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The sum is: " + sum(list));
        System.out.println("The average is: " + average(list));
        System.out.println("The variance is: " + variance(list));
    }

}
