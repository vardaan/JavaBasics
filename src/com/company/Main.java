package com.company;

import com.company.helper.CommonUtils;
import com.company.helper.StdOut;
import com.company.helper.Stopwatch;

public class Main {
    public static final int ONE_MILLION = 1000000;

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        for (int i = 0; i < ONE_MILLION; i++)
            CommonUtils.isPrime(i);
        StdOut.print(CommonUtils.isPrime(11) + "");
        StdOut.print(stopwatch.elapsedTime());

    }


}
