# Capítulo 1: Aplicativo de Adição de Inteiros

## 1.1 Declarando Variáveis e Scanner 🔢
Use Scanner para ler entrada do teclado e variáveis (int) para armazenar valores até o fim do programa.


- **Exemplo lúdico:** Pense num estagiário anotando dois números em blocos de notas (variáveis) antes de levá-los para a calculadora (cálculo).


```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
int number1;
int number2;
int sum;
```

## 1.2 Leitura de Entrada e Cálculo ➕
- Exibir prompt com print ou printf.

- Ler inteiros com nextInt().

- Somar valores e armazenar o resultado.


- **Exemplo lúdico:** Como um caixa de mercado perguntando quantas bananas e maçãs você quer, somando-as e informando o total de itens.


```java
System.out.print("Enter first integer: ");
number1 = input.nextInt();

System.out.print("Enter second integer: ");
number2 = input.nextInt();

sum = number1 + number2;
```


## 1.3 Saída Formatada com printf 🖨️
Use `%d` para exibir inteiros. O `\n` pula linha após a saída.


  - **Exemplo lúdico:** Como um locutor anunciando “Total é X” no microfone e, em seguida, dando espaço para o próximo anúncio sem atropelar as palavras.


```java
System.out.printf("Sum is %d\n", sum);
```


## 🛠️ Capítulo 2: Boas Práticas & Cenários Reais

### 2.1 Boas Práticas de Impressão e Código 🛡️
- Coloque espaço após cada vírgula em listas de argumentos.

- Mantenha parênteses e aspas agrupadas; quebre instruções apenas em vírgulas.

- Use nomes de variáveis descritivos (firstNumber, total) em vez de a, b.

- Sempre feche Scanner com input.close() para liberar recursos.

- Comente prompts e cálculos-chave para ajudar novas equipes a entenderem fluxos de I/O.


- **Exemplo lúdico:** Como um chef que organiza suas facas e panelas com etiquetas, deixando cada ferramenta no lugar certo e anotando o passo da receita ao lado.


### 2.2 Cenários Reais em Negócios 🌟

- `Financeiro`: calculadoras internas somam valores de parcelas e exibem relatórios formatados com printf.

- `Educação`: aplicativos de notas leem pontuações, calculam médias e reportam resultados no console para instrutores.

- `Suporte Técnico`: CLI tools pedem códigos de erro, somam parâmetros de diagnóstico e exibem instruções passo a passo.

- `Log de Servidores`: processos Java imprimem tabelas de uso de memória e CPU em múltiplas linhas formatadas, facilitando análise de operações.


- **Exemplo lúdico:** Num central de atendimento, cada atendente (método) solicita dados, soma tempos de espera e relata o total ao supervisor de forma clara e formatada, como números num relatório impresso.


```java
// Addition.java
import java.util.Scanner;

public class Addition {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first integer: ");
      int number1 = input.nextInt();

      System.out.print("Enter second integer: ");
      int number2 = input.nextInt();

      int sum = number1 + number2;

      System.out.printf("Sum is %d\n", sum);
      input.close();
   }
}
```


```bash
# compilando
javac Addition.java

# executando
java Addition
```


```plaintext
Enter first integer: 45
Enter second integer: 72
Sum is 117
```
