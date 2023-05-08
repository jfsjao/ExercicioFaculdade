#include <stdlib.h>
#include <stdio.h>
#include <string.h>

typedef struct clientes
{
    struct clientes *ant;
    struct clientes *prox;
    char nome[200];
    int numero_registro;
    int codigo_servico;
    float total_horas;

} clientes;

typedef struct servicos
{
    struct servicos *ant;
    struct servicos *prox;
    int codigo_servico;
    float valor_hora;

} servicos;

void inserirCliente(clientes **cli, clientes *novo, int num_registro, int codigo_servico, float horas_semanais, char nom[])
{
    clientes *p, *ant;
    int sair = 0;

    novo->codigo_servico = codigo_servico;
    novo->numero_registro = num_registro;
    novo->total_horas = horas_semanais;
    strcpy(novo->nome,nom);

    novo->prox = NULL;
    novo->ant = NULL;

    if(*cli == NULL)
    {
        novo->prox = NULL;
        *cli = novo;
    }
    else
    {
        p = *cli;

        while(p != NULL && sair == 0)
        {
            if (strcmp(p->nome,novo->nome) < 0 && sair == 0)
            {
                ant = p;
                p = p->prox;
            }
            else sair = 1;
        }

        if (p == *cli)
        {
            novo->prox = *cli;
            (*cli)->ant = novo;
            *cli = novo;
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

void inserirServico(servicos **servs, servicos *novoS, int codigo_servico2, float valor_hora_servico)
{
    servicos *p,*ant;
    int sair = 0;

    novoS->codigo_servico = codigo_servico2;
    novoS->valor_hora = valor_hora_servico;

    novoS->prox = NULL;
    novoS->ant = NULL;

    if(*servs == NULL)
    {
        novoS->prox = NULL;
        *servs = novoS;
    }
    else
    {
        p = *servs;

        while(p != NULL && sair == 0)
        {
            if (p->codigo_servico < novoS->codigo_servico && sair == 0)
            {
                ant = p;
                p = p->prox;
            }
            else sair = 1;
        }

        if (p == *servs)
        {
            novoS->prox = *servs;
            (*servs)->ant = novoS;
            *servs = novoS;
        }
        else
        {
            ant->prox = novoS;
            novoS->ant = ant;
            novoS->prox = p;
            if (p != NULL)
                p->ant = novoS;
        }
    }
}


void excluirCliente(clientes **cli, int cliente)
{
    clientes *buscar;
    buscar = *cli;

    clientes *encontrou,*anterior,*proximo;
    int flag = 0;

    while(buscar){
        if(buscar->numero_registro == cliente){
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
            *cli = proximo;
            proximo->ant = NULL;
            free(encontrou);
        }
        else{
            *cli = NULL;
            free(encontrou);
        }

    }
}

void listarClientesAZ(clientes *cli, servicos *servs)
{

    if(cli == NULL)
    {
        printf("\n\nLista AZ Vazia!!!\n\n");
        return;
    }

    clientes *c = cli;
    servicos *s = servs;

    printf("Lista de Usuários de A até Z:\n");

    while(c!=NULL)
    {

        printf("\nNumero registro cliente: [%d]\n",c->numero_registro);
        printf("Nome cliente: %s",c->nome);
        printf("Codigo servico: [%d]\n",c->codigo_servico);
        printf("Horas totais: [%f]\n",c->total_horas);

        s = servs;

        while(s)
        {
            if(s->codigo_servico == c->codigo_servico)
            {
                break;
            }

            s = s->prox;
        }
        printf("Valor a receber: [%f]\n",(c->total_horas * s->valor_hora));

        c = c->prox;
    }


}

void listarClientesZA(clientes *cli, servicos *servs)
{

    if(cli == NULL)
    {
        printf("Lista ZA Vazia!!!\n\n");
        return;
    }

    clientes *c = cli;
    servicos *s = servs;

    while(c->prox!=NULL)
    {
        c = c->prox;
    }

    printf("\nLista de Usuários de Z até A:\n");
    while(c!=NULL)
    {

        printf("\nNumero registro cliente: [%d]\n",c->numero_registro);
        printf("Nome cliente: %s",c->nome);
        printf("Codigo servico: [%d]\n",c->codigo_servico);
        printf("Horas totais: [%f]\n",c->total_horas);

        s = servs;

        while(s)
        {
            if(s->codigo_servico == c->codigo_servico)
            {
                break;
            }

            s = s->prox;
        }
        printf("Valor a receber: [%f]\n",(c->total_horas * s->valor_hora));

        c = c->ant;
    }

}


void printarListaServicos(clientes *servs)
{
    servicos *p;

    if(servs == NULL)
    {
        printf("\n\nLista Vazia!!!\n\n");
        return;
    }

    p = servs;

    while(p)
    {
        printf("\nCodigo: %d\n",p->codigo_servico);
        printf("Valor por hora: %f\n",p->valor_hora);
        p = p->prox;
    }
    printf("\n");
}


void liberarNosClientes(clientes **cli)
{
    clientes *aux;
    aux = *cli;

    clientes *aux2;

    while(aux!= NULL)
    {
        aux2 = aux;
        *cli = aux->prox;
        free(aux2);
        aux = *cli;

    }

}

void liberarNosServicos(servicos **servs)
{
    servicos *aux;
    aux = *servs;

    servicos *aux2;

    while(aux!= NULL)
    {
        aux2 = aux;
        *servs = aux->prox;
        free(aux2);
        aux = *servs;

    }

}

void atualizarCliente(clientes **cli, servicos **servs)
{
    int cod;
    float valor,ex;
    float valor_hora;

    printf("Insira o codigo do cliente: ");
    scanf("%d",&cod);

    printf("Insira o valor a ser alterado: ");
    scanf("%f",&valor);

    clientes *p = *cli;

    while(p)
    {
        if(p->numero_registro == cod)
        {
          p->total_horas = valor;
          break;
        }

       p = p->prox;
    }

    printf("\nDados atualizados \n");
    printf("Nome: %s",p->nome);

    servicos *p2 = *servs;

    while(p2){
        if(p2->codigo_servico == p->codigo_servico){
            valor_hora = p2->valor_hora;
        }

        p2 = p2->prox;
    }

    printf("Valor atualizado: %f\n",p->total_horas*valor_hora);

}


int existe(servicos *servs, int cod){
    servicos *aux = servs;

    while(aux){
        if(aux->codigo_servico == cod){
            return 1;
        }

        aux = aux->prox;
    }

    return 0;
}

void flush_in(){
    int ch;
    while( (ch = fgetc(stdin)) != EOF && ch != '\n' ){}
}

void main()
{
    int op = 1,num_registro, codigo_servico;
    char nome[200];
    float horas_semanais;
    int codigo_servico2;
    float valor_hora_servico;
    int cod;

    clientes *cli;
    cli = NULL;
    servicos *servs;
    servs = NULL;

    clientes *novoC;
    servicos *novoS;

    while(op!=0)
    {

        printf("------------------------------------------------------------------\n");
        printf("1. Inserir Cliente (Ordem Alfabetica)\n");
        printf("2. Incluir Servico\n");
        printf("3. Liberar todos os nós das listas Clientes e Serviços\n");
        printf("4. Imprimir a lista de Clientes nas direções A->Z e de Z->A\n");
        printf("5. Eliminar um cliente\n");
        printf("6. Atualizar horas semanais e um cliente\n");
        printf("0. Finalizar programa\n\n");
        printf("------------------------------------------------------------------\n");

        scanf("%d",&op);

        switch(op)
        {
        case 1:

            novoC = (struct clientes *)malloc(sizeof(clientes));

            printf("Insira o codigo do servico: ");
            scanf("%d",&codigo_servico);

            int flag = existe(servs,codigo_servico);

            if(flag == 1)
            {
                printf("Insira o numero do registro do cliente: ");
                scanf("%d",&num_registro);
                flush_in();
                printf("Insira o nome do cliente: ");
                fgets(nome,200,stdin);
                printf("Insira a quantidade de horas semanais do cliente: ");
                scanf("%f",&horas_semanais);

                inserirCliente(&cli, novoC, num_registro,codigo_servico,horas_semanais, &nome);

            }
            else
            {
                printf("\nNão é possivel cadastrar o cliente(servico informado nao existe)\n");
            }

            break;


        case 2:

            novoS = (struct servicos *)malloc(sizeof(servicos));

            printf("Insira o codigo do servico: ");
            scanf("%d",&codigo_servico2);
            printf("Insira o valor da hora: ");
            scanf("%f",&valor_hora_servico);

            inserirServico(&servs, novoS,codigo_servico2,valor_hora_servico);
            break;

         case 3:

             liberarNosClientes(&cli);
             liberarNosServicos(&servs);

             break;

         case 4:

            listarClientesAZ(cli,servs);
            listarClientesZA(cli,servs);

            printf("\n");

            break;

         case 5:
             printf("Insira o codigo do cliente a ser removido: \n");
             scanf("%d",&cod);

             excluirCliente(&cli,cod);
             break;

         case 6:

             atualizarCliente(&cli, &servs);

             break;

        case 0:
            break;
        }

    }

}
