/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Admin
 */
public class Fibonacci {

    public static void main(String[] args) {
int n1=2,n2=3,n3,c=12,i;
        System.out.println(n1+" "+n2);
    
  for(i=0;i<c;i++)  {
      n3=n1+n2;
        System.out.print(" "+n3);
    n1=n2;
    n2=n3;
    }}}