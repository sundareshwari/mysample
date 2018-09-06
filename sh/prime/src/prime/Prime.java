/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
 class Prime {
 public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter no");
     int n=s.nextInt();
     if(x(n)){
         System.out.println(n+ "is a prime number" );  
     }
     else{
         System.out.println(n+ "is not a prime number" );  
     }
    }
    public static boolean x(int n){
        if (n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
        return true;
    }
}
