package com.prachauhan.problem.solving.two;

public class AlgoPractice {
    public static void main(String[] args) {
        System.out.println("hello world");
        if (args.length == 0) {
            System.out.println("No args provided");
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        if (num1 == num2 && num2 == num3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        System.out.println("########");
//        Q-2
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
        
        System.out.println("########");
//        Q-3
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
            System.out.printf("%.5f\n", t);
        }
        
        System.out.println("########");
//        Q-4
        System.out.println((char) ('B' + 4));
        
        System.out.println("########");
//        Q-5
        int N = 13;
        String s = "";
        while (N > 0) {
            s += N % 2;
            N /= 2;
        }
        System.out.println(s);
        
        System.out.println("########");
//        Q-6
        int arr[][] = {{1, 0, 1}, {0, 1, 0}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println(" ");
        }
        
        System.out.println("########");
//        Q-7
        int arr1[][] = {{1, 0}, {0, 0}, {0, 1}}; //3*2
        int n = arr1[0].length;
        int m = arr1.length;
        int arr1T[][] = new int[n][m];//2*3
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1T[i][j] = arr1[j][i];
                System.out.print(arr1T[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("########");
//        Q-7
        System.out.println(lg(64)-1);
    
        System.out.println("########");
//        Q-8
        System.out.println(exR1(6));

    }
    
    //        Q-7
    public static int lg(int N) {
        int logval = (N > 1 ? 1+lg(N / 2) : 0);
        return logval;
    }
    
//    Q-8
    public static String exR1(int n)
    {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
}
