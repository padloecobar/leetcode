package com.padlo.lc.y2024;

public class LC12 {
    public static void main(String[] args) {

    }

    public static String intToRoman(int num) {
        int val = num;
        StringBuilder sb = new StringBuilder();

        char[] romans = new char[]{'M', 'M', 'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        // order 1 -> 3 -> 5

        for (int order = 1, base = 1000; order < 8; order += 2, base /= 10) {
            char _big = romans[order - 1];
            char _mid = romans[order];
            char _sm = romans[order + 1];
            int digit = val / base;
            if (digit == 0) {
                continue;
            } else if (digit < 4) {
                for (int i = 1; i <= digit; i++) {
                    sb.append(_sm); // III
                }
            } else if (digit == 4) { // IV
                sb.append(_sm).append(_mid);
            } else if (digit < 9) {
                sb.append(_mid); //500, 800->DCCC,  VIII
                for (int i = 6; i <= digit; i++) {
                    sb.append(_sm);
                }
            } else {
                sb.append(_sm).append(_big); //900->CM , IX
            }
            val = val % base;
        }

        return sb.toString();
    }
}
