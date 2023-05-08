#include <stdio.h>
#include <stdlib.h>
#include<string.h>


typedef struct
{
    int topo;
    char dados[10];
} pilha;

void empilha(char x, pilha *P)
{
    if(P->topo == 9)
    {
        printf("stack overflow");           //pilha cheia
    }
    else
        P->dados[(++P->topo)]=x;
}

char desempilha(pilha *P)
{
    if(P->topo == -1)
    {
        printf("stack underflow");
        return('?');
    }
    else
    {
        return(P->dados[P->topo--]);
    }
}
int main()
{
    int i,N,verifica;
    char dados[10],letra;
    pilha P1, P2, aux;



    printf("Digite a quantidade de elementos a ser inserido na pilha (max. 10): ");
    scanf("%d",&N);
    setbuf(stdin,NULL);

    P1.topo = -1;
    aux.topo = -1;
    for(i=0; i<N; i++)
    {
        printf("\n Digite a letra para formar a expressao: ");
        scanf("%c",&letra);
        fflush(stdin);
        empilha(letra, &P1);
        empilha(letra, &aux);
    }

    P2.topo = -1;
    for(i=0; i<N; i++)
    {
        letra = desempilha(&aux);
        empilha(letra, &P2);
    }
    verifica = 1;
    for(int  i=0; i<N; i++)
    {
        if(desempilha(&P1)!=desempilha(&P2))
        {
            verifica = 0;
        }
    }

    if(verifica == 1)
    {
        printf("\nE um palindromo");
    }
    else
    {
        printf("\nNao e um palindromo");
    }

    return 0;
}
