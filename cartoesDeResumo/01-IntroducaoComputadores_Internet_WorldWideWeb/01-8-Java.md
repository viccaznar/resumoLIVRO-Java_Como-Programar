# 🚀 Capítulo 1: Introdução ao Java

## 1.8.1 Origem e Motivação 📜  
Resumo  
Java surgiu em 1991 na Sun Microsystems, liderado por James Gosling, como uma linguagem orientada a objetos baseada em C++ para controlar PCs e dispositivos embarcados.

Exemplo lúdico  
Imagine Java como uma chave mestra de hotel: uma única chave abre portas de quartos diferentes (PCs, TVs, geladeiras inteligentes).

---

## 1.8.2 Write Once, Run Anywhere 🌐  
Resumo  
Java compila para bytecode portável que roda em qualquer JVM, garantindo “escreva uma vez, execute em qualquer lugar”.

Exemplo lúdico  
É como escrever uma mensagem em Esperanto: qualquer pessoa que aprenda o idioma entende, seja no Brasil, na China ou na Índia.

---

## 1.8.3 Ecossistema e Aplicações 📦  
Resumo  
Java é onipresente:  
- **Enterprise**: sistemas bancários, ERP (Java EE)  
- **Web**: servlets, APIs REST  
- **Mobile**: apps Android  
- **IoT/Consumer**: TVs, geladeiras, automóveis  

Exemplo lúdico  
Java é a caneta universal que desenha interfaces em desktops, escreve apps em smartphones e até programa robôs de cozinha.

---

## 1.8.4 Bibliotecas e APIs 📚  
Resumo  
O JDK inclui pacotes robustos (coleções, I/O, rede, GUI, concorrência). Usar essas APIs acelera o desenvolvimento e melhora o desempenho.

Exemplo lúdico  
É como escolher a ferramenta certa numa caixa completa: em vez de fabricar sua própria chave de fenda, você pega a ideal na prateleira.

---

# 🔧 Capítulo 2: Boas Práticas & Cenários Reais

## 2.1 Aproveitando APIs Públicas ✅  
- **Reutilize**: prefira `java.util`, `java.io`, `java.nio`, `java.time`  
- **Documente**: leia JavaDocs para entender contratos de método  
- **Gerencie versões**: use Maven ou Gradle para controlar dependências  

**Cenário real**  
Em um e-commerce, o time utiliza `BigDecimal` para cálculos financeiros, evitando erros de precisão em vez de criar classes numéricas próprias.

---

## 2.2 Performance e Manutenção ⚡  
- Escolha a estrutura certa: `ArrayList` vs `LinkedList` conforme padrão de acesso  
- Evite **autoboxing** excessivo para reduzir criação de objetos  
- Use **profilers** (VisualVM, YourKit) para encontrar gargalos de CPU e memória  

**Cenário real**  
Num sistema de trading, substituir `Vector` por `ConcurrentLinkedQueue` no processamento de eventos reduziu latência em 30%.

---

# 🏋️ Capítulo 3: Exercícios de Fixação

## 3.1 Verdadeiro ou Falso  
1. Java compila diretamente para código de máquina nativo.  
2. A JVM permite executar o mesmo bytecode em diferentes sistemas.  
3. O JDK inclui apenas classes para I/O e coleções.

### Solução  
1. Falso (Java compila para bytecode, não diretamente para código nativo).  
2. Verdadeiro.  
3. Falso (JDK inclui GUI, rede, concorrência, XML, e muito mais).

---

## 3.2 Correspondência de Edição Java  
Associe cada cenário à edição ou plataforma Java:

| Cenário                | Edição/Plataforma      |
|------------------------|------------------------|
| Aplicativo de console  | a) Java SE             |
| Sistema corporativo web| b) Java EE             |
| App móvel Android      | c) Java SE + Android SDK |

### Solução  
- Console → Java SE  
- Web corporativo → Java EE  
- Android → Java SE + Android SDK  

---

## 3.3 Código Java Simples  
Escreva um programa Java que exiba “Hello, Java!” no console, compilável e executável.

"```java
public class HelloJava {
    public static void main(String[] args) {
        System.out.println(\"Hello, Java!\");
    }
}
```"

**Explicação**  
1. `public class HelloJava` — define a classe.  
2. `public static void main...` — método de entrada.  
3. `System.out.println(...)` — exibe texto e põe quebra de linha.

