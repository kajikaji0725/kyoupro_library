import java.util.Scanner;

class main2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        int c = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c = a[i + 1] + 2;
            if (c < a[i + 2]) {
                flag = false;
                System.out.println("No");
                break;
            }
            if (a[i] < a[i + 1]) {
                a[i + 1] = a[i + 1] - 1;
            }
        }
        if (flag == true)
            System.out.println("Yes");
    }
}