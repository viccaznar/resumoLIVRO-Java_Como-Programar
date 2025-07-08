# 🏗️ Capítulo 1: Introdução à Tecnologia de Objetos

## 1.5.1 Objetos e Analogia do Automóvel 🏎️ 
Objetos são blocos de software com **atributos** (dados) e **comportamentos** (métodos). Pensar em um carro ajuda:  

  - **Blueprint** (classe) define peças: motor, pedal, volante.  
  - **Carro pronto** (objeto) monta essas peças para você dirigir.  


  - **Exemplo lúdico**: A classe é como o desenho de uma casa em uma planta: não dá para morar até construir. Cada casa construída é um objeto que você pode habitar.


## 1.5.2 Classes e Métodos 🛠️  
- **Classe**: molde que agrupa métodos e atributos.  
- **Método**: ação que um objeto pode executar (por ex., acelerar(), frear()).  


  - **Exemplo lúdico**: Métodos são como botões no controle remoto da TV: escondem toda a eletrônica de troca de canal, só exigem que você pressione “+” ou “–”.


```java
public class Car {
    // atributo (dado)
    private int speed;

    // método (ação)
    public void accelerate(int amount) {
        speed += amount;
    }
}
```


## 1.5.3 Instanciação – Construindo Objetos 🏗️
Instanciar é criar um objeto a partir de sua classe. Em Java, new Classe() chama o construtor e retorna o objeto.


  - **Exemplo lúdico**: Como assentar blocos de LEGO segundo o manual: depois de montar você tem seu carrinho de brinquedo (objeto) que pode rolar.


```java
Car myCar = new Car();  // instância um novo carro
```


## 1.5.4 Reuso de Classes 🔄
Classes testadas podem ser reaproveitadas em vários objetos e projetos, economizando tempo e reduzindo bugs.


  - **Exemplo lúdico**: É como reaproveitar peças de um quebra-cabeça para montar vários cenários diferentes, em vez de criar cada peça do zero.


## 1.5.5 Mensagens e Chamadas de Método 📩
Enviar uma mensagem a um objeto equivale a chamar um de seus métodos: obj.metodo().


  - **Exemplo lúdico**: Pressionar o pedal (mensagem) manda um sinal ao motor (objeto) para aumentar a velocidade (método accelerate).


```java
myCar.accelerate(10);  // envia “acceleration” de 10 unidades ao objeto myCar
```


## 🔧 Capítulo 2: Boas Práticas & Cenários Reais

## 2.1 Design Orientado a Objetos 🎯
`SRP (Single Responsibility Principle):` cada classe faz apenas uma tarefa.

`Polimorfismo & Herança:` use superclasses e interfaces para generalizar comportamentos.

`Encapsulamento:` torne campos private e exponha get/set para proteger dados.


  - **Cenário Real:** Fintech Classes Account, Transaction e Customer se reaproveitam em microserviços de pagamento, relatórios e notificações.


## 2.2 Reutilização de Componentes e Bibliotecas 📦
`Maven/Gradle:` gerencie dependências para usar bibliotecas Java padrão (e.g., Apache Commons).

`APIs internas:` crie classes utilitárias para tarefas comuns (JSON, criptografia, logs).


  - **Cenário Real:** E-commerce Time de backend reutiliza a classe PaymentGatewayClient em diversos microsserviços (carrinho, checkout, cobrança recorrente).


## 2.3 Testes e Qualidade 🧪
`JUnit & Mockito:` escreva testes de unidade para cada método.

`Code coverage:` assegure que métodos críticos sejam cobertos por testes.


  - **Cenário Real:** Saúde Aplicativo de agendamento médico usa testes para validar Appointment.schedule() e evitar duplo agendamento.


# 🏋️ Exercícios de Fixação

## Exercício 1: Preencha com o conceito certo
1. Classe é o ________ de um objeto.
2. Objeto é uma instância de uma ________.
3. Método define um ________ que o objeto pode executar.
4. Instanciação é o processo de ________ um objeto.

### Respostas
1. molde
2. classe
3. comportamento
4. criar

## Exercício 2: Identifique Analogia
Associe o termo OOP com a analogia automóvel: 
a) Classe → ________ 
b) Instanciar → ________ 
c) Método → ________ 
d) Reuso → ________

### Respostas
a) blueprint/plantas 
b) construir carro de verdade 
c) pressionar pedal 
d) fábrica que usa o mesmo molde para vários carros

## Exercício 3: Codificação
Escreva uma classe Java LightBulb com atributo isOn (boolean) e método toggle() que inverte seu estado. Crie um objeto e chame toggle() duas vezes, exibindo o estado:

### Respostas

```java
public class LightBulb {
    private boolean isOn = false;

    public void toggle() {
        isOn = !isOn;
        System.out.println("LightBulb is now " + (isOn ? "ON" : "OFF"));
    }

    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();  // instancia
        bulb.toggle(); // ON
        bulb.toggle(); // OFF
    }
}
```


## 🎨 1.5.6 Atributos e Variáveis de Instância  
Objetos carregam seu próprio estado por meio de atributos, definidos como variáveis de instância na classe. Cada instância armazena valores distintos.  


  - **Exemplo lúdico**: Pense num boneco que, além de braços e pernas (métodos), tem cor de roupa, altura e estoque de energia (atributos). Cada boneco sabe sua própria cor e nível de energia, mas não sabe nada sobre os outros bonecos.


