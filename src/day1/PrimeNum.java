package day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNum {

    static boolean checkPrime(int num) {

        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // divisible by another number
            }
        }
        return true;
    }


    public static void main(String[] args){
        try{

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter any Number:  ");
            int num = Integer.parseInt(br.readLine());


if(checkPrime(num)){
    System.out.println("The given number "+num+" is prime...");
}
else{
    System.out.println("The given number "+num+" is not prime...");
}

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    }

//why this i <= Math.sqrt(num) and not i<=num for checking prime num explain the logic
//
//for (int i = 2; i <= Math.sqrt(num); i++)
//instead of:
//for (int i = 2; i <= num; i++)
//
//---->Improves performance from O(n) to O(√n)


