#include <stdio.h>
#include <stdlib.h>

//FILA DINAMICA
typedef struct elemento{
    int cod;
    int quant;
    float valor;
    struct elemento *prox;
}Elem;

typedef struct fila{
    struct elemento *inicio;
    struct elemento *fim;
}Fila;

Fila *cria_fila(){
    Fila *fi = (Fila *)malloc(sizeof(Fila));
    if(fi != NULL){
        fi ->inicio = NULL;
        fi ->fim = NULL;
    }
    return fi;
}

int insere_fila(Fila *fi, float valor, int qtd, int cod){
    Elem *novo;
    if(fi == NULL)
        return 0;
    novo = (Elem *)malloc(sizeof(Elem));
    if(novo == NULL)
        return 0;
    novo->cod = cod;
    novo->quant = qtd;
    novo->valor = valor;
    novo->prox = NULL;
    if(fi->inicio == NULL){ //1°elemento da fila
        fi->inicio = novo;
    }else{
        fi->fim->prox = novo;
    }
    fi->fim = novo;
    return 1;
}

int tamanho_fila(Fila *fi){
    int cont=0;
    Elem *no;

    if(fi == NULL){
        return 0;
    }
    no = fi->inicio;
    while(no!=NULL){
        cont++;
        no = no->prox;
    }
    return cont;
}

void preencher(Fila *f, int cd ){
    int valor, qt, cod = cd;
    int ver;

    printf("\n");
    printf("Produto codigo %d",cod);
    printf("\n");
    printf("\nDigite a quantidade: ");
    scanf("%d",&qt);
    printf("\nDigite o valor: ");
    scanf("%d",&valor);
    printf("\n");
    ver = insere_fila(f,valor, qt, cod);

}
void remove_fila(Fila *fi){
    Elem *no, *ant; // variavel para guardar o ponteiro para o inicio da fila
    if(fi == NULL) // fi nao foi inicializada
        return;
    if(fi->fim == NULL)// fi foi inicializada mas fila esta vazia
        return;
    no = fi->inicio;
    ant = NULL;
    while(no != NULL){
        if(no->quant == 0){
            if(ant == NULL){
                fi->inicio = no->prox;
                if(no->prox == NULL)
                    fi->fim = NULL;
            }else{
                ant->prox = no->prox;
                if(no->prox == NULL)
                    fi->fim = ant;
            }
            int cod = no->cod;
            free(no);
            printf("\nRemover %d\n\n",cod);
            no = ant;
        }
        ant = no;
        no = no->prox;
    }
}
void listar_fila(Fila *fi){
    Elem *no;
    no = fi->inicio;
    while(no!=NULL){
        printf("\nCodigo: %d",no->cod);
        printf("\nValor: R$ %.2f",no->valor);
        printf("\nQuantidade: %d",no->quant);
        printf("\n--------------------------");
        no = no->prox;
    }
    printf("\n\n");
}
void atualiza_produto(Fila *fi){
    int codigo;
    float valor;
    int qtd;
    Elem* no;
    printf("Qual o produto que voce quer mudar: \n");
    printf("Digite o codigo: ");
    scanf("%d", &codigo);
    no = fi->inicio;
    while(no!=NULL){
        if(no->cod == codigo){
            printf("Digite o novo valor: ");
            scanf("%f", &valor);
            printf("Digite a nova quantidade dos produtos: ");
            scanf("%d", &qtd);
            no->valor = valor;
            no->quant = qtd;
            printf("\nProduto atualizado com sucesso! \n");
            return;
        }
        no = no->prox;
    }
    printf("\nCodigo %d não encontrado \n",codigo);
}
int main()
{
    Fila *f1;
    int op,cod,  aux = 0, qtd;
    int ver, tam =0;
    float valor;
    Elem *no;

    f1 = cria_fila();
    if(f1==NULL){
        printf("\nErro na cricacao da fila 1");
        return 0;
    }
    do{
        printf("Produtos cadastrados: %d\n", tamanho_fila(f1));
        printf("1. Insere produtos na fila\n");
        printf("2. Atualiza produto\n");
        printf("3. Remove produto\n");
        printf("4. Imprime produtos\n");
        printf("0. Sair\n");

        printf("\n\nDigite a opcao:");
        scanf("%d",&op);
        switch(op){
            case 0:
                break;
            case 1:
                preencher(f1, aux);
                aux++;
                break;
            case 2:
                atualiza_produto(f1);
                break;

            case 3:
                remove_fila(f1);
                break;
            case 4:
                printf("Produtos da papelaria: ");
                listar_fila(f1);
                break;
            default:
                printf("\nOPCAO INVALIDA!\n");
                break;
        }
    }while(op!=0);
    printf("\n");
    return 0;
}
