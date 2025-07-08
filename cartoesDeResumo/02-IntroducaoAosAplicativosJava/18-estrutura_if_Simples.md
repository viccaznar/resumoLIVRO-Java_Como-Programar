# 🚦 Capítulo 1: Estrutura if Simples
if (condição) instrução; executa a instrução somente se a condição for verdadeira. Sem chaves, cada if controla só a próxima linha.


```java
if (number1 == number2)
    System.out.printf("%d == %d%n", number1, number2);
```


  - **Exemplo lúdico:** Um semáforo que só acende o verde (instrução) se chegar carro (condição verdadeira).


# 📍 Capítulo 2: Comparando Todos os Operadores 🔍
O programa testa ==, !=, <, >, <= e >=, imprimindo apenas aquelas comparações que forem verdadeiras.


```java
public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        
        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

        input.close();
    }
}
```


  - **Exemplo lúdico:** Como uma máquina de filtro que, para cada tipo de critério (igual, maior, menor), só libera a saída correspondente naquele momento.


# 🛠️ Capítulo 3: Boas Práticas & Cenários Reais

## 3.1 Boas Práticas ✅
- Sempre inclua parênteses em if (condição).

- Não coloque ponto-e-vírgula logo após if(...).

- Use espacos ao redor de operadores (a < b).

- Mantenha uma instrução por linha para clareza.

- Quebre instruções longas em pontos lógicos (após vírgulas) e recue linhas subsequentes.


  - **Exemplo lúdico:** Como anotar cada passo de uma receita em linhas separadas, com espaços e comentários, garantindo que até um novato teste sem errar.


## 3.2 Cenários Reais 🌐
- `Formulários Web`: if (idade >= 18) para liberar acesso.

- `Processamento Bancário`: if (saldo >= valor) valida saques.

- `Monitoramento Industrial`: if (temperatura > 75) dispara alarme de segurança.

- `Jogos Eletrônicos`: if (score1 == score2) decide empate e executa tie-break.


  - **Exemplo lúdico:** Num parque de diversões, sensores medem peso (peso <= 100kg) antes de liberar o brinquedo; só se a condição for verdadeira, as portas abrem para o carrinho andar.


```bash
# Executando Comparison
javac Comparison.java
java Comparison
```

```plaintext
Enter first integer: 50
Enter second integer: 75
50 != 75
50 < 75
50 <= 75
```