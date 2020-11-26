import java.util.Scanner;
import java.util.Arrays;

class B_Flip_Digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S[] = new int[N];
        int T[] = new int[N];
        String s1 = sc.next();
        String t1 = sc.next();

        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(s.substring(i, i + 1));
            T[i] = Integer.parseInt(t.substring(i, i + 1));
        }
        Change(s1, t1, N);
    }

    static void Change(String s, String t, int n) {
        int count = 0;
        int A[] = new int[n];
        A[0] = 1;
        int cheak[] = new int[n];
        while (true) {
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == 1) {
                     = 0;
                    if (s[i - 1] == 1)
                        s[i - 1] = 0;
                    else
                        s[i - 1] = 1;
                    count++;
                }
                if (count == 0)
                    continue;
                if (Arrays.equals(s, t)) {
                    System.out.println(count);
                    System.exit(1);
                }
                if (Arrays.equals(A, s) || Arrays.equals(cheak, s)) {
                    System.out.println(-1);
                    System.exit(1);
                }
            }
        }
    }
}