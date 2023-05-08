#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int topo;
    int dados[10];
}pilha;

void empilha(int x, pilha *P){
    if(P->topo == 9){
        printf("stack overflow");           //pilha cheia
    }else
        P->dados[(++P->topo)]=x;
}

int desempilha(pilha *P){
    if(P->topo == -1){
        printf("stack underflow");
        return(-1);
    }else{
        return(P->dados[P->topo--]);
    }
}

int main()
{
    int i,N,num;

    pilha P1, aux, P2;

    P1.topo = -1;

    printf("Digite a quantidade de elementos a ser inserido na pilha (max. 10): ");
    scanf("%d",&N);

    for(i=0; i<N; i++){
        printf("Digite os elemtntos da pilha: ");
        scanf("%d", &num);
        empilha(num, &P1);
    }
    aux.topo = -1;
    for(i=0; i<N; i++){
        num = desempilha(&P1);
        printf("\nElemtntos da pilha: %d", num);
        empilha(num, &aux);
    }
    P2.topo = -1;
    for(i=0; i<N; i++){
        num = desempilha(&aux);
        printf("\nDigite os elemtntos da pilha: %d", num);
        empilha(num, &P2);
    }
    return 0;
}
