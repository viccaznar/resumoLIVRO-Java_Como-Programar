# 🔧 Capítulo 1: Declarações import e Estrutura de Classe

## 1.1 Erro Comum: Import após declaração de classe ❌  
Todas as declarações `import` devem aparecer antes da primeira `public class`. Caso contrário, ocorre erro de sintaxe.


  - **Exemplo lúdico:** Como tentar colocar cartazes (imports) dentro de uma porta (classe) já fechada: os avisos não serão vistos e o prédio (compilador) reclamará.


## 1.2 Dica de Prevenção: Verificar Imports 🔍  
Esquecer `import` gera “cannot find symbol”. Revise nomes e capitalização nas declarações de import.


  - **Exemplo lúdico:** É como tentar usar uma ferramenta sem levá-la até a obra: o operário (compilador) diz que não encontrou a chave inglesa (classe).


# 🏗️ Capítulo 2: Declaração de Classe e Métodos

## 2.1 Declaração de Classe 📘  
`public class Addition` inicia a classe. O arquivo deve chamar-se `Addition.java`. O corpo da classe está entre `{}`.


  - **Exemplo lúdico:** Como batizar uma casa de “Addition” e guardar a planta no arquivo “Addition.java”. 


## 2.2 Estrutura do Método `main` 🎬  
- O método `main` começa em `{` e termina em `}`.  

- Indente um nível dentro da classe e mais um nível dentro do método.

  - **Exemplo lúdico:** Imagine um palco dentro de um teatro: a cortina externa (classe) e a área de atuação (main) precisam ser claramente demarcadas, com profissionais (código) posicionados em camadas.


# 🧮 Capítulo 3: Declaração e Inicialização de Variáveis

## 3.1 Declarando Scanner 🔎   
`Scanner input = new Scanner(System.in);` cria objeto Scanner que lê dados do teclado.


  - **Exemplo lúdico:** É como designar um atendente (input) para anotar pedidos de clientes (System.in) antes de enviá-los à cozinha (programa).


## 3.2 Variáveis Primitivas 🚩  
- `int`: números inteiros (-2^31 a 2^31-1)  

- `float`/`double`: números reais com casas decimais  

- `char`: caractere único  

- Outros: `boolean`, `byte`, `short`, `long`


  - **Exemplo lúdico:** Como usar potes de tamanhos diferentes: o pote `int` comporta unidades inteiras, `double` comporta frações, `char` guarda uma única letra.


# ⚙️ Capítulo 4: Atribuição e Expressões

## 4.1 Operador de Atribuição `=` ➡️  
`variavel = expressão;` avalia a expressão e armazena o valor na variável.  


  - **Exemplo lúdico:** Como encher um copo (variável) com suco (expressão): primeiro você obtém o suco, depois despeja no copo.


```java
number1 = input.nextInt();  // atribui valor lido à variável
```


## 4.2 Expressões e Operadores Binários ➕
Expressão é qualquer parte de instrução com valor (por ex., number1 + number2). Operadores binários (+, -, *, /) têm dois operandos.


  - **Exemplo lúdico:** Como misturar 2 xícaras de leite e 3 de café: o resultado (5 xícaras) é o valor da expressão “2 + 3”.


```java
sum = number1 + number2;    // expressão number1 + number2
```


## 5.1 printf com Placeholders 📋
`System.out.printf("Sum is %d\n", sum);` usa %d como marcador para inteiros.


  - **Exemplo lúdico:** Imagine molduras vazias (%d) numa galeria; printf preenche cada moldura com pinturas (valores) conforme a ordem dos argumentos.


```java
System.out.printf("Sum is %d\n", sum);  // usa %d para inteiros
```

## 6.1 Boas Práticas de Declaração ✅
- Declare cada variável em linha separada para inserir comentários claros.

- Use lowerCamelCase para variáveis (firstNumber).

- Coloque espaços ao redor de operadores binários (a + b).

- Separe imports antes de public class.


  - **Exemplo lúdico:** Como catalogar ingredientes em prateleiras numeradas: cada pote (variável) tem rótulo e descrição (comentário), e utensílios (imports) ficam na bancada antes do preparo (código).


## 6.2 Cenários Reais em Negócios 🌟
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