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
        printf("\n\nLista A->Z Vazia!!!\n\n");
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
        printf("Lista Z->A Vazia!!!\n\n");
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

void excluirvaga(noptr **est, int vaga, int hr_atual)
{
    noptr *buscar;
    buscar = *est;
    noptr *encontrou,*anterior,*proximo;
    int flag = 0;

    while(buscar){
        if(buscar->vaga == vaga){
            encontrou = buscar;
            flag = 1;
            break;
        }

        buscar = buscar->prox;
    }

    if(flag == 0)
    {
        printf("\nUsuario nao encontrado\n");

    }else{

        if(encontrou->ant != NULL && encontrou->prox !=NULL){
            anterior = encontrou->ant;
            proximo = encontrou->prox;
            anterior->prox = encontrou->prox;
            proximo->ant = encontrou->ant;
            free(encontrou);

        }else if(encontrou->prox == NULL && encontrou->ant != NULL){
            anterior = encontrou->ant;
            anterior->prox = NULL;
            free(encontrou);


        }else if(encontrou->ant == NULL && encontrou->prox != NULL){
            proximo = encontrou->prox;
            *est = proximo;
            proximo->ant = NULL;
            free(encontrou);
        }
        else{
            *est = NULL;
            free(encontrou);
        }

    }
}

void main()
{

    int op, aux, placa, hr, hr_atual, vaga, vag;
    float total;
    char nome[30];

    noptr *est;
    noptr *novo;
    est = NULL;

    while(op!=0){
        printf("------------------------------MENU------------------------------\n\n");
        printf("1. Cadastrar vaga (Ordem Alfabetica)\n");
        printf("2. Imprimir a lista de vagas nas direcoes A->Z ou de Z->A\n");
        printf("3. Remover um cliente\n");
        printf("0. Finalizar programa\n\n");
        printf("Escolha uma opcao: ");
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

        case 3:
            printf("Insira a vaga que será ser removida: \n");
            scanf("%d",&vag);
            printf("Digite a hora atual: \n");
            scanf("%d",&hr_atual);
            excluirvaga(&est,vag,hr_atual);
            break;

        }
    }
}
