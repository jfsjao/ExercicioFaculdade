#include <stdio.h>
#include <stdlib.h>

#define MAX 10

typedef struct{
    int item[MAX];
    int inicio, fim;
}Fila1;

typedef struct{
    int topo;
    int dados[MAX];
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

void Inicia(Fila1 *F){               //inicia a fila
    F->inicio = F->fim=0;
}


int Insere(Fila1 *F, int X){
    if(F->fim==MAX){
        return 0;
    }
    else{
        F->item[F->fim]=X;
        F->fim++;
        return 1;
    }
}

int Remove(Fila1 *F, int *X){
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
void imprimeFila(Fila1 *F){
    int j;

    printf("Fila: ");
    for(j=F->inicio; j<F->fim; j++){
        printf("%d",F->item[j]);
    }
}

void reverso(Fila1 F1, Fila1 F2){

    int aux;
    pilha P1;

    P1.topo = -1;
    printf("Prenchendo a fila 2: \n");
    do{
        aux = desempilha(&P1);
        if(num != 0)
            Insere(&F2, aux);

    }while(num != 0);

}
int main()
{
    int num, aux;
    Fila1 F1, F2;
    pilha P1;

    P1.topo = -1;

    printf("Prenchendo a fila 1: \n");
    do{
        printf("Digite os dados da fila: \n");
        scanf("%d",&num);
        if(num != 0){
            Insere(&F1, num);
            empilha(num, &P1);
        }
    }while(num != 0);

    reverso(&F1, &F2);

    imprimeFila(&F1);
    imprimeFila(&F2);

    return 0;
}
