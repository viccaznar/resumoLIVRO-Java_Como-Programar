# ✍️ Capítulo 1: Comentando Programas

## 1.1 Tipos de Comentários 🗒️
Comentários documentam e esclarecem código sem afetar a execução. O compilador Java os ignora completamente.


### 1.1.1 Comentário de Fim de Linha (//)   
Tudo após `//` até o fim da linha é ignorado. Convenção: cabeçalho de arquivo e anotações rápidas.


  - **Exemplo lúdico**  
Como rabiscar notas na margem de um livro: só você vê, e o texto principal permanece intacto.


```java
// Este comentário explica o propósito do programa
System.out.println("Olá, mundo!");  // imprime saudação
```


### 1.1.2 Comentário Tradicional (/* */)
Delimitadores /* e */ envolvem múltiplas linhas de comentário.


  - **Exemplo lúdico** Como destacar um trecho de papel com um marcador amarelo: tudo dentro do destaque é anotação.


```java
/*
  Este comentário pode
  ocupar várias linhas
  para explicações detalhadas
*/
```

### 1.1.3 Comentário Javadoc (/** */) 📄
Delimitadores /** e */ permitem gerar documentação HTML com a ferramenta javadoc.


  - **Exemplo lúdico** Como escrever legendas de imagem num álbum de fotos: elas viram página descritiva no site oficial.


```java
/**
 * Representa uma conta bancária simples.
 * @author Maria
 * @version 1.0
 */
public class Conta { … }
```