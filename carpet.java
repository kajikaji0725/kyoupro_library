import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class carpet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            a[i] = 1;
        }
        Arrays.sort(a);
        int count = 0;
        if (n == 1) {
            System.out.println(1);
            System.exit(1);
        }
        for (int i = 0; i < n; i++) {
            w = w - a[i];
            if (w >= 0)
                count++;
            else {
                System.out.println(count);
                break;
            }
        }
    }
}
