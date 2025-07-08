# 🖥️ Capítulo 1: Exibindo Texto Formatado com printf

## 1.1 O Método printf 🖨️  
`System.out.printf` imprime texto formatado usando “placeholders” na string de formato. Ele recebe múltiplos argumentos: primeiro a string de formato, depois valores a serem inseridos.


- **Exemplo lúdico:** Como um maestro que passa a partitura com sinais (“%s”) e depois preenche cada nota com o nome do músico (argumentos), criando uma sinfonia de palavras.


```java
public class Welcome4 {
   public static void main(String[] args) {
      System.out.printf("%s\n%s\n",
                        "Welcome to", 
                        "Java Programming!");
   }
}
```	  


## 1.2 Especificadores de Formato 📋
Marcadores na string de formato que indicam onde e como exibir cada dado.

`%s` : string

`%d` : inteiro decimal

`%f` : ponto flutuante

`\n` : nova linha

`%%` : literal %


- **Exemplo lúdico:** Imagine molduras vazias (%s, %d) penduradas numa galeria. Ao chamar printf, você coloca quadros (valores) em cada moldura, e o salão ganha vida.


## 1.3 Quebrando Instruções Longas ↔️
Instruções podem ser divididas em várias linhas para legibilidade. Separe após vírgula e recue a linha seguinte.


- **Exemplo lúdico:** Como uma receita com vários ingredientes listados em linhas separadas: facilita a leitura do que vai na panela sem perder o passo a passo.
