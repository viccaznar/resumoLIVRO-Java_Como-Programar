# 🎨 Capítulo 1: Test-Driving a Java Application

## 1.1 Preparação e Execução 🛠️

### 1.1.1 Verificando o Ambiente ✅  
Antes de tudo, confirme que o JDK está instalado e configurado (variáveis PATH/CLASSPATH). Sem isso, comandos `javac` e `java` falham.  


- **Exemplo lúdico**: É como verificar se há tinta e papel na sua impressora antes de imprimir um desenho; sem suprimentos, nada sai.


### 1.1.2 Navegando até o Diretório 📂  
Use `cd` para entrar na pasta que contém `Painter.class`. Exemplo:  


- Windows:  
  ```bash  
  cd C:\examples\ch01\painter  
  ```  


- Linux/OS X:  
  ```bash  


  cd ~/Documents/examples/ch01/painter  
  ```  


- **Exemplo lúdico**: Imagine entrar na sala certa antes de começar a aula de pintura; sem isso, você não encontra as tintas.


### 1.1.3 Executando o Aplicativo ▶️  
No prompt, digite `java Painter` (case sensitive!). Não inclua `.class`. Se der `NoClassDefFoundError`, ajuste o CLASSPATH.  


- **Exemplo lúdico**: É como chamar o garçom pelo nome exato (“Carlos!”) sem dizer “Sr. Carlos.pizza”—uso incorreto confunde quem vai atender.


## 1.2 Interação com a GUI 🎨

### 1.2.1 Seleção de Cor e Forma 🌈🔷  
Escolha cor (Yellow, Blue, Black, Magenta) e forma (Line, Rectangle, Oval) no menu gráfico antes de desenhar.  


- **Exemplo lúdico**: Como escolher o lápis certo (azul, preto) e o molde (círculo, quadrado) antes de desenhar no bloco de aquarela.


### 1.2.2 Preenchimento ✔️  
A opção “Filled” determina se retângulos/ovais são desenhados sólidos ou apenas contorno. Linhas ignoram o preenchimento.  


- **Exemplo lúdico**: É como decidir pintar um balão inteiro de amarelo (preenchido) ou só desenhar sua borda (contorno).


### 1.2.3 Desenhando Formas com Arrastar 🖱️  
Arraste o mouse para criar shapes: clique, segure, mova e solte. O Painter captura as coordenadas e desenha a forma.  

- **Exemplo lúdico**: Imagine esticar um elástico entre dois pinos: o contorno forma automaticamente a curva entre eles.


### 1.2.4 Desfazer e Limpar ↩️❌  
- **Undo** remove a última forma adicionada.  
- **Clear** apaga todo o desenho.  

- **Exemplo lúdico**: É como ter um apagador mágico que suma só o último traço ou limpe toda a lousa com um sopro.

### 1.2.5 Saindo da Aplicação 🚪  
Clique no botão Close (x) para encerrar `Painter`. Isso dispara a rotina de desligamento da JVM.  

- **Exemplo lúdico**: Como fechar a tampa de um caderno de rascunho: todo o trabalho fica salvo na memória, e você encerra a sessão de criatividade.

# 🛡️ Capítulo 2: Boas Práticas & Cenários Reais

## 2.1 Estrutura e Scripts de Execução 📁  
- Mantenha código e recursos (imagens, configurações) organizados em pastas lógicas.  
- Crie scripts `run.sh`/`run.bat` para `javac` e `java`, simplificando o fluxo.  

**Cenário Real**  
Em um time de desenvolvimento de plugins gráficos, um script `build-and-run` garante que novos artistas executem `Painter` com um único comando, sem erros de caminho.

## 2.2 Configuração de CLASSPATH e Dependências ⚙️  
- Declare dependências externas em `pom.xml` (Maven) ou `build.gradle`.  
- Evite problemas de versão e caminho usando diretórios limpos e relatórios de dependências.  

**Cenário Real**  
Num projeto de design colaborativo, cada módulo (shapes, colors, undo) é uma biblioteca JAR gerenciada por Gradle, evitando conflitos e garantindo atualizações transparentes.

## 2.3 Testes de UI e Usabilidade 👥  
- Use frameworks como **AssertJ-Swing** ou **TestFX** para automatizar cliques e verificações.  
- Colete feedback de usuários sobre fluxos de desenho, ajuste labels e ícones para clareza.  

**Cenário Real**  
Uma startup de software educacional testa `Painter` com crianças, automatizando arrastes de mouse e validando cores para garantir que tutoriais de arte funcionem sem bugs.


# 🏋️ Capítulo 3: Exercícios de Fixação

## Exercício 1: Preencha as Lacunas  
1. O comando `________` compila um arquivo `Welcome.java`.  
2. Para rodar um bytecode, usamos `________ Painter`.  
3. A opção “________” define se retângulos/ovais são sólidos.  
4. O utilitário que carrega classes na memória é o **________ Loader**.  

### Solução  
1. `javac`  
2. `java`  
3. `Filled`  
4. `Class`


## Exercício 2: Verdadeiro ou Falso  
a) `java Painter.class` funciona corretamente.  
b) A GUI do Painter permite desfazer apenas uma forma de cada vez.  
c) Com `clear`, é possível recuperar formas após o clique.  

### Solução  
a) Falso (não use extensão).  
b) Verdadeiro (undo remove só o último).  
c) Falso (clear apaga tudo sem histórico).

## Exercício 3: Script de Execução  
Escreva um `run.sh` para Linux que compile e execute `Painter.java`:

### Solução

```bash
#!/bin/bash
javac Painter.java
if [ $? -eq 0 ]; then
  java Painter
else
  echo "Compilação falhou!"
fi
```

## Exercício 4: Simulação Lúdica  
Descreva em três frases como seria “pintar” em `Painter` usando analogias do mundo real.

### Exemplo de Resposta  
1. “Escolher a caneta mágica (cor) antes de rabiscar no livro invisível (canvas).”  
2. “Traçar a forma com o dedo no ar, e ela aparece pintada no papel digital.”  
3. “Apertar o botão de retrocesso é como pedir ao vento para apagar só o último sopro de tinta.”

> Estes exercícios consolidam desde a execução até a interação com a GUI do Painter. Aplique scripts, organize o projeto e automatize testes para produzir software gráfico confiável no seu ambiente profissional.