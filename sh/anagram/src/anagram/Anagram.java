/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
class Anagram {
 static void v(String a,String b){
     String x=a.replaceAll("\\s", "");
      String y=b.replaceAll("\\s", "");
      boolean status=true;
      if(x.length()!=y.length()){
          status=false;
      }else{
          char[] ArrayX=x.toLowerCase().toCharArray();
          char[] ArrayY=y.toLowerCase().toCharArray();
          Arrays.sort(ArrayX);
           Arrays.sort(ArrayY);
           status=Arrays.equals(ArrayX, ArrayY);
          
      }
      if(status){
          System.out.println(a+" and "+b+" are anagrams ");
      }else{
          System.out.println(a+"  "+b+" are not anagrams ");
      }
 }
    
    public static void main(String[] args) {
        v("cat","tac");
        v("Mother in law","hitler woman");
    }
    
}
