#include <stdio.h>

float serie_S(int n) {
    if (n == 1) {
        return 2.0f;
    }
    return (1.0f + n * n) / n + serie_S(n - 1);
}

int main() {
    int n;
    printf("Insira um valor para n (n > 0): ");
    scanf("%d", &n);

    float resultado = serie_S(n);
    printf("O valor da serie S para n = %d e: %f\n", n, resultado);
    return 0;
}
