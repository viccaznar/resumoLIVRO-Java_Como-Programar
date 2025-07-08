## 🖨️ Capítulo 1: Saída Formatada com printf

### 1.1 Especificadores de Formato %d 🏷️
`printf` usa placeholders na string de formato:

`%d` para inteiros

`%s` para strings

`\n` para nova linha


  - **Exemplo lúdico:** É como etiquetas em urdiduras de tear: %d marca onde o fio inteiro entra, %s onde a trama de texto se encaixa.


```java
System.out.printf("Sum is %d\n", sum);
```


### 1.2 Cálculo Inline em printf ➗
Você pode calcular expressões dentro de `printf`, eliminando variáveis temporárias.


  - **Exemplo lúdico:** Como preparar um coquetel direto no copo: em vez de medir cada ingrediente separado, você adiciona tudo de uma vez e mexe no próprio copo.


```java
System.out.printf("Sum is %d\n", (number1 + number2));
```