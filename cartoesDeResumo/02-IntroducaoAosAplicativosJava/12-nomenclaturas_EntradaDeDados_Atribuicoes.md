# 🏷️ Capítulo 1: Convenções de Nomenclatura e Prompts

## 1.1 Convenção de Nomes de Variáveis 🔤 
Identificadores de variáveis começam com letra minúscula e seguem o padrão lowerCamelCase (cada nova palavra inicia em maiúscula).  


  - **Exemplo lúdico:** É como batizar seus cachorros: “firstNumber” é claro como “rexJunior”, enquanto “Firstnumber” ou “first_number” podem confundir quem chama no parque.


## 1.2 Prompts e Métodos print vs println 💬  
- `print(...)` exibe texto sem pular linha, deixando o cursor no final.  

- `println(...)` exibe texto e quebra a linha ao final.  


  - **Exemplo lúdico:** Imagine um garçom que pergunta “Qual seu pedido?” e espera na mesma linha pela resposta (print), versus um garçom que escreve no quadro e vai para a próxima linha (println).


```java
System.out.print("Enter first integer: ");
System.out.println("Thank you!");
```


## 🔢 Capítulo 2: Entrada de Dados e Atribuição

### 2.1 Scanner e nextInt 📥
A classe Scanner lê dados do console. O método `nextInt()` espera o usuário digitar um inteiro e teclar Enter.


  - **Exemplo lúdico:** Como um atendente que segura um bloco de anotações (Scanner) e anota o primeiro número que você fala antes de passar para o próximo.


```java
Scanner input = new Scanner(System.in);
int number1 = input.nextInt();
```

### 2.2 Operador de Atribuição “=” ➡️
O sinal `=` atribui o valor da expressão à variável do lado esquerdo. A expressão à direita é avaliada primeiro.


  - **Exemplo lúdico:** É como encher um copo (variável) com suco (expressão): primeiro você pega o suco do jarro (avalia), depois despeja no copo (atribui).


```java
number1 = input.nextInt();
```


### 2.3 Expressões e Valores ✏️
Qualquer parte de uma instrução que produz um valor é uma expressão (por exemplo, number1 + number2).


  - **Exemplo lúdico:** Como uma receita que diz “2 xícaras + 3 xícaras”: a soma “5 xícaras” é o valor final da expressão.


```java
int sum = number1 + number2;  // expressão number1 + number2
```