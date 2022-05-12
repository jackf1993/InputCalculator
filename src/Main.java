/* author: Jack Farah
 * level: Easy
 * description: user inputs desired integers, and the program prints out the average and the sum
 *              of the entered numbers.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintAverageAndSum();
    }

    public static void inputThenPrintAverageAndSum(){
        System.out.println("Enter Integers(press any Character to end): ");
        Scanner input = new Scanner(System.in);
        int average =0;
        int sum =0;
        int count = 0;
        boolean first = true;

        while(true){
            boolean isAnInt = input.hasNextInt();

            if(first){
                first = false;
                if(!isAnInt){
                    break;
                }
            }
            if (isAnInt) {
                int in = input.nextInt();
                sum += in;
                count++;
            }
            else{
                average = (int)Math.round(sum/count);
                break;
            }
        }

        System.out.println("Sum: "+sum+", Average: "+average);
        input.close();
    }
}
