/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Personal
 */
public class fibonacci {
    public static double fibonacci(int n){
         int a=0,b=1,c;
         for(int i=1;i<=n;i++){
        c=a+b;
         b=a;
        a=c;
        
     }
     return a;
    } 
}
