## 📚 Capítulo 1: Documentação da API Java

### 1.1 Pacote java.lang sem importação 📦
Classes em `java.lang` (como System) são importadas por padrão—você não precisa declarar `import java.lang.System`.


  - **Exemplo lúdico:** É como ter café na máquina sempre disponível: você não precisa pedir, basta usar.


### 1.2 Consultando a Documentação Online 🔍
Acesse a Java API em:

https://java.sun.com/javase/6/docs/api/

via download no site oficial


  - **Exemplo lúdico:** Como folhear o manual de um carro antes de dirigir: a documentação mostra cada recurso e como acioná-lo corretamente.



## 🛠️ Capítulo 2: Boas Práticas & Cenários Reais

### 2.1 Boas Práticas de Código ✅
- Espaços ao redor de operadores (a + b, x = y).

- Espaço após vírgula em listas de argumentos (printf("%d, %d", x, y)).

- Recuo consistente (3 espaços ou 2 tabs) para blocos de método e classe.

- Comentários de fim de bloco: } // fim do main.

- Fechar Scanner com input.close() para liberar recursos.

- Validar entrada ou capturar exceções para tornar o programa tolerante a falhas.


  - **Exemplo lúdico:** Como chef que limpa cada utensílio após usar (close), anota cada passo da receita (comentários) e organiza ingredientes por tipo (nome de variável claro).



### 2.2 Cenários Reais 🌐
- `Ferramentas Financeiras CLI`: leem valores de transação, somam saldos e exibem resultados formatados para relatórios.

- `Aplicativos de Cadastro`: pedem idade e peso (prompts), validam valores e mostram mensagens de erro amigáveis.

- `Monitoramento de Sistemas`: scripts Java coletam métricas (Scanner de logs), calculam médias e imprimem insights no console.

- `Educação & Bootcamps`: exercícios de soma e IMC usam input/printf para ensinar fundamentos de I/O e formatação.


  - **Exemplo lúdico:** Em um call center, cada atendente (metodo main) recebe duas entradas do cliente (Scanner), soma créditos de chamada (expressão), decide plano ideal (if-else) e imprime instruções claras no sistema (printf).


```java
// SumTool.java
import java.util.Scanner;

public class SumTool {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter A: ");
      int a = input.nextInt();
      System.out.print("Enter B: ");
      int b = input.nextInt();
      System.out.printf("Sum is %d\n", a + b);
      input.close();
   }
}
```


```bash
javac SumTool.java
java SumTool
```


```plaintext
Enter A: 10
Enter B: 25
Sum is 35
```