package com.juancarlosmaya.testproject1;

public class EjercicioMentoria {
    public static int funcion1(int num1, int num2)
    {
        int resultado=1;
        int i=2;
        while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
                resultado=resultado*i;
                if(num1%i==0) num1=num1/i;
                if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;
        }
        return resultado;
    }



    public static void main(String[] args) {
        int resultado = funcion1(6, 3);
        System.out.println("El resultado es: "+resultado);

    }
}
