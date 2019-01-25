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
public class factorial {
    public static double factorial(int y){
        int fac=1;
        for(int i=1;i<=y;i++){
		fac=fac*i;
	}
        return fac;
    }
}
