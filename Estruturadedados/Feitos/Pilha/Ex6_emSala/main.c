
#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int topo;
    int dados[100];
}stack;

stack pilha;

void empilha(int x){
    if(pilha.topo == 9){
        printf("stack overflow");
    }
    else{
        pilha.dados[(++pilha.topo)]=x;
    }
}

int desempilha()
{
    if(pilha.topo == -1){
        printf("stack underflow");
        return (-1);
    }else{
        return(pilha.dados[pilha.topo--]);
    }
}
int main()
{
    int N, i, x, maior, menor = 0;
    float media = 0;

    printf("\n Digite a quantidade de elementos para a pilha: ");
    scanf("%d" ,&N);

    printf("\n Digite os valores: ");
    for(i=0; i<N; i++){
        scanf("%d",&x);
        empilha(x);
    }
    for(i=0; i<N; i++){
        x = desempilha();
        if(i == 0){
            maior = x;
            menor = x;
        }else{
            if(x>maior){
                maior = x;
            }
            if(x<menor){
                menor = x;
            }
            media = media + x;
        }
    }
    media = media/N;

    printf("\nMaior: %d, Menor: %d, Media %.2f", maior, menor, media);
    return 0;
}
