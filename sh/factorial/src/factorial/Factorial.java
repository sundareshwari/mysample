/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
 class Factorial {

   
    public static void main(String[] args) {
       int n,c,f=1;
        System.out.println("enter a integer:");
        Scanner x=new Scanner(System.in);
    n= x.nextInt();
    if(n<0)
        System.out.println("ur no is non-negative");
        else{
                for (c=1;c<=n;c++)
                    f=f*c;
                System.out.println("factorial of"+n+"is="+f);
              
                }
    }
 }

