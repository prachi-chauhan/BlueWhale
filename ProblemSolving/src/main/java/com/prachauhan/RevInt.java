package com.prachauhan;

public class RevInt {
    int num_digits;
    int res;
    
    public int reverse(int x) {
        int temp = x;
        while (Math.abs(temp) > 0) {
            temp /= 10;
            num_digits++;
        }
        while (num_digits > 0) {
            res = (int) (res + ((x % 10) * Math.pow(10, (num_digits - 1))));
            x = x / 10;
            num_digits--;
        }
        if (res < Integer.MAX_VALUE && res > Integer.MIN_VALUE) {
            return res;
        } else
            return 0;
    }
}
