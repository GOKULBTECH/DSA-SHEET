// Find the Factorial of a large number 


import java.math.BigInteger;
import java.util.Scanner;

public class Problem5 {
    static BigInteger factorial(int n){
        if(n == 1)  return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
        sc.close();
    }

}

// Input: 100 
// Output: 
// 933262154439441526816992388562667004907159682643816214685929638952175999932299
//  156089414639761565182862536979208272237582511852109168640000000000000000000000
//  00 

// Time complexity : O(n**2);
// Space Complexity : O(1);

