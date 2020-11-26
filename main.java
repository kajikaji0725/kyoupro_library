import java.util.Scanner;

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double y = 100;
        int count = 0;
        while (true) {
            count++;
            y = Math.floor(y * 1.01);
            if (y >= X) {
                System.out.println(count);
                break;
            }
        }
    }
}