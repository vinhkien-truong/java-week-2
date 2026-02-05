package projects;
import java.util.Scanner;

public class arrayStats {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = 4;
            double[] arrayDouble = new double[n]; 
            int i = 0;
            double num;
            System.out.println("type "+ n +" number or type -1 to stop");
            while(i < n) {
                System.out.println("type your "+ (i+1) +" number or type -1 to stop");
                if(scanner.hasNextDouble()) {
                    num = scanner.nextDouble();
                    if (num >= 0) {
                        arrayDouble[i] = num;
                        i++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println("max : " + getMax(arrayDouble));
            System.out.println("min : " + getMin(arrayDouble));
            System.out.println("avg : " + getAvg(arrayDouble,i));
            System.out.println("sum : " + getSum(arrayDouble));
        }

        public static double getMax(double[] arrayDouble) {
            double max = arrayDouble[0];
            for (double numb : arrayDouble) {
                if (max < numb) {
                    max = numb;
                }
            }
            return max;
        }
        public static double getMin(double[] arrayDouble) {
            double min = arrayDouble[0];
            for (double numb : arrayDouble) {
                if (min > numb) {
                    min = numb;
                }
            }
            return min;
        }
        public static double getAvg(double[] arrayDouble, int size) {
            double total = 0;
            for (double numb : arrayDouble) {
                total += numb;
            }
            return (total / size);
        }
        public static double getSum(double[] arrayDouble) {
            double total = 0;
            for (double numb : arrayDouble) {
                total += numb;
            }
            return total;
        }
}
