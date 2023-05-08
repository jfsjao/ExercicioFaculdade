#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int dia, mes, ano;

}Regdata;

typedef struct{
    int passagem, num_poltrona;
    float dist;
    char fumante;
    float origem, destino;
    Regdata dat;

}REGPASSAGEM;
int main()
{
    REGPASSAGEM Passagem[3];
    int i;

    for(i=0;i<1;i++){

        printf("digite a data (dd mm aa): ");
        scanf("%d %d %d",&Passagem[i].dat.dia, &Passagem[i].dat.mes, &Passagem[i].dat.ano);

        /*printf("\nDigite o dia: ");
        scanf("%d", &Passagem[i].dat.dia);

        printf("\nDigite o mes: ");
        scanf("%d", &Passagem[i].dat.mes);

        printf("\nDigite o ano: ");
        scanf("%d", &Passagem[i].dat.ano);*/

        printf("\nDigite o km do origem: ");
        scanf("%f", &Passagem[i].origem);

        //setbuf(stdin, NULL);
        //fgets(Passagem[i].origem,19,stdin);

        printf("\nDigite o km do destino: ");
        scanf("%f", &Passagem[i].destino);

        //setbuf(stdin, NULL);
        //fgets(Passagem[i].destino,19,stdin);

        printf("Digite o numero da poltrona: ");
        scanf("%d",&Passagem[i].num_poltrona);

        printf("Fumante ou nao fumante (F/N):");
        setbuf(stdin, NULL);
        scanf("%c",&Passagem[i].fumante);

        Passagem[i].dist = Passagem[i].destino - Passagem[i].origem;
    }

    for(i=0; i<1; i++){
        printf("%d", i);
        printf("\ndata: %d/%d/%d", Passagem[i].dat.dia, Passagem[i].dat.mes, Passagem[i].dat.ano);
        printf("\n\n origem :%f \n destino: %f \n distancia: %f", Passagem[i].origem,Passagem[i].destino, Passagem[i].dist);
        printf("\n poltrona: %d \n fumante:%c", Passagem[i].num_poltrona,Passagem[i].fumante);
    }

    return 0;
}
