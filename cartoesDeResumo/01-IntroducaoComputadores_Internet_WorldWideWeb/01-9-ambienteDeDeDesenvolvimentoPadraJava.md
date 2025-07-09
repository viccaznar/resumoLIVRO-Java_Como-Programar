# 🛠️ Capítulo 1: Ambiente de Desenvolvimento Java

## 1.9.1 Edição ✍️  
Escreva seu código-fonte em um editor (arquivo `.java`). Corrija erros de digitação, salve no disco.  


  - **Exemplo real**: É como rabiscar uma carta à mão num caderno: você escreve, risca o que está errado e salva a versão final antes de enviar.


## 1.9.2 Compilação ⚙️  
Use `javac` (ou Build do IDE) para transformar `.java` em bytecode portátil `.class`. Se houver erros de sintaxe, volte à edição.  


  - **Exemplo real**: Imagine um tradutor que converte sua carta manuscrita num inglês perfeito; se encontrar palavras sem sentido, ele devolve para você corrigir.


```bash
javac Welcome.java
```


## ✅ Capítulo 2: Boas Práticas & Cenários Reais

## 2.1 Uso de IDEs e Ferramentas Integradas 🖥️
Prefira IDEs (Eclipse, IntelliJ, NetBeans) para edição, build e debug unificados.

- Configure atalhos para compilar/rodar e inspeção de erros em tempo real.


  - **Exemplo real**: Em grandes equipes de desenvolvimento, todos usam IntelliJ com plugins de verificação de estilo (Checkstyle) e integração com Git para acelerar revisões de código.


## 2.2 Automação de Build e Integração Contínua ⚡
Use Maven ou Gradle para gerenciar dependências e definir life cycle de build.


- Configure Jenkins/GitHub Actions para compilar, testar e empacotar automaticamente a cada push.


  - **Exemplo real**: Imagine um tradutor que converte sua carta manuscrita num inglês perfeito; se encontrar palavras sem sentido, ele devolve para você corrigir.


```bash
javac Welcome.java
```

## 2.3 Testes e Qualidade de Código 🧪
Escreva testes JUnit para cada classe crítica.


- Use cobertura de testes (JaCoCo) e análise estática (SonarQube) para garantir qualidade.


  - **Exemplo real**: Em sistemas de saúde, métodos de cálculo de doses médicas têm 100% de cobertura de testes e são continuamente monitorados por pipelines de qualidade.


## 2.4 Gerenciamento de Versionamento e Releases 📦
Adote GitFlow ou trunk-based development.


- Tagueie releases (v1.0, v1.1) e gere changelogs automaticamente.


  - **Exemplo real**: Em uma plataforma de e-commerce, cada release é marcado no Git, integrado ao Jira e implantado em staging antes de ir para produção.


## 🏋️ Capítulo 3: Exercícios de Fixação

## Exercício 1: Preencha as Lacunas
1. A fase de **compilação** envolve converter .java em bytecodes .class.

2. O **class loader** carrega classes na memória antes da execução.

3. O **bytecode verifier** verifica segurança e integridade dos bytecodes.

4. A fase de **execução** inclui interpretação e compilação JIT.

### Solução
1. Compilação

2. Class Loader

3. Verifier

4. Execução

## Exercício 2: Verdadeiro ou Falso
a) O editor salva o arquivo em .class. b) Bytecode é específico para cada sistema operacional. c) JIT melhora performance convertendo bytecode em código nativo.

### Solução
a) Falso (editor salva .java). b) Falso (bytecode é portátil entre JVMs). c) Verdadeiro

## Exercício 3: Fluxo de Desenvolvimento
Descreva, em ordem, as cinco fases do ciclo de vida de um programa Java.

### Solução
1. Edição

2. Compilação

3. Carregamento

4. Verificação

5. Execução

## Exercício 4: Código e Execução
Escreva um programa HelloFlow.java que exiba “Dev flow ok!” e explique como compilá-lo e executá-lo.

```java public class HelloFlow { public static void main(String[] args) { System.out.println("Dev flow ok!"); } }

```

**Compilação:**  
```bash
javac HelloFlow.java
```

**Execução:**

```bash
java HelloFlow
