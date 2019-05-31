package ordenacao;

public class MetodosOrdena {
    
    void printa(int vet[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(vet[i] + ", ");
        }
        System.out.println("");
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