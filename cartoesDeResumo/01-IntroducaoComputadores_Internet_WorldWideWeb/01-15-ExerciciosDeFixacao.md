# 🖥️ Capítulo 1: Fundamentos de Computação

## ⚙️ 1.1 Unidades Lógicas  
Computadores organizam seu trabalho em seis blocos principais, cada um com funções especializadas.  

- `Input Unit 📥`: recebe dados do mundo externo (teclado, mouse, sensores).
  - **Exemplo lúdico:** o porteiro que anota seu nome antes de você entrar na festa.  


- `Output Unit 📤`: envia resultados processados para telas, impressoras ou atuadores.
  - **Exemplo lúdico:** o garçom que traz seu prato pronto após o chef terminar a receita.  


- `Memory Unit 🧠`: armazena temporariamente dados e instruções que o processador usa.
  - **Exemplo lúdico:** post-its na sua mesa com lembretes do que fazer em seguida.  


- `Secondary Storage Unit 📦`: guarda dados de forma permanente em discos ou SSDs.
  - **Exemplo lúdico:** o arquivo de fichas antigas guardado em um armário, acessível mesmo depois de anos.  


- `Arithmetic and Logic Unit (ALU) ➕➖`: executa cálculos e comparações lógicas.
  - **Exemplo lúdico:** a calculadora de mão que soma pães vendidos por dia e decide se faltou.  


- `Central Processing Unit (CPU) 🎩`: coordena as operações das outras unidades, interpretando instruções.
  - **Exemplo lúdico:** o maestro de orquestra que sinaliza a entrada de cada instrumento no concerto.  


## 📝 1.2 Programação de Computadores  
Criar software é esculpir o comportamento do computador usando diferentes níveis de abstração.  

- `Programming`: ato de escrever sequências de instruções para resolver problemas.  
  - **Exemplo lúdico:** seguir a receita de um bolo, passo a passo, para obter a massa perfeita.  


- `Machine Language`: binário puro (0s e 1s), único idioma que o hardware entende.  
  - **Exemplo lúdico:** notas abreviadas “CAR” ou “MTR” que um tradutor mágico converte em comandos de um robô.  


- `Assembly Language`: mnemônicos legíveis (LOAD, ADD, STORE) traduzidos por assemblers.  
  - **Exemplo lúdico:** notas abreviadas “CAR” ou “MTR” que um tradutor mágico converte em comandos de um robô.  


- `High-Level Languages`: sintaxe próxima ao inglês (Java, C++, Python) compilados ou interpretados.  
  - **Exemplo lúdico:** ditar uma carta para um assistente que a transcreve em belas caligrafias.  


- `Compilers`: convertem código de alto nível em bytecode/máquina.  
  - **Exemplo lúdico:** notas abreviadas “CAR” ou “MTR” que um tradutor mágico converte em comandos de um robô.  


- `Interpreters`: executam código linha a linha sem gerar arquivos intermediários.  
  - **Exemplo lúdico:** notas abreviadas “CAR” ou “MTR” que um tradutor mágico converte em comandos de um robô.  


# ☕ Capítulo 2: Ambiente Java SE

## 🔄 2.1 Fases do Desenvolvimento Java  
Cinco etapas transformam seu código em execução real na JVM.  

1. `Edit`: crie o arquivo `Programa.java` no editor e salve no disco.  

2. `Compile`: gere bytecodes com `javac Programa.java`. 


   ```bash
   javac Programa.java
   ```


3. `Load`: Class Loader carrega `.class` na memória.  

4. `Verify`: Bytecode Verifier confere segurança e consistência.  

5. `Execute`: JVM interpreta e aplica JIT para acelerar.  


   ```bash
   java Programa
   ```

## 🌟 2.2 Duas Fases de Compilação  
Java tem duas compilações:  
- `Fonte → Bytecode`: `javac` gera um formato portátil.  

- `Bytecode → Nativo`: JIT compila trechos quentes em código de máquina, elevando performance.  


# ⌚ Capítulo 3: OOP na Prática – O Relógio de Pulso

## 🎯 3.1 Conceitos de OOP Aplicados  
- `Objeto`: um relógio específico com nome e estado.  

- `Class`: molde `Watch` definindo atributos e comportamentos.  

- `Attributes`: cor da pulseira, formato do mostrador, bateria restante.  

- `Behaviors (Métodos)`: `tick()`, `setAlarm()`, `displayTime()`.  

- `Inheritance`: `AlarmClock extends Watch`, adicionando `soundAlarm()`.  

