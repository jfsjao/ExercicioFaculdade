#include <stdio.h>
#include <stdlib.h>
#define MAX 30

typedef struct
{
    int num_insc;
    int idade;
    int pont;
    int cod_curso;

} cursos;

int main()
{
    //vetores das struct dos cursos
    cursos vagas_s[MAX];
    cursos vagas_a[MAX];
    cursos vagas_f[MAX];
    cursos vagas_g[MAX];

    int vag_s = 0, vag_a = 0, vag_f = 0, vag_g = 0;                     //quantidade de cadastrados

    int menor_s = 101, menor_a = 101, menor_f = 101, menor_g = 101;     //menor nota de cada curso
    int pos_ms = 0, pos_ma = 0, pos_mf = 0, pos_mg = 0;                 //posicao no vetor que se encontra a menor nota

    //variaveis tempporareas para cadastro
    int temp_insc;
    int temp_idade;
    int temp_pont;
    int temp_cod;

    int op, i, opimprimir;

    do
    {
        printf("\nMENU: \n");
        printf("Cadastrar..................................1\n");
        printf("Consultar.cadastrados.nos.cursos...........2\n");
        printf("Sair.......................................0\n");
        scanf("%d", &op);

        if(op == 1)
        {

            printf("\nDigite o numero de inscricao do canditado: \n");
            scanf("%d",&temp_insc);

            do
            {
                printf("Digite a idade do canditado: \n");
                scanf("%d",&temp_idade);
            }
            while(temp_idade < 0);

            do
            {
                printf("Digite a pontuacao alcancada do canditado: \n");
                scanf("%d",&temp_pont);
            }
            while(temp_pont < 0 || temp_pont > 100);

            printf("Digite o codigo do curso que o canditado deseja: \n");
            printf("Sistemas...................1\n");
            printf("Agrimensura................2\n");
            printf("Florestal..................3\n");
            printf("Geologia...................4\n");
            scanf("%d",&temp_cod);

            switch(temp_cod)
            {
            case 1:
                if(vag_s<MAX)
                {
                    vagas_s[vag_s].num_insc = temp_insc;
                    vagas_s[vag_s].idade = temp_idade;
                    vagas_s[vag_s].pont = temp_pont;
                    vagas_s[vag_s].cod_curso = temp_cod;
                    if(vagas_s[vag_s].pont < menor_s)
                    {
                        pos_ms = vag_s;
                        menor_s = vagas_s[vag_s].pont;
                    }
                    vag_s++;

                }
                else
                {
                    if(vag_s == MAX)
                    {
                        if(temp_pont > vagas_s[pos_ms].pont)
                        {
                            vagas_s[pos_ms].num_insc = temp_insc;
                            vagas_s[pos_ms].idade = temp_idade;
                            vagas_s[pos_ms].pont = temp_pont;
                            vagas_s[pos_ms].cod_curso = temp_cod;
                            menor_s = 101;
                            for(i=0; i<MAX; i++)
                            {
                                if(vagas_s[i].pont < menor_s)
                                {
                                    pos_ms = i;
                                    menor_s = vagas_s[i].pont;
                                }
                            }
                        }
                        else if(temp_pont == vagas_s[pos_ms].pont && temp_idade > vagas_s[pos_ms].idade)
                        {
                            vagas_s[pos_ms].num_insc = temp_insc;
                            vagas_s[pos_ms].idade = temp_idade;
                            vagas_s[pos_ms].pont = temp_pont;
                            vagas_s[pos_ms].cod_curso = temp_cod;
                            menor_s = 101;
                            for(i=0; i<MAX; i++)
                            {
                                if(vagas_s[i].pont < menor_s)
                                {
                                    pos_ms = i;
                                    menor_s = vagas_s[i].pont;
                                }
                            }
                        }
                        else
                        {
                            printf("O canditado nao foi aprovado!");
                        }

                    }
                }
                break;
            case 2:
                if(vag_a<MAX)
                {
                    vagas_a[vag_a].num_insc = temp_insc;
                    vagas_a[vag_a].idade = temp_idade;
                    vagas_a[vag_a].pont = temp_pont;
                    vagas_a[vag_a].cod_curso = temp_cod;
                    if(vagas_a[vag_a].pont < menor_a)
                    {
                        pos_ma = vag_a;
                        menor_a = vagas_a[vag_a].pont;
                    }
                    vag_a++;

                }
                else
                {
                    if(vag_a == MAX)
                    {

                        if(temp_pont > vagas_a[pos_ma].pont)
                        {
                            vagas_a[pos_ma].num_insc = temp_insc;
                            vagas_a[pos_ma].idade = temp_idade;
                            vagas_a[pos_ma].pont = temp_pont;
                            vagas_a[pos_ma].cod_curso = temp_cod;
                            menor_a = 101;
                            for(i=0; i<MAX; i++)
                            {
                                if(vagas_a[i].pont < menor_a)
                                {
                                    pos_ma = i;
                                    menor_a = vagas_a[i].pont;
                                }
                            }
                        }
                        else if(temp_pont == vagas_a[pos_ma].pont && temp_idade > vagas_a[pos_ma].idade)
                        {
                            vagas_a[pos_ma].num_insc = temp_insc;
                            vagas_a[pos_ma].idade = temp_idade;
                            vagas_a[pos_ma].pont = temp_pont;
                            vagas_a[pos_ma].cod_curso = temp_cod;
                            menor_a = 101;
                            for(i=0; i<MAX; i++)
                            {
                                if(vagas_a[i].pont < menor_a)
                                {
                                    pos_ma = i;
                                    menor_a = vagas_a[i].pont;

                                }


                            }
                        }
                        else
                        {
                            printf("O canditado nao foi aprovado!");
                        }
                    }
                }
                break;
            case 3:
                if(vag_f<MAX)
                {
                    vagas_f[vag_f].num_insc = temp_insc;
                    vagas_f[vag_f].idade = temp_idade;
                    vagas_f[vag_f].pont = temp_pont;
                    vagas_f[vag_f].cod_curso = temp_cod;
                    if(vagas_f[vag_f].pont < menor_f)
                    {
                        pos_mf = vag_f;
                        menor_f = vagas_f[vag_f].pont;
                    }

                    vag_f++;
                }
                else
                {
                    if(vag_f == MAX)
                    {
                        if(temp_pont > vagas_f[pos_mf].pont)
                        {
                            vagas_f[pos_mf].num_insc = temp_insc;
                            vagas_f[pos_mf].idade = temp_idade;
                            vagas_f[pos_mf].pont = temp_pont;
                            vagas_f[pos_mf].cod_curso = temp_cod;
                            menor_f = 101;
                            for(i=0; i<MAX; i++)
                            {
                                if(vagas_f[i].pont < menor_f)
                                {
                                    pos_mf = i;
                                    menor_f = vagas_f[i].pont;
                                }
                            }
                        }
                        else if(temp_pont == vagas_f[pos_mf].pont && temp_idade > vagas_f[pos_mf].idade)
                        {
                            vagas_f[pos_mf].num_insc = temp_insc;
                            vagas_f[pos_mf].idade = temp_idade;
                            vagas_f[pos_mf].pont = temp_pont;
                            vagas_f[pos_mf].cod_curso = temp_cod;
                            menor_f = 101;
                            for(i=0; i<MAX; i++)
                            {
                                if(vagas_f[i].pont < menor_f)
                                {
                                    pos_mf = i;
                                    menor_f = vagas_f[i].pont;
                                }
                            }
                        }
                        else
                        {
                            printf("O canditado nao foi aprovado!");
                        }

                    }
                }
                break;
            case 4:
                if(vag_g<MAX)
                {
                    vagas_g[vag_g].num_insc = temp_insc;
                    vagas_g[vag_g].idade = temp_idade;
                    vagas_g[vag_g].pont = temp_pont;
                    vagas_g[vag_g].cod_curso = temp_cod;
                    if(vagas_g[vag_g].pont < menor_g)
                    {
                        pos_mg = vag_g;
                        menor_g = vagas_g[vag_g].pont;
                    }

                    vag_g++;
                }
                else
                {
                    if(vag_g == MAX)
                    {

                        if(temp_pont > vagas_g[pos_mg].pont)
                        {
                            vagas_g[pos_mg].num_insc = temp_insc;
                            vagas_g[pos_mg].idade = temp_idade;
                            vagas_g[pos_mg].pont = temp_pont;
                            vagas_g[pos_mg].cod_curso = temp_cod;
                            menor_g = 101;
                            for(i=0; i<MAX; i++)
                            {
                                if(vagas_g[i].pont < menor_g)
                                {
                                    pos_mg = i;
                                    menor_g = vagas_g[i].pont;
                                }
                            }
                        }
                        else if(temp_pont == vagas_g[pos_mg].pont && temp_idade > vagas_g[pos_mg].idade)
                        {
                            vagas_g[pos_mg].num_insc = temp_insc;
                            vagas_g[pos_mg].idade = temp_idade;
                            vagas_g[pos_mg].pont = temp_pont;
                            vagas_g[pos_mg].cod_curso = temp_cod;
                            menor_g = 101;
                            for(i=0; i<MAX; i++)
                            {
                                if(vagas_g[i].pont < menor_g)
                                {
                                    pos_mg = i;
                                    menor_g = vagas_g[i].pont;
                                }
                            }

                        }
                        else
                        {
                            printf("O canditado nao foi aprovado!");
                        }

                    }
                    break;
                }
            }
        }
        if(op == 2)
        {
            printf("Imprimir aprovados de sistema..............1\n");
            printf("Imprimir aprovados de agrimensura..........2\n");
            printf("Imprimir aprovados de florestal............3\n");
            printf("Imprimir aprovados de geologia.............4\n");
            scanf("%d", &opimprimir);
            switch(opimprimir)
            {
            case 1:
                printf("Alunos aprovados de sistemas: \n\n");
                for(i=0; i<vag_s; i++)
                {
                    printf("Aprovado[%d]: Numero de inscricao - %d; Idade - %d; Pontuacao alcancada - %d; Codigo do curso - %d; \n\n", i+1, vagas_s[i].num_insc, vagas_s[i].idade, vagas_s[i].pont, vagas_s[i].cod_curso);
                }
                break;
            case 2:
                printf("Alunos aprovados de agrimensura: \n\n");
                for(i=0; i<vag_a; i++)
                {
                    printf("Aprovado[%d]: Numero de inscricao - %d; Idade - %d; Pontuacao alcancada - %d; Codigo do curso - %d; \n\n", i+1, vagas_a[i].num_insc, vagas_a[i].idade, vagas_a[i].pont, vagas_a[i].cod_curso);
                }
                break;
            case 3:
                printf("Alunos aprovados de florestal: \n\n");
                for(i=0; i<vag_f; i++)
                {
                    printf("Aprovado[%d]: Numero de inscricao - %d; Idade - %d; Pontuacao alcancada - %d; Codigo do curso - %d; \n\n", i+1, vagas_f[i].num_insc, vagas_f[i].idade, vagas_f[i].pont, vagas_f[i].cod_curso);
                }
                break;
            case 4:
                printf("Alunos aprovados de geologia: \n\n");
                for(i=0; i<vag_g; i++)
                {
                    printf("Aprovado[%d]: Numero de inscricao - %d; Idade - %d; Pontuacao alcancada - %d; Codigo do curso - %d; \n\n", i+1, vagas_g[i].num_insc, vagas_g[i].idade, vagas_g[i].pont, vagas_g[i].cod_curso);
                }
                break;
            }
        }
    }
    while(op != 0);

    return 0;
}
