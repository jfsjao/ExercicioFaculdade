#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 2

typedef struct{
    int id;
    char nome[30];
    float nota1;
    float nota2;
    float nota3;
}regaluno;

int main()
{
    regaluno aluno[MAX];
    int i,pos, pos1, pos2;
    float maior_nota , media[MAX], maior_media  , menor_media ;
    char nome1[30];

    for(i=0;i<2;i++){
        printf("Insira o id do aluno: ");
        scanf("%d", &aluno[i].id);
        setbuf(stdin,NULL);
        printf("Insira o nome do aluno: ");
        fgets(aluno[i].nome,29,stdin);
        printf("Nota 1: :");
        scanf("%f",&aluno[i].nota1);
        printf("Nota 2: :");
        scanf("%f",&aluno[i].nota2);
        printf("Nota 3: :");
        scanf("%f",&aluno[i].nota3);

        if(aluno[i].nota1 > maior_nota){
            maior_nota = aluno[i].nota1;
            pos = i;
        }

        media[i] = (aluno[i].nota1 + aluno[i].nota2 + aluno[i].nota3)/3;

        if(media[i]>maior_media){
            maior_media = media[i];
            pos1 = i;
        }
        /*
        if(media[i]< menor_media)
            menor_media = media[i];
            pos2 = i;
        }*/
    }
    printf("Maior nota foi do %s", aluno[pos].nome);
    printf("Maior media foi do %s", aluno[pos1].nome);
    //
    printf("Menor media foi do %s", aluno[pos2].nome);
    return 0;
}
