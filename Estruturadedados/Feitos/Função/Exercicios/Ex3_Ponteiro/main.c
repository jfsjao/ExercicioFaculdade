#include <stdio.h>
#include <stdlib.h>

ordenacao(int *x, int *y, int *z)
{
    int aux;
    if(*x == *y && *y == *z)
    {
        return 1;
    }
    else
    {
        if(*x<*y && *x<*z){
            if(*z<*y){
                aux = *y;
                *y = *z;
                *z = aux;

            }
            return 0;
        }else{
            if(*x<*y && *x<*z){
                if(*z<*y){
                    aux = *y;
                    *y = *z;
                    *z = aux;

                }
            }
        }

}
    int main()
    {
        int a, b, c, verifica;

        printf("De os valores de a, b e c: ");
        scanf("%d %d %d", &a, &b, &c);
        printf("\na = %d \nb = %d \nc = %d", a, b, c);

        verifica = ordenacao(&a,&b,&c);

        if(verifica == 1)
        {
            printf("\nOs valores sao iguais!!");
        }
        else
        {
            printf("\na = %d \nb = %d \nc = %d", a, b, c);
        }

        return 0;
    }
