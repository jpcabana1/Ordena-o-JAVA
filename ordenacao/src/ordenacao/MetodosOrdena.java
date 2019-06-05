package ordenacao;

public class MetodosOrdena {
    
    void printa(int vet[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(vet[i] + ", ");
        }
        System.out.println("");
    } 
    
    void selectionSort(int vet[], int n ){
        int i, j, min, tmp;
        for(i = 0; i < n - 1; i++){
            for (j = i + 1,min = i; j < n; j++ ){
                if (vet[j] < vet[min])
                    min = j;
            }
            tmp = vet[i];
            vet[i] = vet[min];
            vet[min] = tmp;
        }
    }
    void bubblesort ( int vet[], int n){
    int i, j, tmp;
    for (i = 0; i < n - 1; i++){
        for (j = n - 1; j > i; j--){
            if( vet[j] < vet[j - 1] ){
                tmp = vet[j - 1];
                vet[j - 1] = vet[j];
               vet[j] = tmp;
            }
        }
      }
    }
    
    void insertionSort(int vet[], int n ){
        int j, p, tmp;
        for(p = 1; p < n; p++){
            tmp = vet[p];       
            for(j = p; j > 0 && tmp < vet[ j - 1 ]; j--){
                vet[ j ] = vet[ j - 1 ];
                vet[ j ] = tmp;
            }
        }
    }
    
    void shellSort(int data[], int n, int inc[], int num){
    int j, hCnt, h, k, tmp;
    for (num--; num >= 0; num--){
        h = inc[num];
            for (hCnt = h; hCnt < 2*h; hCnt++){
                for (j = hCnt; j < n; j += h){
                    tmp = data[j];
                    k = j;
                while (k-h >= 0 && tmp < data[k-h]){
                    data[k] = data[k-h];
                    k -= h;
                }
                data[k] = tmp;
                }
            }
        }
    }   
    void merge(int vetor[], int inicio, int meio, int fim) {
            int prim = inicio;
            int seg = meio + 1;
            int aux[] = new int[fim + 1];
            int i = inicio;
            // enquanto tiver elementos nos dois conjuntos
            while ((prim <= meio) && (seg <= fim)) {
            // insere elemento do primeiro
                if (vetor[prim] <= vetor[seg]) {
                    aux[i] = vetor[prim];
                    prim++;
                } else { // insere elemento do segundo
                    aux[i] = vetor[seg];
                    seg++;
                }
            i++;
            // sobrou elementos do segundo
                if (prim > meio) {
                    while (seg <= fim) {
                        aux[i] = vetor[seg];
                        seg++;
                        i++;
                    }
                    // sobrou elementos do primeiro
                    } else {
                    while (prim <= meio) {
                        aux[i] = vetor[prim];
                        prim++;
                        i++;
                }
                     // copia o vetor auxiliar no vetor principal
                for (i  = inicio; i <= fim; i++) {
                    vetor[i] = aux[i];
                }
            }
            }
        }        
    void troca(int a, int b){
            int temp;
            temp = a;
            a = b;
            b = temp;
        }       
    int particiona( int A[ ], int esquerda, int direita )
        {
            int i, temp;
            int ptr = esquerda;
            int pivo = A[esquerda]; /* pivô é primeiro elemento */
            /* Separa o vetor em elementos pequenos e grandes – em relação ao
            pivô */
            for (i = esquerda+1; i<=direita; i++)
                if( A[i] <= pivo ){
                    ptr = ptr + 1;
                    troca ( (A[i]), (A[ptr]) );
            }
            /* coloca o pivo entre os elementos pequenos e grandes */
            troca((A[esquerda]), (A[ptr]));
            return ptr;
        }
    void quickSort( int A[ ], int esquerda, int direita )
        {
            int pivo = particiona (A, esquerda, direita);
            if ( pivo > esquerda)
                quickSort( A, esquerda, pivo - 1 );
            if ( pivo < direita)
                quickSort( A, pivo + 1, direita );
        }        
    void heapsort( int a[], int n){
            int i = n/2, pai, filho, t;
            for (;;) {
                if (i > 0) {
                    i--;
                    t = a[i];
                }else{
                    n--;
                    if (n == 0)
                        return;
                    t = a[n];
                    a[n] = a[0];
                }
                pai = i;
                filho = i*2 + 1;
                /* continua */
                while (filho < n) {
                    if ((filho + 1 < n) && (a[filho + 1] > a[filho]))
                        filho++;
                    if (a[filho] > t) {
                        a[pai] = a[filho];
                        pai = filho;
                        filho = pai*2 + 1;
                    } else
                    break;
                }
                a[pai] = t;
            }/* fim for*/
            }
                            
}
/*
Ordenação

Implementar em Java Shell Sort
Implementar em Java Shell Sort passando função por parâmetro (EXTRA)
Passo-à-passo do Shell Sort
Implementar em Java Merge Sort
Passo-à-passo Merge Sort
Implementar em Java Quick Sort
Passo-à-passo Quick Sort
Implementar em Java Heap Sort
Passo-à-passo Heap Sort
*/