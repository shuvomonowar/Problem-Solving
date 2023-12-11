package Platform.Codeforces;

import java.util.Scanner;

import java.lang.Math;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, l, c, d, p, nl, np;
        n = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = sc.nextInt();
        nl = sc.nextInt();
        np = sc.nextInt();

        int kl = k*l, cd = c*d;
        int cwd = kl/nl, cws = p/np;

        int res = (Math.min(Math.min(cwd, cws), cd)) / n;

        System.out.println(res);
    }
}
