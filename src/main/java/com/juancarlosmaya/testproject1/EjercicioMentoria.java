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

    public static int funcion2(int a, int b)
    {
        //FIXME: Actualizar a y b de acuerdo a quien es mayor o menor, para que el algoritmo funcione
        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);
        return resultado;
    }

    public static void main(String[] args) {
        int resultado = minimoComunMultiplo(3, 9);
        System.out.println("El resultado es: "+resultado);

    }
}
