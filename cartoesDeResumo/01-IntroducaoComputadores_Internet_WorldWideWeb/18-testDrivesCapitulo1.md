# 💡 Fazendo a Diferença: Test-Drives de Programação

## 🌍 Capítulo 1: Calculadora de Emissão de Carbono (1.11) 
Cálculo de CO₂ baseado no uso de combustível. Fórmula comum:

• Emissão (kg CO₂) = litros_consumidos × fator_emissão (kg CO₂/litro)  

• Ou Emissão = distância_km × fator_km (kg CO₂/km)


  **Exemplo lúdico:** Imagine que cada grama de gasolina é um grão de arroz em um prato gigante. Para saber quantos pratos você comeu, multiplique os grãos (litros) pelo tamanho do prato (fator de emissão).


### Fórmulas típicas:  
- `Gasolina:` ~2,31 kg CO₂/l  

- `Diesel:` ~2,68 kg CO₂/l  

- `Média automóvel:` 0,12 kg CO₂/km  


## ⚖️ Capítulo 2: Calculadora de IMC (1.12)
Índice de Massa Corporal (IMC) avalia se você está em peso saudável.  

• IMC = peso_kg ÷ (altura_m)²


  - **Exemplo lúdico:** Pense que seu corpo é uma estante: se o livro (peso) é muito grande para a prateleira (altura²), você corre o risco de tombar.


```java
double peso = 70.0;      // em kg  
double altura = 1.75;    // em metros  
double imc = peso / (altura * altura);  
System.out.printf("Seu IMC: %.2f%n", imc);
```

## 🚗 Capítulo 3: Atributos de Veículos Híbridos (1.13)
Definir classe VeiculoHibrido com atributos típicos de carros que combinam motor a combustão e elétrico.


  - **Exemplo lúdico:** É como criar um robô cozinheiro que usa gás para acender o forno e eletricidade para o mixer—cada fonte tem atributos próprios.


**Possíveis atributos:**

- Consumo urbano (km/l)

- Consumo rodoviário (km/l)

- Capacidade do tanque (L)

- Capacidade da bateria (kWh)

- Autonomia elétrica (km)

- Tipo de bateria (íon-lítio, níquel-metal)

- Peso total (kg)

- Potência do motor elétrico (kW)

- Emissões combinadas (g CO₂/km)


## 📝 Capítulo 4: Algoritmo de Neutralidade de Gênero (1.14)
Procedimento para substituir termos com gênero por equivalentes neutros usando mapeamento de palavras.


  - **Exemplo lúdico:** Como substituir fantasias de Super-Homem por Super-Pessoa no texto de um gibi, garantindo que ninguém se sinta excluído.


```Pseudocódigo
  plaintext
  // Input: texto, mapaNeutralidade {“esposa”:“cônjuge”, “homem”:“pessoa”, …}
  função neutralizar(texto):
    para cada palavra em texto.split(separadores):
      se palavra.lower() em mapaNeutralidade:
        substitua palavra por mapaNeutralidade[palavra.lower()]
    retorne texto ajustado
  Atenção: substituições simples podem gerar termos estranhos (“woperchild”) se não tratar limites de substring e capitalização.
```


## 🛠️ Capítulo 5: Boas Práticas & Cenários Reais

### ✅ 5.1 Boas Práticas em Exercícios de Test-Drive
- `Validação de Fórmulas:` compare resultados com calculadoras oficiais.

- `Tratamento de Erros:` detecte divisão por zero e entradas inválidas (peso = 0 kg, altura = 0 m).

- `Configuração de Modelos de Dados:` use classes para encapsular fórmulas e atributos (CarbonCalculator, BMI , VeiculoHibrido).

- `Mapeamentos Robustos:` normalize texto (case-folding) e use regex para bordas de palavra ao substituir termos.

- `Documentação e Testes:` escreva README com fórmulas e crie testes unitários para cada cálculo e substituição.


  - **Exemplo lúdico:** Como um laboratório de culinária: verifica cada receita (fórmula), mede ingredientes (entradas), anota ajustes e repete o teste até o prato ficar perfeito.


### 🌟 5.2 Cenários Reais em Negócios
- `Consultorias Ambientais:` oferecem reportes de pegada de carbono com calculadoras internas same-as-terrapass, integradas a ERPs de clientes.

- `Apps de Saúde e Fitness:` incorporam IMC e classificações de obesidade, alertando usuários e coaches sobre metas de peso.

- `Indústria Automotiva:` gerencia catálogos de híbridos, exibindo atributos técnicos em sites e apps de comparação de veículos.

- `Ferramentas de Acessibilidade e Inclusão:` realizam neutralização de gênero em sistemas de publicação, intranet corporativa e chatbots de RH.

- `Educação e Workshops:` usam esses exercícios como mini-projetos em bootcamps de programação e disciplinas introdutórias.


  - **Exemplo lúdico:** Um estúdio de desenvolvimento cria um app “EcoFit” que calcula seu IMC, estima emissão de CO₂ da corrida que você fez e sugere rotas híbridas que poupam energia, garantindo experiência completa aos usuários.