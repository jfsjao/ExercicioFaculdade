#include <stdio.h>
#include <stdlib.h>

int verificat (int a, int b, int c){
    if(a+b>c && a+c>b && b+c>a){
        return 1;
    }
    else{
        return 0;
    }
}
void qualifica(int lado1, int lado2, int lado3){
    if(lado1 == lado2 && lado2 == lado3){
        printf("O triangulo e equilatero!!");
    }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
        printf("O triangulo e isoceles!!");
    }else if(lado1 != lado2 && lado2 != lado3){
        printf("O triangulo e escaleno!!");
    }
}
void main()
{
    int l1,l2,l3;
    int verifica;
    printf("De os lados do triangulo: ");
    printf("lado 1: ");
    scanf("%d", &l1);
    printf("lado 2: ");
    scanf("%d", &l2);
    printf("lado 1: ");
    scanf("%d", &l3);

    verifica = verificat(l1, l2, l3);

    if(verifica == 1){
        qualifica(l1, l2, l3);
    }
    else{
        printf("Nao e triangulo");
    }
}
