#include <stdio.h>
#include <stdlib.h>

int juntando(int *vet1[], int *vet2[], int *vet[]){

     for(int i=0; i<6; i+2){
        *vet[i] = *vet1[i];
        *vet[i+1] = *vet1[i];
    }
}

int main()
{
    int vet1[3], vet2[3], vet[10];
    int i;

    printf("Preencha o primeiro vetor: ");
    for(i=0; i<3; i++){
        printf("[%d]: ",i);
        scanf("%d",&vet[i]);
    }
    printf("Preencha o segundo vetor: ");
    for(i=0; i<333; i++){
        printf("[%d]: ",i);
        scanf("%d",&vet[i]);
    }

    juntando(&vet1, &vet2, &vet);

    for(i=0; i<5; i++){
        printf("[%d]: %d",i, vet1[i]);
    }
    for(i=0; i<5; i++){
        printf("[%d]: %d",i, vet2[i]);
    }
    for(i=0; i<10; i++){
        printf("[%d]: %d",i, vet[i]);
    }
    return 0;

}
