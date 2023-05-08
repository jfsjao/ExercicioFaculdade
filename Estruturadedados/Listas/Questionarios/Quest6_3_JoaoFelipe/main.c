#include <stdio.h>
#include <stdlib.h>

int soma_vetor_recursivo(int* vetor, int tamanho) {
    if (tamanho == 0) {
        return 0;
    }
    return vetor[tamanho-1] + soma_vetor_recursivo(vetor, tamanho-1);
}

int main() {
    int tamanho;
    printf("Insira o tamanho do vetor: ");
    scanf("%d", &tamanho);

    int vetor[tamanho];
    for (int i = 0; i < tamanho; i++) {
        printf("Insira o elemento %d do vetor: ", i+1);
        scanf("%d", &vetor[i]);
    }

    int resultado = soma_vetor_recursivo(vetor, tamanho);
    printf("A soma dos elementos do vetor e: %d\n", resultado);
    return 0;
}