## 🔒 1.5.7 Encapsulamento e Ocultação de Informação  
Encapsulamento reúne dados e métodos numa mesma classe, protegendo detalhes internos. Somente a interface pública é exposta, mantendo o resto “sob o capô”.  


  - **Exemplo lúdico**: É como um tablet: você toca numa app (método) sem precisar entender circuitos internos. A carcaça (classe) esconde todos os detalhes eletrônicos.


## 🧬 1.5.8 Herança  
Permite criar uma nova classe (subclasse) que herda atributos e métodos de uma classe existente (superclasse), podendo estender ou especializar comportamentos.  


  - **Exemplo lúdico**: Imagine blocos de LEGO básicos (superclasse “Veículo”) que incluem rodas e eixos. Você pode criar um modelo “Caminhão” (subclasse) adicionando caçamba, mas ainda herdando rodas e motor.


## 🔗 1.5.9 Interfaces  
Coleções de assinaturas de métodos sem implementação; definem contratos que classes podem implementar de diversas formas.  


  - **Exemplo lúdico**: Um controle remoto universal (interface “Controle”) define botões: ligar(), volumeUp(), canalDown(). TVs, receivers e ar-condicionados (classes) implementam esses botões de jeitos diferentes.


## 📋 1.5.10 Análise e Design Orientados a Objetos (OOAD)  
Processo estruturado para entender requisitos (análise) e especificar soluções (design) usando conceitos de objetos, classes e relacionamentos antes de codificar.  


  - **Exemplo lúdico**: É como arquitetar um bairro: você planeja ruas, zonas residenciais e comerciais (objetos e seus relacionamentos) antes de construir cada casa.


## 🖼️ 1.5.11 UML (Unified Modeling Language)  
Linguagem gráfica padrão para modelar sistemas OO—class diagrams, sequence diagrams, use case diagrams—facilitando comunicação entre equipes.  


  - **Exemplo lúdico**: Pense em esboços de cenários de um jogo de tabuleiro: cada peça (classe), cada movimento (metodo) e interação (sequência) estão desenhados para que todo o grupo entenda sem ler regras longas.


# 🛠️ Capítulo 2: Boas Práticas & Cenários Reais

## ✅ 2.1 Boas Práticas de Design OO  
- **SRP (Single Responsibility)**: cada classe tem uma única responsabilidade.  

- **Encapsulamento**: torne atributos `private` e ofereça métodos `get`/`set`.  

- **Herança vs Composição**: prefira composição quando herança causar acoplamento excessivo.  

- **Uso de Interfaces**: defina contratos claros; facilite testes e mutabilidade de implementação.  

- **UML**: desenhe diagramas simples antes de codificar; compartilhe com a equipe.  

  - **Exemplo lúdico**: É como seguir receita de confeitaria: cada etapa (classe) faz um único trabalho—separar ovos, bater claras—e as instruções ficam protegidas no livro (encapsulamento).



## 🌟 2.2 Cenários Reais em Negócios  
- **Fintech:** classes `Account`, `Transaction`, `User` com herança `PremiumAccount extends Account`; interface `Notifiable` implementada por `EmailNotifier` e `SmsNotifier`.  

- **E-commerce:** `Product` e `OrderItem` reaproveitados em microsserviço de carrinho e serviço de pagamento; use OOAD para modelar fluxo de compra.  

- **IoT Industrial:** interface `Sensor` com métodos `read()` e `calibrate()` implementada por `TemperatureSensor`, `PressureSensor`; use UML para diagramar rede de dispositivos.  

- **Suporte a Clientes:** classe `Ticket` e `PriorityTicket extends Ticket`; interface `Escalatable` para classes que podem ser escaladas automaticamente.

  - **Exemplo lúdico**: Em um call center, você define um molde `Ticket` (classe) com métodos resolver(), fechar(); bots de chat e agentes humanos (objetos) implementam interface `Notifiable` para enviar atualizações por e-mail ou SMS.



# 🏋️ Exercícios de Fixação

## Exercício 1: Conceitos  
Associe cada definição ao termo correto:  
a) Agrupamento de métodos relacionados e atributos → ________  
b) Processo de criar um objeto de uma classe → ________  
c) Contrato que define métodos sem implementação → ________  
d) Princípio de ocultar dados internos de uma classe → ________  

### Solução  
a) Classe  
b) Instanciação  
c) Interface  
d) Encapsulamento  


## Exercício 2: Herança  
Dada a classe:

```java
public class Vehicle {
    private int wheels;
    public void move() { /*...*/ }
}
```

Crie uma subclasse `Motorcycle` que adiciona método `popWheelie()`.

### Solução

```java
public class Motorcycle extends Vehicle {
    public void popWheelie() {
        System.out.println("Popping a wheelie!");
    }
}
```

## Exercício 3: Interface e Implementação  
Defina uma interface `Drivable` com métodos `startEngine()` e `stopEngine()`, e implemente-a em uma classe `Car`.

### Solução

```java
public interface Drivable {
    void startEngine();
    void stopEngine();
}

public class Car implements Drivable {
    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}
```


> Estes exercícios solidificam atributos, encapsulamento, herança, interfaces e OOAD com UML. Aplique-os em seus projetos para reforçar boas práticas e design robusto.
