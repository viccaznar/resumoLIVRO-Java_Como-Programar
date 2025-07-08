# 🚀 Capítulo 1: I/O, Tipos Primitivose Operadores Aritméticos

## 🎤 1.3 Entrada e Saída
`Saída:` System.out.print ou println envia texto para o console.

`Entrada:` Scanner lê dados do usuário via teclado.


 - **Exemplo lúdico:** Pense em um garçom (programa) que pergunta seu pedido (leitura) e depois serve o prato (impressão).


```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Digite dois inteiros: ");
int a = input.nextInt();
int b = input.nextInt();
System.out.printf("Você digitou %d e %d%n", a, b);
```

## 📦 1.4 Tipos Primitivos
Java oferece oito tipos básicos:

- `Números inteiros:` byte, short, int, long

- `Números reais:` float, double

- `Caractere:` char

- `Booleano:` boolean


 - **Exemplo lúdico:** Como potes de tamanhos variados: de um pote minúsculo (byte) a um balde gigante (long), recipientes para diferentes quantidades.


## 🧠 1.5 Conceitos Básicos de Memória
Variáveis Java são espaços na memória (stack ou heap) que guardam valores temporários durante a execução.


 - **Exemplo lúdico:** Imagine sua mesa de trabalho: um post‐it (stack) guarda anotações rápidas, e uma caixa de arquivo (heap) armazena documentos até você precisar.


## ➕➖ 1.6 Operadores Aritméticos
Permitem realizar:

- Adição +

- Subtração -

- Multiplicação *

- Divisão /

- Módulo %


 - **Exemplo lúdico:** Como um chef misturando ingredientes: cada operador é uma colher diferente para adicionar, subtrair ou dividir porções.


```java
int soma = 5 + 3;      // 8  
int resto = 10 % 4;    // 2
```

## 🕹 1.7 Precedência de Operadores 
A ordem padrão é:

- *, /, %

- +, - 

Use parênteses () para alterar essa ordem.


 - **Exemplo lúdico:** Em uma cozinha, você corta ingredientes (multiplicação) antes de mexer a panela (adição). Se quiser misturar primeiro, coloque tudo no bowl (parênteses).


```java
int x = 2 + 3 * 4;       // 14  
int y = (2 + 3) * 4;     // 20
```
