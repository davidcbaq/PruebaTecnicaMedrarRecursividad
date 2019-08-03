import java.util.Random;

public class EjercicioRecursividad {
    public static void main(String[] args)
    {
        //Encontrar el número mayor en un arreglo de 12 posiciones llenado de manera aleatoria
        System.out.println("Encontrar el número mayor en un arreglo de 12 posiciones llenado de manera aleatoria");
        System.out.println("Datos de entrada: ");
        int[] numerosAleatorios= arrayAleatorio(1,999,12);
        String arreglo="[ ";
        for (int i = 0; i < numerosAleatorios.length; i++) {
            if(i==numerosAleatorios.length-1){
                arreglo+=numerosAleatorios[i];
            }else{
                arreglo+=numerosAleatorios[i]+",";
            }

        }
        arreglo+=" ]";
        System.out.println("\tArreglo aleatorio: "+arreglo);
        System.out.println("Datos de salida: ");
        System.out.println("\tMayor: " + maximo(numerosAleatorios, 0, numerosAleatorios[0]));
        //----------------------------------------------------------------------------------

        //Sumar los dígitos de un número de 6 caracteres dado de forma aleatoria
        System.out.println("\nSumar los dígitos de un número de 6 caracteres dado de forma aleatoria");
        int nAleatorio= numeroAleatorio(100000,999999);
        System.out.println("Datos de entrada: ");
        System.out.println("\tNumero aleatorio: " + nAleatorio);
        System.out.println("Datos de salida: ");
        System.out.println("\tNumero sumado: " + sumarDigitos(nAleatorio));
        //----------------------------------------------------------------------------------

        //Encontrar el factorial de un número entre 1 y 10 dado de manera aleatoria
        System.out.println("\nEncontrar el factorial de un número entre 1 y 10 dado de manera aleatoria");
        int nAleatorio1= numeroAleatorio(1,10);
        System.out.println("Datos de entrada: ");
        System.out.println("\tNumero aleatorio: " + nAleatorio1);
        System.out.println("Datos de salida: ");
        System.out.println("\tFactorial de: " + nAleatorio1 + " es "+ factorial(nAleatorio1));
        //----------------------------------------------------------------------------------

    }

    public static int maximo(int[] array, int indice, int mayor)
    {
        if (indice == array.length)
            return mayor;

        if (array[indice] > mayor)
            mayor = array[indice];

        return maximo(array, indice+1, mayor);
    }
    public static int[] arrayAleatorio(int desde, int hasta, int tam){
        int[] numeros = new int[tam];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
        }
        return numeros;
    }



    public static int sumarDigitos(int numero){

        if(numero<10)
            return numero;

        return (numero%10) + sumarDigitos(numero/10);

    }
    public static int numeroAleatorio(int desde, int hasta){
        int numero;
        Random rnd = new Random();

            numero = rnd.nextInt(hasta - desde + 1) + desde;

        return numero;
    }
    public static int factorial (int numero) {

        if (numero == 0)
            return 1;

        return numero * factorial(numero-1);
    }
}
