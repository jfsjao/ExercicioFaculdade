#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct no
{
    int placa;
    int hr;
    int vaga;
    char nome[30];
    struct no *ant;
    struct no *prox;

} noptr;

void inserirCliente(noptr **est, noptr *novo, int plac, int hr_entrada, int vag, char nomeCli[]){

    noptr *p, *ant;
    int sair = 0;

    novo->placa = plac;
    novo->hr = hr_entrada;
    novo->vaga = vag;
    strcpy(novo->nome,nomeCli);

    novo->prox = NULL;
    novo->ant = NULL;

    if(*est == NULL)
    {
        novo->prox = NULL;
        *est = novo;
    }else
    {
        p = *est;

        while(p != NULL && sair == 0)
        {
            if (strcmp(p->nome,novo->nome) < 0 && sair == 0)
            {
                ant = p;
                p = p->prox;
            }
            else sair = 1;
        }

        if (p == *est)
        {
            novo->prox = *est;
            (*est)->ant = novo;
            *est = novo;
        }
        else
        {
            ant->prox = novo;
            novo->ant = ant;
            novo->prox = p;
            if (p != NULL)
                p->ant = novo;
        }
    }
}

void listarAZ(noptr *est)
{

    if(est == NULL)
    {
        printf("\n\nLista AZ Vazia!!!\n\n");
        return;
    }

    noptr *e = est;

    printf("Lista de usuarios de A ate Z:\n");

    while(e!=NULL)
    {

        printf("Nome cliente: %s",e->nome);
        printf("Placa do carro: %d \n",e->placa);
        printf("Hora de entrada do cliente: %d \n", e->hr);
        printf("Vaga: %d\n",e->vaga);
        printf("\n-----------------------------------------------------------------\n");

        e = e->prox;
    }


}

void listarZA(noptr *est)
{

    if(est == NULL)
    {
        printf("Lista ZA Vazia!!!\n\n");
        return;
    }

    noptr *e = est;

    while(e->prox!=NULL)
    {
        e = e->prox;
    }

    printf("\nLista de usuarios de Z ate A:\n");
    while(e!=NULL)
    {

        printf("Nome cliente: %s",e->nome);
        printf("Placa do carro: %d \n",e->placa);
        printf("Hora de entrada do cliente: %d \n", e->hr);
        printf("Vaga: %d\n",e->vaga);
        printf("\n-----------------------------------------------------------------\n");

        e = e->prox;
    }
}

void main()
{

    int op, aux, placa, hr, vaga;
    char nome[30];

    noptr *est;
    noptr *novo;
    est = NULL;

    while(op!=0){
        printf("------------------------------MENU-------------------------------\n\n");
        printf("1. Cadastrar vaga (Ordem Alfabetica)\n");
        printf("2. Imprimir a lista de vagas nas direções A->Z e de Z->A\n");
        printf("3. Remover um cliente\n");
        printf("0. Finalizar programa\n\n");
        printf("------------------------------------------------------------------\n");
        scanf("%d",&op);

        switch(op)
        {
        case 1:

            novo = (struct est *)malloc(sizeof(est));

            printf("Digite a placa do carro do cliente: ");
            scanf("%d",&placa);
            fflush(stdin);
            printf("Insira o nome do cliente: ");
            fgets(nome,200,stdin);
            fflush(stdin);
            printf("Insira a de hora de entrada do cliente: ");
            scanf("%d",&hr);
            printf("Insira a vaga do cliente: ");
            scanf("%d",&vaga);

            inserirCliente(&est, novo, placa,hr ,vaga, &nome);
            printf("\n");
            break;

        case 2:
            printf("Qual forma deseja imprimir: \n");
            printf("1. Impressao de A->Z\n");
            printf("2. Impressao de Z->A\n");
            scanf("%d",&aux);

            switch(aux){
                case 1:
                    listarAZ(est);
                    break;
                case 2:
                    listarZA(est);
            }
            break;
        }
    }
}
