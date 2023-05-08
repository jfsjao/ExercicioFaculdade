#include <stdio.h>
#include <stdlib.h>

void imprimir(int dia, int mes, int ano){

    if(mes == 1){
            printf("%d de janeiro de %d",dia, ano);
    }
    if(mes == 2){
            printf("%d de fevereiro de %d",dia, ano);
    }

    if(mes == 3){
            printf("%d de marco de %d",dia, ano);
    }

    if(mes == 4){
            printf("%d de abril de %d",dia, ano);
    }

    if(mes == 5){
            printf("%d de maio de %d",dia, ano);
    }

    if(mes == 6){
            printf("%d de junho de %d",dia, ano);
    }

    if(mes == 7){
            printf("%d de julho de %d",dia, ano);
    }

    if(mes == 8){
            printf("%d de agosto de %d",dia, ano);
    }

    if(mes == 9){
            printf("%d de setembro de %d",dia, ano);
    }

    if(mes == 10){
            printf("%d de outubro de %d",dia, ano);
    }

    if(mes == 11){
            printf("%d de novembro de %d",dia, ano);
    }

    if(mes == 12){
            printf("%d de dezembro de %d",dia, ano);
    }


}

int main()
{
    int d, m,a;
    printf("Digite a data atual (xx/xx/xxxx): ");
    scanf("%d/%d/%d",&d, &m, &a);
    imprimir(d,m,a);
    return 0;
}
