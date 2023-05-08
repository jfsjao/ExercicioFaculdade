#include <stdio.h>
#include <stdlib.h>

int verifica(float a, float b, float c){
    if(a < b+c && b < a+c && c < b+a )
        return 1;
    else
        return 0;


}
void qualificacao(float a, float b, float c){

    if(a == b && a==c)
        printf("Triangulo equilatero");
    else if(a == b+c || b == a+c || c == a+b)
        printf("Triangulo isoceles");
    else if(a != b && a != c && c != b)
        printf("Triangulo escaleno");

}
void main()
{
    float lado1, lado2, lado3;
    int aux;

    printf("De os valores: \n");
    do{
        printf("lado 1: \n");
        scanf("%f",&lado1);
    }while(lado1<=0);
    do{
        printf("lado 2 : \n");
        scanf("%f",&lado2);
    }while(lado2<=0);
    do{
        printf("lado 3: \n");
        scanf("%f",&lado3);
    }while(lado3<=0);

    aux = verifica(lado1,lado2,lado3);
    if(aux == 1){
        qualificacao(lado1, lado2, lado3);
    }
}