- `Encapsulation`: ocultar variáveis de hora e data, expor apenas métodos públicos.  

- `Information Hiding`: ninguém mexe diretamente na bateria sem usar `replaceBattery()`.  

- `Interface`: `Drivable` em carro; aqui `Timekeeper` com `getTime()`, `setTime()`.  

- `Messages/Method Calls`: chamar `watch.setAlarm(7, 0)` envia “mensagem” interna para programar o alarme.  

# ✅ Capítulo 4: Boas Práticas & Cenários Reais

## ✔️ 4.1 Organização de Projeto Java  
- Separe código em pacotes claros (`com.empresa.projeto`).  
- Use scripts de build e configuração de IDE (pom.xml, build.gradle).  
- Documente APIs com Javadoc.  


**Cenário real**  
Em um sistema bancário, o pacote `com.bank.account` abriga `Account` e `Transaction`, enquanto `com.bank.web` contém servlets e REST controllers, facilitando manutenção e time-splitting.


## 🛡️ 4.2 Qualidade e Segurança  
- Integre testes JUnit em CI para cada commit.  
- Aplique static analysis (SonarQube) e code coverage (JaCoCo).  
- Monitore vulnerabilidades de dependências (Dependabot).  


**Cenário real**  
Em fintechs, cada atualização de `PaymentService` dispara testes que simulam transações reais e verificam regras de fraude, evitando vulnerabilidades em produção.


## 🏋️ Exercícios de Fixação

### Exercício 1 (Unidades e Linguagens)  
Preencha:  
a) Unidade que recebe dados → __.  
b) Processar problemas é chamado → __.  
c) Mnemônicos de máquina → __.  
d) Unidade que envia dados → __.  
e) Memória primária e secundária → __ e __.  
f) Unidade de cálculos → __.  
g) Unidade de decisões lógicas → __.  
h) Linguagens mais convenientes → __.  
i) Única linguagem nativa → __.  
j) Coordenador de unidades → __.

### Resposta  
a) Input Unit  
b) Programming  
c) Assembly Language  
d) Output Unit  
e) Memory Unit, Secondary Storage Unit  
f) Arithmetic and Logic Unit  
g) Arithmetic and Logic Unit (decisions)  
h) High-Level Languages  
i) Machine Language  
j) Central Processing Unit

### Exercício 2 (Linguagens e Protocolos)  
Preencha:  
a) Java é usado em larga escala em → __.  
b) C ficou famoso com → __.  
c) TCP garante entrega de → __.  
d) C++ foi criado por → __.

### Resposta  
a) enterprise applications, web servers, consumer devices  
b) UNIX development  
c) packets  
d) Bjarne Stroustrup

### Exercício 3 (Ambiente Java)  
Preencha:  
a) Cinco fases → __, __, __, __, __.  
b) IDE com editores e debuggers → __.  
c) `java` invoca → __.  
d) VM que oculta SO → __.  
e) Carregador de classes → __.  
f) Verificador de bytecodes → __.

### Resposta  
a) Edit, Compile, Load, Verify, Execute  
b) IDE  
c) JVM  
d) Virtual Machine  
e) Class Loader  
f) Bytecode Verifier

### Exercício 4 (Compilação Java)  
Explique as duas fases de compilação de Java.

### Resposta  
1. `javac` traduz código-fonte para bytecodes portáveis.  
2. `JIT` converte bytecodes quentes em código nativo durante a execução, elevando performance.

### Exercício 5 (OOP e Relógio)  
Descreva como cada termo se aplica a um relógio de pulso.

### Exemplo de Resposta  
- `Objeto`: meu relógio Casio digital.  
- `Class`: `Watch` define ponteiros e display.  
- `Attributes`: cor da pulseira, hora atual.  
- `Behaviors`: `tick()`, `setAlarm()`.  
- `Inheritance`: `AlarmClock` herda `Watch` e adiciona alarme.  
- `Encapsulation`: hora interna oculta, só acessível por `getTime()`.  
- `Interface`: `Timekeeper` garante `getTime()` e `setTime()`.  
- `Information Hiding`: ajustes de hora só via métodos, sem mexer no circuito interno.  
- `Messages`: chamar `alarmClock.setAlarm(6,30)` programa o despertar.  

> Estes exercícios reforçam unidades de computador, linguagens, ambiente Java e conceitos de OOP aplicados a objetos do dia a dia. Pratique-os para internalizar cada ideia!  
