#include <stdio.h>
#include <stdlib.h>

typedef struct noArv
{
    struct noArv* esq;
    int info;
    struct noArv* dir;
} NoArv;

//typedef struct noArv NoArv; nao precisa colocar o nome na struct

NoArv* abb_cria(void)
{
    return NULL;
}

void abb_imprime(NoArv *a)
{
    if(a != NULL)
    {
        printf("\n%d",a->info);
        abb_imprime(a->esq);
        abb_imprime(a->dir);
    }
}


NoArv* abb_insere (NoArv* a, int v)
{
    if (a==NULL)
    {
        a = (NoArv*)malloc(sizeof(NoArv));
        a->info = v;
        a->esq = a->dir = NULL;

    }
    else if (v < a->info)
        a->esq = abb_insere(a->esq,v);
    else if (v > a->info)
        a->dir = abb_insere(a->dir,v);
    return a;
}

int totalNo_abb(NoArv* raiz)
{
    int esq, dir;
    if(raiz == NULL)
    {
        return 0;
    }
    esq = totalNo_abb(raiz->esq);
    dir = totalNo_abb(raiz->dir);

    return(esq + dir + 1);
}

int altura_abb(NoArv* raiz)
{
    int esq, dir;
    if(raiz == NULL)
    {
        return -1;
    }
    esq = altura_abb(raiz->esq);
    dir = altura_abb(raiz->dir);
    if(esq>dir)
    {
        return (esq+1);
    }
    else return (dir+1);

}

NoArv* abb_retira(NoArv* r, int v)
{
    if(r == NULL)
        return NULL;
    else if (r->info > v)
        r->esq = abb_retira(r->esq, v);
    else if (r->info < v)
        r->dir = abb_retira (r->dir, v);
    else
    {
        if( r->esq == NULL && r->dir == NULL)       //nenhum filho
        {
            free(r);
            r = NULL;
        }
        else if(r->esq == NULL)         //so filho a direita
        {
            NoArv* t = r;
            r = r->dir;
            free(t);
        }
        else if(r->dir == NULL)         //so filho a esquerda
        {
            NoArv* t = r;
            r = r->esq;
            free(t);
        }
        else
        {
            NoArv* f = r->esq;
            while(f->dir != NULL)
            {
                f = f->dir;
            }
            r->info = f->info;
            f->info = v;
            r->esq = abb_retira(r->esq,v);
        }
    }
    return r;
}
int main()
{
    NoArv* raiz;
    int i, num = 1;

    raiz = abb_cria();
    do
    {
        printf("Digite o novo valor: ");
        scanf("%d", &num);
        if(num != 0)
            raiz = abb_insere(raiz, num);
    }
    while(num != 0);

    printf("\nArvore Inicial.\n");
    abb_imprime(raiz);

    num =  totalNo_abb(raiz);
    printf("\nNumero de nos da arvore: %d", num);
    num =  altura_abb(raiz);
    printf("\naltura da arvore: %d", num);

    printf("\nQual valor q sera removido: ");
    scanf("%d",&num);
    num = abb_retira(raiz,num);
    printf("\nNo removido: %d",num);
    abb_imprime(raiz);

    printf("\nQual valor q sera removido: ");
    scanf("%d",&num);
    num = abb_retira(raiz,num);
    printf("\nNo removido: %d",num);
    abb_imprime(raiz);

    printf("\nQual valor q sera removido: ");
    scanf("%d",&num);
    num = abb_retira(raiz,num);
    printf("\nNo removido: %d",num;
    abb_imprime(raiz);

    return 0;
}
