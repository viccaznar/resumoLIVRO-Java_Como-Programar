# 🚀 Capítulo 1: Introdução aos Aplicativos Java

## 🎯 Objetivos  
- Escrever aplicativos Java simples  

- Utilizar instruções de entrada e saída  

- Conhecer tipos primitivos do Java  

- Entender conceitos básicos de memória  

- Aplicar operadores aritméticos  

- Respeitar precedência de operadores  

- Escrever instruções de decisão (`if`/`else`)  

- Utilizar operadores relacionais e de igualdade  


## ✍️ 1.1 Introdução   
Neste capítulo você cria programas Java que exibem mensagens, leem dois números do usuário, somam-nos e avaliam condições para gerar saídas diferentes.


 - **Exemplo lúdico:** Imagine um mágico que primeiro apresenta um truque simples (imprime texto), depois pede que o público escolha dois números (entrada), mistura-os (soma) e revela o resultado de forma dramática (decisão).


## 💻 1.2 Primeiro Programa: Imprimindo Texto  
Um "Hello World" Java usa `System.out.println` no método `main` para exibir texto na tela.  


 - **Exemplo lúdico:** Como erguer um banner em um estádio: basta pendurar a mensagem e apertar um botão.


```java
// Welcome1.java
public class Welcome1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");
    }
}
```

### Análise do método Welcome1();
>>> `Linha 1`: Vamos dissecar o código linha por linha:

```java
Linha 1: // Welcome1.java
// (...)
```

  - **O que faz:** Este é um comentário no código. Comentários são ignorados pelo compilador e servem para ajudar os programadores a entenderem o propósito ou funcionamento do código.

  - **Exemplo lúdico:** Imagine que você está escrevendo um diário de bordo para uma viagem espacial. Este comentário seria como o título do dia: "Dia 1 - Preparativos para o lançamento".


>>> `Linha 2`: public class Welcome1 {

```java
public class Welcome1 {...}
```

  - **O que faz:** Define uma classe chamada Welcome1. Em Java, toda aplicação começa com uma classe.

  - **Detalhe:** A palavra-chave public indica que a classe pode ser acessada por outras partes do programa.

  - **Exemplo lúdico:** Pense na classe como uma nave espacial chamada "Welcome1". Ela é pública, então qualquer astronauta (outro código) pode vê-la e interagir com ela.


>>> `Linha 3`: public static void main(String[] args) {

```java
public static void main(String[] args) {...}
```

  - **O que faz:** Este é o ponto de entrada do programa. Quando você executa o código, o método main é chamado.

  - **Detalhe:**

    - **public:** O método pode ser acessado de fora da classe.

    - **static:** O método pertence à classe e não a uma instância específica.

    - **void:** O método não retorna nenhum valor.

    - **String[] args:** Um parâmetro que pode receber argumentos da linha de comando.

    - **Exemplo lúdico:** Imagine que o método main é o botão de "ignição" da nave espacial. Quando você aperta o botão, a nave começa sua jornada.


>>> `Linha 4`: System.out.println("Welcome to Java Programming!");

```java
System.out.println("Welcome to Java Programming!");
```

  - **O que faz:** Imprime a mensagem "Welcome to Java Programming!" no console.

  - **Detalhe:**

    - **System.out:** Representa a saída padrão do sistema (geralmente o console).

    - **println:** Imprime a mensagem seguida de uma nova linha.

    - **Exemplo lúdico:** Imagine que este comando é como o alto-falante da nave anunciando: "Bem-vindo à programação Java!" para todos os astronautas a bordo.


>>> `Linha 5`: (...) main(String[] args) {...}

```java
(...) main(String[] args) {...}
```

  - **O que faz:** Fecha o método main.

  - **Exemplo lúdico:** É como fechar a tampa do painel de controle após apertar o botão de ignição.


>>> `Linha 6`: public class Welcome1 {...}

```java
public class Welcome1 {...}
```

  - **O que faz:** Fecha a classe Welcome1.

  - **Exemplo lúdico:** É como fechar a escotilha da nave espacial após todos os preparativos serem concluídos.


### Resumo lúdico

Imagine que você é um astronauta prestes a embarcar na nave "Welcome1". Primeiro, você dá um nome ao diário de bordo (comentário). Depois, apresenta sua nave ao mundo (classe pública). Em seguida, aperta o botão de ignição (método main) e ouve uma mensagem de boas-vindas pelo alto-falante (comando System.out.println). Por fim, fecha o painel de controle e a escotilha, pronto para explorar o universo da programação Java!

  - **Exemplo lúdico:** É como fechar a escotilha da nave espacial após todos os preparativos serem concluídos.