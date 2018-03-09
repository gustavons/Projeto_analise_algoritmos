import java.util.Random;

public class Exec {

    public static void main(String[] args) {

        //Configuração de tempos
        int qtdTempos = 50;
        long[][] tempo = new long[5][qtdTempos];

        // Iicializações
        Random random = new Random();

        // Metodos
        MaximumSubArrayDP maximumSubArrayDP = new MaximumSubArrayDP();
        Kadane kadane = new Kadane();
        DivideConquer divideConquer = new DivideConquer();
        BruteForce bruteForce = new BruteForce();

        //Saidas
//        Escrever escrever = new Escrever("MaxSubDynamicPrograming");
//        Escrever escrever = new Escrever("MaxSubKadame");
        Escrever escrever = new Escrever("MaxSubBruteForce");
//        Escrever escrever = new Escrever("MaxSubDivConq");



        //Execução
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

                //Tempo inicial
                long tempoInicial = System.nanoTime();

                // Execução
//                maximumSubArrayDP.solve(arrA);
//                kadane.solve(arrA);
//                divideConquer.solve(arrA);
                bruteForce.solve(arrA);
                //Tempo final
                long tempoFinal = System.nanoTime();

                //Tempo total
                tempo[j-1][k] = tempoFinal - tempoInicial;
            }

        }

        // Escrever no arquivo
        escrever.fileWrite(tempo);
    }
}
