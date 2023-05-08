#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int topo;
    char dados[10];
}pilha;

void empilha(int x, pilha *P){
    if(P->topo == 9){
        printf("stack overflow");           //pilha cheia
    }else
        P->dados[(++P->topo)]=x;
}

char desempilha(pilha *P){
    if(P->topo == -1){
        printf("stack underflow");
        return('?');
    }else{
        return(P->dados[P->topo--]);
    }
}

int main()
{
    pilha P1,P2;
    char palavra[11], aux;
    int i;
    printf("digite a palavrinha: ");
    fgets(palavra,10,stdin);

    P1.topo = -1;
    for(i=0;i<10;i++){
        printf("A letra da palavra empilhada %c\n", palavra[i]);
        empilha(palavra[i], &P1);

    }
    printf("=======================================\n");
    P2.topo = - 1;
    for(i=0;i<10;i++){
        aux = desempilha(&P1);
        printf("A letra da palavra empilhada %c\n",aux);
        empilha(aux,&P2);

    }
    return 0;
}
