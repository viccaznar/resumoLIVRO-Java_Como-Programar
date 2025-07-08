# 🤔 Capítulo 1: Condições e Operadores de Comparação

## 1.1 Condição Booleana 🔀    
Expressão que resulta em `true` ou `false`. Usada em `if` para decidir quais instruções executar.  


  - **Exemplo lúdico:** Imagine uma porta de segurança que só abre se o sensor confirmar “altura ≥ 1,50 m”. Se a condição for verdadeira, a porta se abre; caso contrário, permanece fechada.


## 1.2 Operadores de Igualdade ❎✅  
- `==` verifica se dois valores são iguais.  

- `!=` verifica se são diferentes.  

  - **Exemplo lúdico:** Dois gêmeos confirmam aniversário:  

    - `==` é perguntar “fazemos aniversário no mesmo dia?”  

    - `!=` é perguntar “fazemos em dias diferentes?”


## 1.3 Operadores Relacionais 📏  
- `>`  maior que  

- `<`  menor que  

- `>=` maior ou igual  

- `<=` menor ou igual  


  - **Exemplo lúdico:** Compare alturas em centímetros:  

    - `170 > 165` para saber se você é mais alto que seu amigo;  

    - `170 <= 170` para checar empate de altura.



## 1.4 Precedência e Associatividade 🏗️  
- Relacionais (`>`, `<`, `>=`, `<=`) têm precedência maior que igualdade (`==`, `!=`).  

- Dentro de cada grupo, associam da esquerda para a direita.


  - **Exemplo lúdico:** Num jogo de tabuleiro, você resolve primeiro movimentos (relacionais), depois valida empates (igualdade), seguindo a ordem das jogadas.


# 💻 Capítulo 2: Exemplo Prático – Comparison.java

## 2.1 Leitura de Dados com Scanner 📥  
Use `Scanner` para capturar inteiros digitados pelo usuário.  


```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Enter first integer: ");
int number1 = input.nextInt();
System.out.print("Enter second integer: ");
int number2 = input.nextInt();
```


  - **Exemplo lúdico:** Como um recepcionista anotando dois pedidos em seu bloco antes de passar à cozinha.