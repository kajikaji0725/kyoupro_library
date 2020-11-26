import java.util.Scanner;

public class A_ReLU {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0)
            System.out.println(0);
        else
            System.out.println(x);
    }
}
