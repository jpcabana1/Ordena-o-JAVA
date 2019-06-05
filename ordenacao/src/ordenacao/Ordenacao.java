package ordenacao;

public class Ordenacao {

    public static void main(String[] args) {
        MetodosOrdena m = new MetodosOrdena();
        int tam = 6;
        int vetor[] = new int[tam];
        vetor[0] = 15;
        vetor[1] = 5;
        vetor[2] = 34;
        vetor[3] = 15;
        vetor[4] = 10;
        vetor[4] = 1;
        //vetor[5] = 1;
        //vetor[6] = 4;
        //vetor[7] = 90;
        //vetor[8] = 75;
        //vetor[9] = 18;
        
        m.printa(vetor, tam);
        m.quickSort(vetor, 0, tam/2);
        m.printa(vetor, tam);
        
        
        
    }   
}
