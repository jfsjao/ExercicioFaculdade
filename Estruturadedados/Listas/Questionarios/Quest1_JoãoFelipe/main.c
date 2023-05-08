#include <stdio.h>
#include <stdlib.h>
#define MAX 10

typedef struct
{
    int codpac;
    char nome[50];
    int fone;
} paciente;

typedef struct
{
    int hora;
    int minutos;
    int segundos;

} horario;

typedef struct
{
    int dia;
    int mes;
    int ano;

} data;

typedef struct
{
    int codcons;
    int cod_paciente;
    horario hr;
    data dt;

} consulta;

int main()
{
    paciente pac[MAX];
    consulta cons[MAX];

    int cod_aux, cod_aux1, cons_aux;
    int op, i, h, numpac = 0, numcons = 0;
    int vecd, vecm, veca, vecc;
    int flag = 0, flag2 =0, flag3 = 0;


    do
    {
        printf("\n==================MENU==================\n");
        printf("Cadastrar paciente.....................1\n");
        printf("Cadastrar para consulta................2\n");
        printf("Consultar agendamentos.................3\n");
        printf("Alterar horarios das consultas.........4\n");
        printf("Sair...................................0\n");
        printf("========================================\n");
        scanf("%d",&op);
        switch(op)
        {

        case 1: //cadastrar paciente

            if(numpac<MAX)
            {
                printf("\n========================================\n");
                printf("\nDigite o Codigo do paciente: ");
                scanf("%d",&pac[numpac].codpac);
                printf("Digite o nome do paciente: ");
                setbuf(stdin, NULL);
                fgets(pac[numpac].nome,19,stdin);
                printf("digite o telefone do paciente: ");
                scanf("%d",&pac[numpac].fone);
                numpac++;
            }
            /*for(i=0;i<aux;i++){
                printf("%d, %s, %d", pac[i].codpac, pac[i].nome ,pac[i].fone);
            }*/
            break;

        case 2: //dados da consulta

            printf("\n========================================\n");
            flag2 =0;
            printf("Qual o paciente para a consulta?\n");
            scanf("%d", &cod_aux);
            for(i=0; i<numpac; i++)
            {
                if(cod_aux == pac[i].codpac)
                {
                    do{
                        flag3 = 0;
                        printf("Digite o codigo da consulta: ");
                        scanf("%d", &vecc);
                        for(h=0;h<numcons;h++){
                            if(vecc == cons[h].codcons){
                                printf("Esse codigo de consulta ja esta sendo usado!\n");
                                flag3 = 1;
                            }
                        }
                    }while(flag3 == 1);


                    do
                    {
                        flag = 0;
                        printf("Digite a data para consulta: (dd mm aa)");
                        scanf("%d %d %d", &vecd, &vecm, &veca);


                        }
                        for(int j=0; j<numpac; j++)
                        {
                            if(veca == cons[j].dt.ano)
                            {
                                if(vecm == cons[j].dt.mes)
                                {
                                    if(vecd == cons[j].dt.dia)
                                    {
                                        printf("Na data ja possui consulta! ");
                                        flag = 1;
                                    }
                                }
                            }
                        }
                    }
                    while(flag == 1);
                    if(flag == 0)
                    {
                        cons[numcons].codcons = vecc;
                        cons[numcons].cod_paciente = pac[i].codpac;
                        cons[numcons].dt.dia = vecd;
                        cons[numcons].dt.mes = vecm;
                        cons[numcons].dt.ano = veca;
                    }
                    printf("Digite a hora da consulta: (hh mm ss): ");
                    scanf("%d %d %d", &cons[numcons].hr.hora, &cons[numcons].hr.minutos, &cons[numcons].hr.segundos);

                    flag2 = 1;
                    printf("Cadastrado com sucesso!!");
                    numcons++;
                }


            }
            if(flag2 == 0)
            {
                printf("Paciente nao encontrado!");
            }

            break;

            case 3: //consultar agendamentos
                flag = 0;
                printf("Digite o codigo do paciente que deseja consultar: ");
                scanf("%d", &cod_aux1);

                for(i=0; i<=numpac; i++){

                    if(cod_aux1 == cons[i].cod_paciente){
                            printf("Nome do cliente: %s", pac[i].nome);
                            printf("Codigo da consulta: %d \n", cons[i].codcons);
                            printf("Horario da conulta: %d:%d:%d \n", cons[i].hr.hora, cons[i].hr.minutos, cons[i].hr.segundos);
                            printf("Data da conulta: %d/%d/%d \n", cons[i].dt.dia, cons[i].dt.mes, cons[i].dt.ano);
                            flag = 1;

                        }

                    }
                    if(flag == 0){
                        printf("Cliente nao cadastrado!!");
                    }


                break;

            case 4: //alterar horarios das consultas

                printf("\n========================================\n");
                printf("Digite o codigo da consulta para alterar o horario: ");
                scanf("%d", &cons_aux);

                for(i=0; i<numcons; i++){
                    if(cons_aux == cons[i].codcons){
                        printf("Digite o horario para ser alterado: (hh mm ss): ");
                        scanf("%d %d %d", &cons[i].hr.hora, &cons[i].hr.minutos, &cons[i].hr.segundos);
                    }
                }
                break;

        }

    }
    while(op != 0);

    return 0;
}
