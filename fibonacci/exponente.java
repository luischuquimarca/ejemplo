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
public class exponente {
    public static double exponencial(int a,int b){
         int resultado = 0;

        for (int i = 0; i < b; i++) {
            resultado=a;
            resultado = resultado * a;

        }

        return resultado;
    }
}
