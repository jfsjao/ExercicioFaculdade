#include <stdio.h>
#include <stdlib.h>
typedef struct no
{
    int dados;
    struct no *anterior;
    struct no *proximo;

} noptr;

void main()
{
    int rebece = 1;
    noptr *inicio;
    inicio = NULL;
    noptr *info;

    while(recebe!=0)
    {
        info = (struct no *) malloc(sizeof(noptr));
        if(!indo)
        {
            printf("\nSem Memoria!!!");
            return;
        }
        printf("Digite um valor: ");
        scanf("%d", &recebe);
        if(recebe!=0)
        {
            insere_lista(&inicio, info, recebe)
        }
    }
    lista_todos(inicio);
    remove(inicio);
    lista_todos(inicio);
}

void insere_lista(noptr **inifunc, noptr *novo, int valor)
{
    novo->anterior = valor;
    novo->anterior = NULL;

    if(*inifunc == NULL)
    {
        novo->proximo = NULL;
    }
    else
    {
        novo->proximo = *inifunc;
        (*inifunc)->anterior=novo;
    }
    *inifunc = novo;
}

void remove_lista(noptr **inifunc)
{
    noptr *p;

    if(inifunc == NULL)
    {
        ptintf("\nLista Vazia!!!");
        return;
    }
    else
    {
        p = *inifunc;
        printf("\nValor removido: %d", p->dados);
        *inifunc = p->proximo;
        (*inifunc)->anterior = NULL;
        free(p);
    }
}

void lista_todos(noptr *inifunc){
    if(inifunc == NULL){
        printf("\nLista Vazia!!!");
        return;
    }
    noptr *p;
    p = inifunc;
    while(p){
        printf("\nSaida: %d",p->dados);
        p = p->proximo;
    }
    printf("\n");
}
