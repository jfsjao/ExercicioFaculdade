#include <stdio.h>
#include <stdlib.h>

void mudar(char x, int z, float y){



}


int main()
{
    int i = 2;
    int *j;

    float a = 2.5;
    float *b;

    char z = 'A';
    char *pchar;

    j= &i;
    printf("\n%d",i);
    *j=2+1;
    printf("\n%d",i);

    b= &a;
    printf("\n%.2f",a);
    *b=2.7+1.9;
    printf("\n%.2f",a);

    pchar= &z;
    printf("\n%c",z);
    *pchar= 'C';
    printf("\n%c",z);

    return 0;
}
