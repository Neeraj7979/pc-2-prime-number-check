package com.jap.prime;

public class PrimeCheckerImpl{
    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not
        PrimeChecker p1= number1 -> { boolean flag = false;
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0)
                    flag = false;
                else {
                    flag = true;
                }
            }
            return flag;
        };
        return p1.isPrime(number);

    }
}

