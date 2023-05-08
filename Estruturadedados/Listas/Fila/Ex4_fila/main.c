#include <stdio.h>
#include <stdlib.h>

#define MAX 50

typedef struct{
    int item[MAX];
    int inicio, fim;
}Fila1;


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

void verifica(Fila1 *F1, Fila1 *F2){
    int aux1, aux2;
    aux1 = F1->fim;
    aux2 = F2->fim;

    if(aux1 == aux2){
        printf("O Tamanho das duas fila e igual");
    }else if(aux1<aux2){
        printf("A fila 1 e menor que a fila 2");
    }else if(aux1>aux2){
        printf("A fila 1 e maior que a fila 2");
    }
}



int main()
{
    int i,num;
    Fila1 F1, F2;
    Inicia(&F1);
    Inicia(&F2);

    printf("Prenchendo a fila 1: \n");
    do{
        printf("Digite os dados da fila: \n");
        scanf("%d",&num);
        if(num != 0)
            Insere(&F1, num);
    }while(num != 0);

    printf("Prenchendo a fila 2: \n");
    do{
        printf("Digite os dados da fila: \n");
        scanf("%d",&num);
        if(num != 0)
            Insere(&F2, num);

    }while(num != 0);


    verifica(&F1, &F2);

    return 0;
}
