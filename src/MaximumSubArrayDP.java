
import java.util.Arrays;
import java.util.Random;

public class MaximumSubArrayDP {

    //bottom up approach
    public int solve(int [] a){
        int [] solution = new int[a.length+1];
        solution[0] = 0;

        for (int j = 1; j <solution.length ; j++) {
            solution[j] = Math.max(solution[j-1]+a[j-1],a[j-1]);
        }
        //this will print the solution matrix
        //System.out.println(Arrays.toString(solution));
        //now return the maximum in the solution array
        int result = solution[0];
        for (int j = 1; j <solution.length ; j++) {
            if(result<solution[j])
                result = solution[j];
        }

        return result;
    }

    public static void main(String[] args) {
        int qtdTempos = 50;
        long[][] tempo = new long[5][qtdTempos];

        // Iicializações
        Random random = new Random();
        MaximumSubArrayDP maximumSubArrayDP = new MaximumSubArrayDP();
        Escrever escrever = new Escrever("MaxSubDynamicPrograming");



        for (int j = 1; j<=5; j++){

            // Parametros de execução
            int tamanhoArray = 1000 * j;
            // Array
            int arrA[] = new int[tamanhoArray];





            for (int i = 0; i < arrA.length; i++) {
                arrA[i] = -25 + random.nextInt(50);
            }

            // Captura de tempos
            for (int k = 0; k < qtdTempos; k++) {

                long tempoInicial = System.nanoTime();

                maximumSubArrayDP.solve(arrA);

                long tempoFinal = System.nanoTime();

                tempo[j-1][k] = tempoFinal - tempoInicial;
            }


            System.out.println("\nMaximum subarray is  " + maximumSubArrayDP.solve(arrA));
        }
        // Escrever no arquivo
        escrever.fileWrite(tempo);
    }
}