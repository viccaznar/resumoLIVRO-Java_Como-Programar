# 🖥️ Capítulo 1: Compilando e Executando Aplicativos Java

## 1.1 Preparando o Ambiente 🏗️
- Configure PATH para incluir javac.

- Ajuste CLASSPATH ou use diretório atual.


  - **Exemplo lúdico** É como garantir que sua cozinha tenha fogão instalado (javac) e despensa acessível (CLASSPATH) antes de começar a cozinhar.


## 1.2 Compilando com javac ⚙️
`javac NomeDoArquivo.java` gera `NomeDoArquivo.class` contendo bytecodes portáveis.


  - **Exemplo lúdico** Como um tradutor que converte a receita escrita em português numa lista de instruções universais que qualquer forno no mundo entende.


```bash
javac Welcome1.java
```

## 1.3 Executando com java ▶️
`java NomeDaClasse` carrega a JVM, verifica bytecodes e inicia main.


  - **Exemplo lúdico** Como ligar o forno inteligente: você insere a receita padrão (.class) e o forno executa cada etapa para assar seu bolo.


```bash
java Welcome1
```

# ✅ Capítulo 2: Boas Práticas & Cenários Reais

## 2.1 Boas Práticas de Métodos e Saída 💡
- `Comentários`: descreva propósito de métodos e chaves de fechamento (} // fim do método).

- `Indentação`: recuo consistente (três espaços ou 2 tabs) para destacar blocos.

- `Nomes Claros`: método main é fixo; métodos próprios seguem verboSubstantivo().

- `Tratamento de Erros`: valide argumentos de main antes de usar args.


  - **Exemplo lúdico** Como um diretor de teatro que faz marcações no livro de roteiro: indica quando cada cena começa e termina, e quem fala em cada ato.


## 2.2 Cenários Reais em Negócios 🌐
- `Aplicativos de Linha de Comando`: utilitários de backup e processamento em lote usam main e println para status.

- `Ferramentas DevOps`: scripts Java imprimem logs em tempo real via System.out para pipelines CI/CD.

- `Microserviços Bootstrapped`: cada serviço inicia em main, configura ambiente e começa a escutar requisições.

- `Chatbots e CLI Tools`: main processa argumentos e exibe respostas formatadas para usuário final.


  - **Exemplo lúdico** Em um data center, cada serviço Java acende um holofote (println) ao iniciar e registra cada passo do roteiro para os engenheiros acompanharem o espetáculo sem perder o ato.


```java
public class CliTool {
   public static void main(String[] args) {
      System.out.println("Iniciando ferramenta CLI...");
      // processamento...
      System.out.println("Concluído com sucesso.");
   }
}
```

```bash
# Compila e executa a ferramenta
javac CliTool.java
java CliTool
```

```plaintext
Iniciando ferramenta CLI...
Concluído com sucesso
```