#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int numUFU;
    char nome[30];
    char sexo;
    float renda_familiar;
}regaluno;

int main()
{
    regaluno aluno1, aluno2;

    printf("\n\nEntre com o numero UFU: ");
    scanf("%d", &aluno1.numUFU);

    printf("\n\nEntre com o nome:");
    fgets(aluno1.nome); //scanf(" %[^\n]",aluno1.nome);

    printf("\n\nEntre com o sexo(M/F):");
    aluno1.sexo = getchar();

    printf("\n\nEntre com a renda familiar:");
    scanf("%f", &aluno1.renda_familiar);



    return 0;
}
