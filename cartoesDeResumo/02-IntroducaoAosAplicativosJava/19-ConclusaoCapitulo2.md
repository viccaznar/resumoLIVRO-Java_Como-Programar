# 📚 Capítulo 1: Conclusão e Resumo

## 🎯 1.9 Conclusão   
Você aprendeu a exibir e ler dados, realizar cálculos, usar condicionais e formatação básica. No próximo capítulo, criará suas próprias classes e objetos para estruturar programas Java de forma modular.


  **Exemplo lúdico:** É como aprender passos de dança individuais (impressão, entrada, soma, decisão) antes de coreografar uma apresentação completa (classes e objetos).


# 🔍 Seção 1.2: Nosso Primeiro Programa Java

## 1.2.1 Aplicativos Java e JVM ☕  
- Java apps rodam via `java Classe`, carregando a JVM  

- Comentários (`//`, `/* */`, `/** */`) documentam código e são ignorados  

- Erros de sintaxe ocorrem na compilação (violação de gramática Java)  


  **Exemplo lúdico:** Comentários são notas marginais num mapa de tesouro, a JVM é o barco que zarpa apenas com um mapa válido (código compilado).


# ✍️ Seção 1.3: Modificando Nosso Programa

## 1.3.1 print vs println 🖨️  
- `print`: não pula linha  

- `println`: pula linha  

- `\n`: nova linha em literais de string  


  **Exemplo lúdico:** Como montar frases com faixas emendadas (`print`) ou soltar banners um abaixo do outro (`println`).


# 📋 Seção 1.4: Exibindo Texto com printf

## 1.4.1 printf Formatted Output 🎨  
- `printf` formata com placeholders (`%s`, `%d`, `%f`, `%%`)  

- `Primeiro argumento:` string de formato; depois, valores correspondentes  


  **Exemplo lúdico:** Molduras vazias num quadro (`%s`) preenchidas por pinturas (argumentos) seguindo uma ordem.



# ➕ Seção 1.5: Outro Aplicativo – Somando Inteiros

## 1.5.1 Import e Scanner 📦  
- `import java.util.Scanner;` antes de `public class`  

- Scanner lê entrada do teclado (`nextInt()`)  


## 1.5.2 Variáveis e Tipos Primitivos 🔢  
- Declare variáveis com nome e tipo antes de usar (`int`, `float`, `double`, `char`)  

- Inicialize antes de utilizar  


## 1.5.3 Atribuição e Expressões 🤓  
- Operador binário `=` atribui valor à variável  

- Expressão: parte de instrução que produz valor (e.g., `a + b`)  


## 1.5.4 Saída com printf 🖨️  
- `%d` para inteiros; `%s` para strings; `\n` para nova linha  


# 🧠 Seção 1.6: Conceitos de Memória

## 1.6.1 Variáveis e Memória 💾  
- Cada variável ocupa uma posição de memória com nome, tipo, tamanho e valor  

- Atribuir novo valor substitui o anterior  


  **Exemplo lúdico:** Como caixas rotuladas num armário: cada caixa guarda um objeto (valor) e troca o conteúdo toda vez que você deposita algo novo.


# 🧮 Seção 2.7: Aritmética

## 2.7.1 Operadores Aritméticos ➕➖  
- `+`, `-`, `*`, `/`, `%`  

- Divisão inteira descarta resto; `%` fornece resto


## 2.7.2 Precedência e Associatividade 🏗️  
- Multiplicativo antes de aditivo; use parentheses para clareza  

- Operadores aritméticos associam da esquerda para a direita  


  **Exemplo lúdico:** Como resolver expressões numéricas: multiplique ingredientes antes de somar receitas; se em dúvida, coloque tudo entre parentheses.


# 🤔 Seção 2.8: Tomada de Decisão

## 2.8.1 Instrução if 📘  
- `Sintaxe:` if (condição) instrução;`  

- `Condição:` expressão booleana  


## 2.8.2 Operadores de Comparação 🔍  
- `Igualdade:` `==`, `!=`  

- `Relacionais:` `>`, `<`, `>=`, `<=`  


  **Exemplo lúdico:** Semáforo digital: testa velocidade (`vel > limite`), só libera ação se condição for verdadeira.


# 🛠️ Capítulo 3: Boas Práticas & Cenários Reais

## 3.1 Boas Práticas ✅  
- Comentários claros e Javadoc para métodos públicos  

- Nomes em lowerCamelCase para variáveis, UpperCamelCase para classes  

- Espaços ao redor de operadores e depois de vírgulas  

- Declare cada variável em linha separada com comentário  

- Imports antes de `public class`  

- Uma instrução por linha; divida linhas longas em pontos lógicos  


  **Exemplo lúdico:** Como manual de montagem: cada ferramenta tem rótulo, cada passo está numerado e ilustrado, evitando confusão.


## 3.2 Cenários Reais 🌟  
- **Sistemas Bancários:** validações `if (saldo >= valor)` antes de transações, relatórios formatados com `printf`.  

- **Ferramentas CLI:** prompts claros via `print`, leitura com `Scanner`, respostas formatadas para logs.  

- **Relatórios de Saúde:** calculadora de IMC, pega peso/altura (Scanner), mostra resultados com `printf`.  

- **Monitoramento Industrial:** expressões de alerta `if (temp > threshold)`, logs com timestamps formatados.


  **Exemplo lúdico:** Em uma central de atendimento, cada operador (método) pergunta dados (print/Scanner), processa regras (if-else) e registra em um relatório padronizado (printf), mantendo tudo organizado e documentado.


```java
// Exemplo resumido: comparação de números
import java.util.Scanner;

public class ComparisonSummary {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("First integer: ");
      int a = in.nextInt();
      System.out.print("Second integer: ");
      int b = in.nextInt();

      if (a == b)
         System.out.printf("%d == %d%n", a, b);
      if (a != b)
         System.out.printf("%d != %d%n", a, b);
      if (a < b)
         System.out.printf("%d < %d%n", a, b);
      if (a > b)
         System.out.printf("%d > %d%n", a, b);
      if (a <= b)
         System.out.printf("%d <= %d%n", a, b);
      if (a >= b)
         System.out.printf("%d >= %d%n", a, b);

      in.close();
   }
}
```