import java.util.Scanner;
public class num_1_to_n {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Numbers 1 to " + n + " are as follows:");
        for(int num = 1; num <= n; num++){
            System.out.println(num);
        }
    }
}
