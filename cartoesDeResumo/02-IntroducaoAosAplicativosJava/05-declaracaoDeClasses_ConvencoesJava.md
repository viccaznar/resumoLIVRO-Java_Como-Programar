## 📦 Capítulo 1: Sintaxe de Classes e Identificadores

### 1.1 Declaração de Classe 🏷️
Toda aplicação Java tem pelo menos uma classe. A palavra-chave class inicia a declaração, seguida pelo nome da classe.


  - **Exemplo lúdico** Como a planta de uma casa: “class Casa” define paredes, portas e janelas antes de construir.


```java
public class Welcome1 {
    // corpo da classe
}
```

### 1.2 Identificadores e Convenções para Nomes de Variáveis e Constantes 🔤
- Só letras, dígitos, _ e $

- Não inicia com dígito

- Sensível a maiúsculas/minúsculas


  - **Exemplo lúdico** Como nomear arquivos numa biblioteca: “Livro1” é diferente de “livro1”.


### 1.2.2 Convenção de Nomes de Classe 
Identificadores de classe começam com letra maiúscula e usam “CamelCase” para múltiplas palavras.


  - **Exemplo lúdico** “MinhaClasseLegal” em vez de “minhaclasselegal” facilita a leitura como títulos de livros.


### 1.3 Chaves e Indentação 🔧

### 1.3.1 Pares de Chaves
Cada `{` deve ter seu `}` correspondente para delimitar blocos de classe, método ou controle.


  - **Exemplo lúdico** Como uma caixa com tampa: se faltar a tampa (`}`), o conteúdo explode.


### 1.3.2 Indentação e Linhas em Branco
Espaços, tabs e linhas em branco não afetam a execução, mas melhoram a legibilidade.


  - **Exemplo lúdico** Como espaçar móveis em um cômodo: fica mais fácil circular sem trombar.


```java
public class Exemplo {
   public static void main(String[] args) {
      System.out.println("Indentação limpa!");
   }
}
```

## 🛠️ Capítulo 2: Boas Práticas & Cenários Reais

### 2.1 Boas Práticas de Documentação ✅
- `Cabeçalho de Arquivo`: inclua nome, data, autor e propósito.

- `Comentários Claros`: explique “por quê”, não só “o quê”.

- `Javadoc Completo`: documente classes públicas e métodos expostos.

- `Indentação Consistente`: adote padrão (três espaços ou 2/4 tabs).

- `Linhas em Branco`: separe blocos lógicos de código.


  - **Exemplo lúdico** Como um manual de montagem de mobília: cada passo (método) tem instruções detalhadas e diagramas (Javadoc).


### 2.2 Cenários Reais em Negócios 🌐
`Frameworks Corporativos`: equipes de dezenas de desenvolvedores utilizam guias de estilo e Javadoc para manter componentes consistentes e reutilizáveis.

`APIs Externas`: prestadores de serviço publicam docs HTML via javadoc para que clientes integrem sistemas sem ler código-fonte.

`Revisão de Código (Code Review)`: comentários bem escritos ajudam revisores a entender fluxo e intenções, reduzindo bugs.

`Ferramentas de Qualidade`: análises estáticas (SonarQube, Checkstyle) aplicam regras de comentários, indentação e convenção de nomes automaticamente.

  - **Exemplo lúdico** Em uma editora digital, cada livro (classe) segue template padrão (cabeçalho, capítulos, notas de rodapé), e revisores (code review) garantem uniformidade antes da publicação.


```java
/**
 * Calculadora simples de exemplo.
 * <p>Suporta soma e subtração de inteiros.</p>
 * @since 1.0
 */
public class Calculadora {
   // Soma dois inteiros
   public int somar(int a, int b) {
      return a + b;
   }
}
```


```java
// Uso da Calculadora
public class Teste {
   public static void main(String[] args) {
      Calculadora calc = new Calculadora();
      System.out.println(calc.somar(3, 5));  // imprime 8
   }
}
```