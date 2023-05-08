#include <stdio.h>
#include <stdlib.h>

#define MAX 3

typedef struct{
    int item[MAX];
    int inicio, fim;
}Fila1;

void Inicia(Fila1 *F){               //inicia a fila
    F->inicio = F->fim=0;
}
void IniciaF3(Fila2 *F3){               //inicia a fila
    F3->inicio = F3->fim=0;
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
int Insere2(Fila2 *F, int X){
    if(F->fim==MAX+MAX){
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
void verifica(Fila1 F1, Fila1 F2)
int main()
{
    int i,num;
    Fila1 F1, F2;
    Fila2 F3;
    Inicia(&F1);
    Inicia(&F2);
    IniciaF3(&F3);

    printf("Prenchendo a fila 1: \n");
    for(i=0;i<MAX;i++){
        printf("Digite os dados da fila: \n");
        scanf("%d",&num);

        Insere(&F1, num);
    }

    printf("Prenchendo a fila 2: \n");
    for(i=0;i<MAX;i++){
        printf("Digite os dados da fila: \n");
        scanf("%d",&num);

        Insere(&F2, num);
    }


    compara(&F1, &F2, &F3);

    return 0;
}
