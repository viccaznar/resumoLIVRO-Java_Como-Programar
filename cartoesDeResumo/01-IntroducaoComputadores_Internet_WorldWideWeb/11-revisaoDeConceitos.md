# 📝 Seção 1.16: Revisão de Conceitos

## 📌 Capítulo 1: Conceitos Fundamentais

### 1. Objetos do Mundo Real 🌍
Um objeto é qualquer entidade com atributos (estado) e comportamentos (ações).  


  - **Exemplo lúdico:** Imagine um carro de brinquedo:


    - `Atributos:` cor, modelo, nível de combustível.  
    - `Comportamentos:` acelerar, frear, buzinar.


### 2. Pseudocódigo ✏️  
Maneira informal de expressar a lógica de um programa usando linguagem natural e estruturas de controle básicas.  


  - **Exemplo lúdico:** Como um roteiro de filme escrito em texto simples:  
“Se a porta estiver trancada, pegue a chave; senão, abra a porta e entre.”


### 3. UML 📊  
Linguagem gráfica padrão para projetar sistemas orientados a objetos por meio de diagramas (casos de uso, classes, sequência etc.).  


  - **Exemplo lúdico:** Pense num mapa de metrô:  


    - `Estações` ＝ classes  
    - `Linhas` ＝ associações  
    - `Horários dos trens` ＝ fluxo de interação


## 📚 Capítulo 2: Exercícios de Autorrevisão

### Exercício 1.1: Exemplos de Objetos 🎯  
Liste três objetos do mundo real e seus atributos/comportamentos.  

Resposta (exemplos possíveis):  
a) Televisão  
   - `Atributos:` tamanho da tela, resolução, volume.  
   - `Comportamentos:` ligar/desligar, mudar canal, ajustar brilho.  

b) Cafeteira  
   - `Atributos:` capacidade de água, tempo de preparo, temperatura.  
   - `Comportamentos:` ligar/desligar, preparar café, manter aquecimento.  

c) Tartaruga  
   - `Atributos:` idade, tamanho do casco, peso.  
   - `Comportamentos:` caminhar, retraír-se no casco, alimentar-se.


### Exercício 1.2: Definição de Pseudocódigo ❓  
Pseudocódigo é ________.  

Opções:  
a) outro termo para OOAD  
b) linguagem para exibir UML  
c) maneira informal de expressar a lógica do programa  
d) esquema gráfico para modelar objetos  

Resposta: c)


### Exercício 1.3: Finalidade da UML ❓  
A UML é utilizada principalmente para ________.  

Opções:  
a) testar sistemas OO  
b) projetar sistemas OO  
c) implementar sistemas OO  
d) a e b são corretas  

Resposta: b)


## 🛠️ Capítulo 3: Boas Práticas e Cenários Reais

### 3.1 Boas Práticas em OOAD ✅  
- Validar requisitos com stakeholders antes de modelar.  
- Usar nomenclatura consistente entre UML e código.  
- Revisar diagramas em pares (peer review).  
- Iterar protótipos e ajustar o design antes de codificar.  
- Documentar decisões de modelagem e interfaces de classe.


  - **Exemplo lúdico:** Como um time de coreógrafos que ensaia cada passo com figurino e cenário antes do grande espetáculo.


### 3.2 Cenários Reais em Negócios 🌐  

- `Caixa Eletrônico (ATM):`  
  • Classes: `CaixaEletronico`, `Conta`, `Transacao`  
  • UML: sequência de saque mostra `Cliente` → `CaixaEletronico` → `Banco`.


- `E-commerce:`  
  • Serviços Java Spring Boot para `Pedido`, `Pagamento`, `Estoque`.  
  • Diagrama de classes define relações entre `Cliente`, `Carrinho` e `Produto`.


- `Sistemas Bancários:`  
  • Cobertura de transações ACID em Java EE.  
  • Modelagem de herança para tipos de conta (Corrente, Poupança).


- `IoT Industrial:`  
  • Dispositivos embarcados recebem bytecodes Java via rede.  
  • Componentes `Sensor`, `Gateway` e `Servidor` definidos em UML.


  - **Exemplo lúdico:** Em um grande festival, cada palco é um subsistema (classe), os artistas são objetos e o roteiro de shows (diagrama de sequência) garante que ninguém atrase o show.
