# 🖥️ Capítulo 1.4: Linguagens de Máquina, Assembly e Alto Nível

## 1.4.1 Linguagens de Máquina 🖥️  
Conjunto de instruções em binário (1s e 0s) que o hardware executa diretamente. Cada processador tem sua própria linguagem de máquina, o que a torna dependente de arquitetura.


  - **Exemplo lúdico**: É como falar secretamente usando apenas pisca-pisca em uma lanterna: cada padrão de piscar corresponde a uma instrução específica, mas só seu dispositivo entende.  


  ```machine
  +1300042774
  +1400593419
  +1200274027
  ```


## 1.4.2 Linguagens de Assembly 📝  
Mnemônicos legíveis (load, add, store) que representam instruções de máquina. Assemblers traduzem esse código para binário.


  - **Exemplo lúdico**: Imagine escrever notas abreviadas em seu caderno (“CAR” para carregar carroça, “MTR” para mover tração) e usar um tradutor mágico que converte tudo em ordens que um cavalo-robô entende.


  ```assembly
  load basepay
  add overpay
  store grosspay
  ```


## 1.4.3 Linguagens de Alto Nível 🚀  
Sintaxe próxima do inglês com abstrações poderosas. Compiladores convertem instruções em código de máquina. Java é um dos mais populares.


  - **Exemplo lúdico**: Como dar ordens a um assistente pessoal: “Calcule o salário total” em vez de instruir cada passo de adição e armazenamento.


```java
grossPay = basePay + overTimePay;
```


## 1.4.4 Compiladores vs Interpretadores 🔄  
  - **Compiladores** traduzem todo o programa antes da execução (mais rápido em tempo de execução).  
  - **Interpretadores** executam linha a linha, sem gerar arquivo binário (mais flexível, mas mais lento).

  - **Exemplo lúdico**: Compilar é como ensaiar toda a peça de teatro antes da estreia; interpretar é apresentar improvisando cena a cena.


# 🛠️ Capítulo 2: Boas Práticas & Cenários Reais

## 2.1 Escolha de Linguagem e Manutenção 🧩  
  - Prefira ALTO NÍVEL para produtividade e legibilidade.  
  - Mantenha snippets de Assembly apenas para otimizações críticas.  
  - Documente cada mnemônico ou linha de alta complexidade.

  - **Exemplo lúdico**: É como usar um carro automático na maioria das ruas (alto nível) e trocar para marcha manual somente em subidas íngremes (assembly otimizada).


## 2.2 Tradução e Portabilidade 🌐  
  - Utilize compiladores e assemblers padronizados.  
  - Mantenha scripts de build que gerem binários para múltiplas arquiteturas.  
  - Teste em ambientes reais de produção para garantir compatibilidade.

  - **Exemplo lúdico**: Como embalar seu presente (código) em caixas etiquetadas para diferentes países, garantindo que cada delivery (binário) chegue intacto.


## 2.3 Performance e Depuração 🐞  
  - Assinale trechos críticos em assembly ou use intrínsecos do compilador.  
  - Faça profiling para identificar gargalos de CPU.  
  - Use debug symbols para traduzir o binário de volta a linhas de código original.

  - **Exemplo lúdico**: É como marcar cada segmento de estrada que causa engarrafamento (gargalo) e criar atalhos temporários (assembly) para destravar o tráfego.


# 🏋️ Exercícios de Fixação

## Exercício 1: Preencha as lacunas  
1. ________ são linguagens dependentes de hardware e usam apenas 1s e 0s.  
2. ________ usam mnemônicos como load e store.  
3. ________ são traduzidas por compiladores e parecem inglês.  
4. ________ executam código linha a linha sem gerar binário.

### Solução  
1. Linguagens de Máquina  
2. Linguagens de Assembly  
3. Linguagens de Alto Nível  
4. Interpretadores  


## Exercício 2: Tradução Manual  
Dada a instrução de alto nível:  
```java
netPay = grossPay - taxAmount;
```

Escreva a sequência hipotética em assembly (pseudocódigo).  

### Solução  
```assembly
load grossPay
sub taxAmount
store netPay
```

## Exercício 3: Verdadeiro ou Falso
a) Assembly é mais legível que alto nível. b) Código de máquina roda em qualquer processador. c) Compiladores tornam a execução mais rápida que interpretadores.

### Solução
a) Falso. Alto nível é mais legível. b) Falso. Máquina é específico de arquitetura. c) Verdadeiro. Código compilado​ geralmente executa mais rápido.