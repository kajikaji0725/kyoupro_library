import java.util.Scanner;

class C_XYZ_Triplets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans[] = new long[10001];

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                for (int z = 1; z <= 100; z++) {
                    if (i * i + j * j + z * z + i * j + j * z + i * z < 10000)
                        continue;
                    ans[i * i + j * j + z * z + i * j + j * z + i * z]++;
                }
            }
        }

        for (int i = 1; i <= n; i++)
            System.out.println(ans[i]);
    }
}