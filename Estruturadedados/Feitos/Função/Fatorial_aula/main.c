#include <stdio.h>
#include <stdlib.h>

int fatorial(int aux){
    int n, i, f=1;

    //scanf("%d",&n);
    for(i=1; i<= aux; i++)
        f = f * i;
    //printf("Fatorial = %d\n" , f);
    return f;
}

void main()
{
    int fat, n;
    scanf("%d",&n);
    fat = fatorial(n);
    printf("Fatorial = %d\n" ,fat);
}
