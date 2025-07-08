# 📖 Capítulo 1: Fundamentos de Computação e Java

## 1.1 Instruções, Unidades e Linguagens 🖥️

### 1.1.1 Instruções  
Resumo  
Computadores executam **programs**—sequências de instruções que processam dados.  

Exemplo lúdico  
É como seguir uma receita de bolo: cada passo (instrução) deve ser executado na ordem, ou a massa não cresce.

---

### 1.1.2 Unidades Lógicas  
Resumo  
As cinco unidades chave são:  
- **Input Unit** (recebe dados)  
- **Output Unit** (entrega resultados)  
- **Memory Unit** (guarda informações temporárias)  
- **Central Processing Unit** (coordena tudo)  
- **Arithmetic and Logic Unit** (faz cálculos e comparações)  
- **Secondary Storage Unit** (armazena dados permanentemente)  

Exemplo lúdico  
Imagine um restaurante:  
- Garçom (input) anota pedidos,  
- Cozinha (ALU) prepara pratos,  
- Expedidor (CPU) organiza entregas,  
- Pratos prontos vão ao salão (output),  
- Cardápio fica no fichário (memory) e  
- Receitas guardadas no livro (secondary storage).

---

### 1.1.3 Tipos de Linguagens  
Resumo  
Três níveis de linguagem de programação:  
1. **Machine Languages** (binário puro)  
2. **Assembly Languages** (mnemônicos)  
3. **High-Level Languages** (próximos ao inglês)  

Exemplo lúdico  
- Máquina: pisca-pisca em código Morse;  
- Assembly: “LOAD”, “ADD”;  
- Alto nível: “grossPay = basePay + overTimePay”.

---

### 1.1.4 Tradutores  
Resumo  
Programas que convertem de alto nível para máquina são **compilers**.  

Exemplo lúdico  
É como um tradutor simultâneo que converte sua palestra em diferentes idiomas antes que a platéia entenda.

---

## 1.2 Ambiente Java 🛠️

### 1.2.1 Comandos Básicos  
Resumo  
- **java** executa aplicações Java.  
- **javac** compila `.java` em `.class`.  
- Arquivos de código fonte terminam em `.java`.  
- Compilados geram `.class` que contém **bytecodes**.  

Exemplo lúdico  
É como escrever uma carta em rascunho (arquivo `.java`), enviá-la a uma gráfica (javac) e receber cópias prontas (`.class`) para serem lidas por quem tiver o leitor universal (JVM).

```bash
# Compilar
javac MinhaApp.java

# Executar
java MinhaApp
```

1.3 Fundamentos de Orientação a Objetos ⚙️
1.3.1 Encapsulamento (Information Hiding) 🔒
Resumo Objetos escondem detalhes internos, expondo apenas uma interface clara.

Exemplo lúdico Como um controle remoto: você aperta “+” ou “–” sem saber a eletrônica dentro da TV.

1.3.2 Classes e Objetos 🏗️
Resumo

Classes são moldes que definem atributos (fields) e métodos.

Objetos são instâncias com valores específicos.

Exemplo lúdico A classe é a planta de um carro; cada carro produzido a partir dela é um objeto com cor e quilometragem próprios.

1.3.3 OOAD (Object-Oriented Analysis and Design) 📝
Resumo Processo de modelar requisitos e arquitetura usando conceitos de objetos antes de codificar.

Exemplo lúdico É como projetar a planta de uma cidade (ruas, zonas) antes de erguer os prédios.

1.3.4 Herança e Polimorfismo 🧬
Resumo

Inheritance permite criar subclasses a partir de superclasses.

Polymorphism permite tratar objetos diferentes com a mesma interface.

Exemplo lúdico Você programa um robô genérico (superclasse) e cria versões “robô doméstico” e “robô industrial” (subclasses), ambos respondendo ao comando start().

1.3.5 UML (Unified Modeling Language) 🖼️
Resumo Linguagem gráfica padrão para diagramar classes, relacionamentos e comportamentos.

Exemplo lúdico Como desenhar mapas de metrô com estações (classes) e conexões (associações) para orientar passageiros (desenvolvedores).

✅ Capítulo 2: Boas Práticas & Cenários Reais
2.1 Pipeline de Desenvolvimento Java 🚀
Centralize scripts de build (run.sh/run.bat) para compilar e rodar com um toque.

Integre CI/CD (Jenkins, GitHub Actions) para compilar, testar e liberar automaticamente.

Cenário real: Em fintechs, cada push dispara pipeline que roda javac, testes JUnit e empacota um .jar, garantindo qualidade antes de cada deploy.

2.2 Governança de Releases 📦
Versionamento semântico (v1.0.0, v1.1.0).

Ciclo alpha → beta → release candidate → final (→ continuous beta para SaaS).

Registre changelogs e migre clientes suavemente.

Cenário real: Plataformas de CRM usam RC para testes em clientes-chave antes do release global, evitando downtime em atualizações críticas.

2.3 Design Orientado a Objetos em Negócios 🏢
Modelo Account e Transaction em microserviços de pagamentos.

Use Factory Pattern para instanciar gateways de pagamento.

Aplique Observer para atualizar dashboards em tempo real quando ocorrem transações.

Cenário real: E-commerce dispara eventos de pedido (OrderPlaced), serviços de inventário e notificações ligam-se como observadores atualizando estoque e informando clientes.

🏋️ Capítulo 3: Exercícios de Fixação
Exercício 1: Complete as Frases (1.1)
a) Instruções são chamadas ___. b) Unidades lógicas: __, __, __, __, __ e __. c) Três linguagens: ___, ___ e ___. d) Tradutores de alto-nível são ___. e) SO móvel baseado em Linux/Java: ___. f) Versão quase final e pronta para testes: ___. g) Sensor de movimento em smartphones: ___.

Solução
a) programs b) Input Unit, Output Unit, Memory Unit, CPU, ALU, Secondary Storage Unit c) machine languages, assembly languages, high-level languages d) compilers e) Android f) Release candidate g) accelerometer

Exercício 2: Ambiente Java (1.2)
a) Executa aplicação: ___. b) Compila programa: ___. c) Extensão fonte: ___. d) Extensão bytecode: ___. e) Arquivo .class contém ___.

Solução
a) java b) javac c) .java d) .class e) bytecodes

Exercício 3: OOP Básico (1.3)
a) Informação oculta é ___. b) Moldes de objetos são ___. c) Processo OOAD é ___. d) Reutilização de classe se chama ___. e) Diagrama padrão é ___. f) Características como cor e peso são ___.

Solução
a) information hiding b) classes c) object-oriented analysis and design (OOAD) d) inheritance e) UML (Unified Modeling Language) f) attributes