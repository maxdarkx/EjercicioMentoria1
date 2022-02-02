package com.juancarlosmaya.testproject1;

public class EjercicioMentoria {

    /**
     * busca el Minimo Comun Multiplo entre los dos numeros ingresados, y lo entrega mediante el return
     * @param numero1
     * @param numero2
     * @return resultado
     */

    public static int minimoComunMultiplo(int numero1, int numero2)
    {
        int resultado=1;
        int i=2;
        while(i <= numero1 || i <= numero2)
        {
            if(numero1%i==0 || numero2%i==0)
            {
                resultado=resultado*i;
                if(numero1 % i == 0)
                {
                    numero1=numero1/i;
                }
                if(numero2 % i == 0)
                {
                    numero2=numero2/i;
                }
            }
            else
                i=i+1;
        }
        return resultado;
    }

    public static int maximoComunDivisor(int numero1, int numero2)
    {
        //FIXME: Actualizar a y b de acuerdo a quien es mayor o menor, para que el algoritmo funcione
        int resultado = 0;
        int temp;

        if(numero2 > numero1)
        {
            temp = numero2;
            numero2 = numero1;
            numero1 = temp;
        }

        do {
            resultado = numero2;
            numero2 = numero1 % numero2;
            numero1 = resultado;
        } while (numero2 != 0);
        return resultado;
    }

    public static int minimoComunMultiploAvanzado(int numero1, int numero2)
    {
        return numero1 * numero2/maximoComunDivisor(numero1, numero2);
    }

    public static void main(String[] args) {
        int numero1= 3;
        int numero2 = 9;
        int resultado = minimoComunMultiplo(numero1, numero2);
        int resultado2 = maximoComunDivisor(numero1,numero2);
        int resultado3 = minimoComunMultiploAvanzado(numero1, numero2);

        System.out.println("El minimo comun multiplo es: "+resultado);
        System.out.println("El maximo comun divisor es: "+resultado2);
        System.out.println("El minimo comun multiplo (Avanzado) es: "+resultado3);

    }
}
