# 🚀 Capítulo 1: Introdução aos Aplicativos Java    

## 🤔 1.1 Instruções de Decisão
Use if e if-else para executar blocos de código condicionalmente.


 - **Exemplo lúdico:** Como uma placa de trânsito: “Se luz verde, siga em frente; senão (else), pare.”


```java
if (x > y) {
    System.out.println("x é maior que y");
} else {
    System.out.println("x não é maior que y");
}
```


## 🔍 1.2 Operadores Relacionais e de Igualdade
Permitem comparar valores:

- `<, >, <=, >=`

- Igualdade: `==`

- Diferença: `!=`


 - **Exemplo lúdico:** Comparar alturas de balões: um balão é “>” outro; verificar se dois gêmeos medem “==” a mesma altura.


```java
if (x > y) {
    System.out.println("x é maior que y");
} else {
    System.out.println("x não é maior que y");
}
```


## 🛠️ Capítulo 2: Boas Práticas & Cenários Reais        

### 💡 2.1 Boas Práticas
- Use nomes claros para classes e variáveis.

- Comente trechos complexos de lógica.

- Valide entradas (não permita altura = 0).

- Extraia cálculos e I/O em métodos separados.

- Evite “números mágicos”: use constantes nomeadas.

- Mantenha cada método com responsabilidade única.


 - **Exemplo lúdico:** Como montar um quebra-cabeça, use peças numeradas (variáveis claras), leia o guia de montagem (comentários) e confirme cada encaixe (validação).


### 🌟 2.2 Cenários Reais
- `Aplicativo de Faturamento:` lê quantidade e preço, calcula total e aplica desconto condicional.

- `Formulário de Cadastro:` recebe nome, idade e retorna mensagem personalizada (decisão).

- `Ferramenta de Test-Drive:` programação de calculadora de IMC e pegada de carbono (exercícios de capítulo 1).

- `Console de Monitoramento:` coleta métricas (tipos primitivos), avalia limites (decisões) e exibe alertas (I/O).


 - **Exemplo lúdico:** Em um call center, cada atendente (método) faz uma tarefa: recebe dados (Scanner), processa cálculos (operadores), decide ação (if-else) e informa o cliente (println).


```java
// Exemplo simplificado de soma e decisão
import java.util.Scanner;
public class SomaDecisao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int a = in.nextInt();
        System.out.print("B: "); int b = in.nextInt();
        int soma = a + b;
        System.out.printf("Soma = %d%n", soma);
        if (soma % 2 == 0) {
            System.out.println("Soma é par");
        } else {
            System.out.println("Soma é ímpar");
        }
    }
}
```
