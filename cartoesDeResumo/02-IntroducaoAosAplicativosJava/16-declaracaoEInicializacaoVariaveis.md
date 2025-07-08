# 🧮 Capítulo 1: Declaração e Inicialização de Variáveis

## 1.1 Declarando Scanner 🔎   
`Scanner input = new Scanner(System.in);` cria objeto Scanner que lê dados do teclado.


  - **Exemplo lúdico:** É como designar um atendente (input) para anotar pedidos de clientes (System.in) antes de enviá-los à cozinha (programa).


## 1.2 Variáveis Primitivas 🚩  
- `int`: números inteiros (-2^31 a 2^31-1)  

- `float`/`double`: números reais com casas decimais  

- `char`: caractere único  

- Outros: `boolean`, `byte`, `short`, `long`


  - **Exemplo lúdico:** Como usar potes de tamanhos diferentes: o pote `int` comporta unidades inteiras, `double` comporta frações, `char` guarda uma única letra.


# ⚙️ Capítulo 2: Atribuição e Expressões

## 2.1 Operador de Atribuição `=` ➡️  
`variavel = expressão;` avalia a expressão e armazena o valor na variável.  


  - **Exemplo lúdico:** Como encher um copo (variável) com suco (expressão): primeiro você obtém o suco, depois despeja no copo.


```java
number1 = input.nextInt();  // atribui valor lido à variável
```


## 2.2 Expressões e Operadores Binários ➕
Expressão é qualquer parte de instrução com valor (por ex., number1 + number2). Operadores binários (+, -, *, /) têm dois operandos.


  - **Exemplo lúdico:** Como misturar 2 xícaras de leite e 3 de café: o resultado (5 xícaras) é o valor da expressão “2 + 3”.


```java
sum = number1 + number2;    // expressão number1 + number2
```


## 2.3 printf com Placeholders 📋
`System.out.printf("Sum is %d\n", sum);` usa %d como marcador para inteiros.


  - **Exemplo lúdico:** Imagine molduras vazias (%d) numa galeria; printf preenche cada moldura com pinturas (valores) conforme a ordem dos argumentos.


```java
System.out.printf("Sum is %d\n", sum);  // usa %d para inteiros
```

## 2.4 Boas Práticas de Declaração ✅
- Declare cada variável em linha separada para inserir comentários claros.

- Use lowerCamelCase para variáveis (firstNumber).

- Coloque espaços ao redor de operadores binários (a + b).

- Separe imports antes de public class.


  - **Exemplo lúdico:** Como catalogar ingredientes em prateleiras numeradas: cada pote (variável) tem rótulo e descrição (comentário), e utensílios (imports) ficam na bancada antes do preparo (código).


## 2.5 Cenários Reais em Negócios 🌟
- `Formulários Bancários`: leem valores de depósito (Scanner), armazenam em double amount e exibem saldo formatado com printf.

- `Relatórios Financeiros`: calculam (sum = val1 + val2), documentam cada variável e imprimem tabelas no console para auditoria.

- `Ferramentas CLI de DevOps`: scripts Java importam bibliotecas externas (import), leem parâmetros (args), atribuem variáveis e exibem status (printf).


  - **Exemplo lúdico:** Em uma cafeteria automatizada, cada ingrediente (variável) é medido separadamente, somado à receita (expressão), documentado no sistema (comentários) e exibido na tela do barista (printf) antes de servir o café.


```java
import java.util.Scanner;  // Import antes da classe

public class Addition {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);  // declarando Scanner

      // lê dois inteiros do usuário
      System.out.print("Enter first integer: ");
      int number1 = input.nextInt();
      System.out.print("Enter second integer: ");
      int number2 = input.nextInt();

      int sum = number1 + number2;  // expressão de soma

      // exibe resultado formatado
      System.out.printf("Sum is %d\n", sum);

      input.close();  // liberar recurso
   }
}
```

```bash
javac Addition.java
java Addition
```

```plaintext
Enter first integer: 10
Enter second integer: 20
Sum is 30
```