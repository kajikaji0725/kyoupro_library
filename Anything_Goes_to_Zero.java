import java.util.Scanner;

public class Anything_Goes_to_Zero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int count = 0, ama = 0, count2 = 1, count3 = 0;
        long d = 0;

        String baibai = sc.next();
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(baibai.substring(i, i + 1));
            if (baibai.substring(i, i + 1) == "1")
                count3++;
        }
        if (count3 == n) {
            for (int i = 0; i < n; i++) {
                System.out.println(0);
            }
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            count2 = 0;
            count = 0;
            x[i] = con(x, i);
            for (int j = 0; j < n; j++) {
                if (x[j] == 1) {
                    d = d + (long) Math.pow(2, (x.length - 1 - j));
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(0);
                x[i] = con(x, i);
                continue;
            }
            if (count == 1) {
                System.out.println(1);
                x[i] = con(x, i);
                continue;
            }
            ama = (int) d % count;
            if (ama == 0) {
                System.out.println(1);
                x[i] = con(x, i);
                continue;
            }
            if (ama == 1) {
                System.out.println(2);
                x[i] = con(x, i);
                continue;
            }
            count2++;
            while (true) {
                ama = ama % bai(ama);
                if (ama == 0)
                    break;
                else
                    count2++;
            }
            x[i] = con(x, i);
            System.out.println(count2);
        }
    }

    static int bai(int i) {
        int count = 0;
        while (i >= 2) {
            if (i % 2 == 1)
                count++;
            i = i / 2;
        }
        if (i == 1)
            count++;
        return count;
    }

    static int con(int x[], int i) {
        if (x[i] == 1)
            x[i] = 0;
        else
            x[i] = 1;
        return x[i];
    }
}
