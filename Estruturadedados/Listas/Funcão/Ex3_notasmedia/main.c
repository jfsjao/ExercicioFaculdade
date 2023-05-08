#include <stdio.h>
#include <stdlib.h>

void media(float n1, float n2, float n3, char l){
    float m;
    if(l == 'A' || l == 'a'){
        m = (n1+n2+n3)/3;
        printf("A media do aluno e: %.2f", m);
    }
    if(l == 'P' || l == 'p'){
        n1 = n1 * 5;
        n2 = n2 * 3;
        n3 = n3 * 2;
        m = (n1+n2+n3)/3;
        printf("A media do aluno e: %.2f", m);

    }

}

int main()
{
    float n1, n2, n3;
    char l;

    printf("Digite as 3 notas do aluno: \n");

    printf("nota 1:");
    scanf("%f", &n1);
    printf("nota 2:");
    scanf("%f", &n2);
    printf("nota 3:");
    scanf("%f", &n3);

    fflush(stdin);

    printf("Digite uma letra para fazer a media (P - ponderada ou A - aritimetica): ");
    scanf("%c", &l);

    media(n1,n2,n3,l);
    return 0;
}
