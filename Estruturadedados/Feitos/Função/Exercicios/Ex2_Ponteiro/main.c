#include <stdio.h>
#include <stdlib.h>

void soma(int *x, int *y){
    *x = *x + *y;
    *y = *x*2;

}

int main()
{
    int a, b;

    printf("De os valores de a e b: ");
    scanf("%d %d", &a, &b);
    printf("a = %d \n b = %d", a, b);

    soma(&a, &b);

    printf("\na = %d \n b = %d", a, b);

    return 0;
}
