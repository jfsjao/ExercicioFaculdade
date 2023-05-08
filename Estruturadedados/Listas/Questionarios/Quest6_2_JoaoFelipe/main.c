#include <stdio.h>
#include <stdlib.h>

int fatorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * fatorial(n - 1);
}

int fatorial_quadruplo(int n) {
    return fatorial(2 * n) / fatorial(n);
}

int main() {
    int n;
    printf("Insira um numero inteiro positivo: \n");
    printf("(dependendo do valor inserido o programa ira crashar, por conta de ter um retorno muito extenso) \n ");
    scanf("%d", &n);
    int resultado = fatorial_quadruplo(n);
    printf("O fatorial quadruplo de %d e: %d\n", n, resultado);
    return 0;
}
