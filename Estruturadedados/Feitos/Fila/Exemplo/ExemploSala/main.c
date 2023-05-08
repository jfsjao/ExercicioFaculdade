#include <stdio.h>
#include <stdlib.h>
#define MAX 5

typedef struct{
    int item[MAX];
    int inicio, fim;
}Fila;

void Inicia(Fila *F){               //inicia a fila
    F->inicio = F->fim=0;
}

int Insere(Fila *F, int X){
    if(F->fim=MAX){
        return 0;
    }
    else{
        F->item[F->fim]=X;
        F->fim++;
        return 1;
    }
}

int Remove(Fila *F, int *X){
    if((*F).inicio == (*F).fim)
        return 0;
    else{
        *X=F->item[F->inicio];
        for(int i=0;i<MAX-1;i++)
            F->item[i]=F->item[i+1];
        F->fim--;
        return 1;
    }
}
int main()
{
    Fila F1;
    int i,retorno,valor;

    for(i=0;i<MAX;i++){
        printf("Digite um numero inteiro: ");
        scanf("%d", &valor);
        retorno = Insere(&F1, valor);
        if(retorno == 1){
            printf("Dado inserido");
        }else{
            printf("Fila esta cheia");
        }
    }
    for(i=0;i<MAX;i++){
        retorno = Remove(&F1, &valor);
        if(retorno == 1){
            printf("\nRemovido: %d,", valor);
        }else{
            printf("Fila esta vazia");
        }
    }

    return 0;
}
