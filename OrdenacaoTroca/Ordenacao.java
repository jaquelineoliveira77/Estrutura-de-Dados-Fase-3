
public class Ordenacao {

    private long tempoInicial;
    private long tempoFinal;
    private long tempoExecucao;
    private long nTrocas;

    public Ordenacao() {
        this.tempoInicial = 0;
        this.tempoFinal = 0;
        this.tempoExecucao = 0;
        this.nTrocas = 0;
    }

    public int[] bubbleSort(int[] vetor, int inicio, int fim) {

        boolean houverTroca = true;
        while (houverTroca) {
            houverTroca = false;
            for (int i = 0; i < fim; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    this.nTrocas++;
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    houverTroca = true;
                }
            }
        }

        return vetor;

    }

    public int[] quickSort(int[] vetor, int inicio, int fim) {
        int esquerda = inicio;
        int direita = fim;

        int meio = (esquerda + direita) / 2;
        int pivo = vetor[meio];

        while (esquerda < direita) {
            while (vetor[esquerda] < pivo) {
                esquerda++;
            }
            while (vetor[direita] > pivo) {
                direita--;
            }
            if (esquerda <= direita) { // realiza a troca
                this.nTrocas++;
                int aux = vetor[esquerda];
                vetor[esquerda] = vetor[direita];
                vetor[direita] = aux;
                esquerda++;
                direita--;
            }
        }

        if (direita > inicio) {
            quickSort(vetor, inicio, direita);
        }
        if (esquerda < fim) {
            quickSort(vetor, esquerda, fim);
        }

        return vetor;
    }

    public long getTempoExecucao() {
        return tempoExecucao;
    }

    public void calculaTempo() {
        this.tempoExecucao = this.tempoFinal - this.tempoInicial;
    }

    public long getTempoInicial() {
        return tempoInicial;
    }

    public long getTempoFinal() {
        return tempoFinal;
    }

    public long getnTrocas() {
        return nTrocas;
    }

    public void setTempoInicial(long tempoInicial) {
        this.tempoInicial = tempoInicial;
    }

    public void setTempoFinal(long tempoFinal) {
        this.tempoFinal = tempoFinal;
    }

}
