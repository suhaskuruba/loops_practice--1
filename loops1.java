import java.util.*;

public class loops1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // sum of first n natural numbers;

        // we are printing out the statement first;
        System.out.print("Enter the required number: ");

        // we are inputting the required n numbers value;
        int n = sc.nextInt();

        // we will define the sum variable and declare the value
        int sum = 0;

        // applying the loop and condition and updation specifying,
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // table of numbers;

        // we are stating the output
        System.out.print("enter the number: ");

        // inputting the number
        int n1 = sc.nextInt();

        // applying the loop;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + "*" + i + "=" + (n * i));
        }

    }
}
