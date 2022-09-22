
import java.util.Arrays;
import java.util.Random;


public class Executa {
    
    public static void main(String args[]) {
        // BubbleSort
        System.out.print("---------------------------------------");
        
        int n = 10000;
        int vetor[] = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = i;
        }
        
        System.out.println();
        System.out.println("BubbleSort - crescente com 10000 valores");
        System.out.println(Arrays.toString(vetor));
        
        Ordenacao ordenacao = new Ordenacao(); 
        ordenacao.setTempoInicial(System.currentTimeMillis());
        ordenacao.bubbleSort(vetor, 0, n-1);
        ordenacao.setTempoFinal(System.currentTimeMillis());
        ordenacao.calculaTempo();
        
        System.out.println(Arrays.toString(vetor));
        System.out.println("Num trocas: " + ordenacao.getnTrocas());
        System.out.println("Tempo de execução (milisegundos): " + ordenacao.getTempoExecucao());
       
        int j = 9999;
        for (int i = 0; i < n; i++) {
            vetor[i] = j;
            j--;
        }
        
        System.out.println();
        System.out.println("BubbleSort - decrescente com 10000 valores");
        System.out.println(Arrays.toString(vetor));
        
        ordenacao = new Ordenacao(); 
        ordenacao.setTempoInicial(System.currentTimeMillis());
        ordenacao.bubbleSort(vetor, 0, n-1);
        ordenacao.setTempoFinal(System.currentTimeMillis());
        ordenacao.calculaTempo();
        
        System.out.println(Arrays.toString(vetor));
        System.out.println("Num trocas: " + ordenacao.getnTrocas());
        System.out.println("Tempo de execução (milisegundos): " + ordenacao.getTempoExecucao());

        for (int i = 0; i < n; i++) {
            int valor = new Random().nextInt(10001);  // gera de 0 até 10000
            vetor[i] = valor;
        }
        
        System.out.println();
        System.out.println("BubbleSort - aleatório com 10000 valores");
        System.out.println(Arrays.toString(vetor));
        
        ordenacao = new Ordenacao(); 
        ordenacao.setTempoInicial(System.currentTimeMillis());
        ordenacao.bubbleSort(vetor, 0, n-1);
        ordenacao.setTempoFinal(System.currentTimeMillis());
        ordenacao.calculaTempo();
        
        System.out.println(Arrays.toString(vetor));
        System.out.println("Num trocas: " + ordenacao.getnTrocas());
        System.out.println("Tempo de execução (milisegundos): " + ordenacao.getTempoExecucao());
        
           
                 
//        // QuickSort
//        
//        n = 10000;
//        vetor = new int[n];
//        for (int i = 0; i < n; i++) {
//            vetor[i] = i;
//        }
//        System.out.println();
//        System.out.println("Quick - vetor crescente com 10000");
//        System.out.println(Arrays.toString(vetor));
//        
//        ordenacao = new Ordenacao();
//        ordenacao.setTempoInicial(System.currentTimeMillis());
//        ordenacao.quickSort(vetor, 0, n-1);
//        ordenacao.setTempoFinal(System.currentTimeMillis());
//        ordenacao.calculaTempo();
//        
//        System.out.println(Arrays.toString(vetor));
//        System.out.println("Num trocas: " + ordenacao.getnTrocas());
//        System.out.println("Tempo de execução (milisegundos): " + ordenacao.getTempoExecucao());
//      
//        
//        // Vetor decrescente
//        n = 10000;
//        j = n;
//        vetor = new int[n];
//        for (int i = 0; i < n; i++) {
//            vetor[i] = j;
//            j--;
//        }
//        System.out.println();
//        System.out.println("Quick - vetor decrescente com 10000");
//        System.out.println(Arrays.toString(vetor));
//        
//        ordenacao = new Ordenacao();
//        ordenacao.setTempoInicial( System.currentTimeMillis() );
//        ordenacao.quickSort(vetor, 0, n-1);
//        ordenacao.setTempoFinal(System.currentTimeMillis());
//        ordenacao.calculaTempo();
//        
//        System.out.println(Arrays.toString(vetor));
//        System.out.println("Num trocas: " + ordenacao.getnTrocas());
//        System.out.println("Tempo de execução (milisegundos): " + ordenacao.getTempoExecucao());
//         
//        
//       // Vetor aleatório
//        n = 10000;
//        vetor = new int[n];
//        for (int i = 0; i < n; i++) {
//            int valor = new Random().nextInt(10001);  // gera de 0 até 10000
//            vetor[i] = valor;
//        }
//        System.out.println();
//        System.out.println("Quick - vetor aleatório com 10000");
//        System.out.println(Arrays.toString(vetor));
//
//        ordenacao = new Ordenacao();
//        ordenacao.setTempoInicial(System.currentTimeMillis());
//        ordenacao.quickSort(vetor, 0, n-1);
//        ordenacao.setTempoFinal(System.currentTimeMillis());
//        ordenacao.calculaTempo();
//        
//        System.out.println(Arrays.toString(vetor));
//        System.out.println("Num trocas: " + ordenacao.getnTrocas());
//        System.out.println("Tempo de execução (milisegundos): " + ordenacao.getTempoExecucao());
//               
//      
//        System.out.println("---------------------------------------");
//        System.out.println();
//        
//        
    }
    
}