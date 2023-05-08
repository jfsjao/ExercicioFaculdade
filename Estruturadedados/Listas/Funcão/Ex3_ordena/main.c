#include <stdio.h>
#include <stdlib.h>

int ordena(int *v1, int *v2, int *v3){
    int aux;

    if(*v1 != *v2 && *v2 != *v3){
        if(*v1<*v2){}
        return 0;
    }

    if(*v1 == *v2 && *v2 == *v3){
        return 1;
    }


}
int main()
{
    int v1, v2, v3, verf;
    printf("Digite o valor 1: ");
    scanf("%d",&v1);

    printf("Digite o valor 2: ");
    scanf("%d",&v2);

    printf("Digite o valor 3: ");
    scanf("%d",&v3);

    verf = ordena(&v1, &v2, &v3);
    if(verf == 0){
        printf("1 - %d; \n2 - %d; \n3 - %d; \n",v1, v2, v3);

    }
    if(verf == 1){
        printf("os valores sao iguais!!!");

    }


    return 0;
}
