#include <stdio.h>
#include <stdlib.h>

void calcula(int *x, int *y){

    if(*x>*y){
        *x=2**x;
        *y=2**y;
    }else{
        *x=*x+1;
        *y=*y+1;
        printf("\nValor de X: %p",x);
        printf("\nValor que X aponta: %d",*x);
    }
}

int main()
{
    int x, y;

    printf("De um valor 1: ");
    scanf("%d",&x);
    printf("De um valor 2: ");
    scanf("%d",&y);

    calcula(&x , &y);
    printf("\nX: %d, Y: %d ", x,y);

    return 0;

}
