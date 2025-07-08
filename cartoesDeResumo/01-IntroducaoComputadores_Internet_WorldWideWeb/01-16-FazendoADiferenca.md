# 🌍 Capítulo 1: Desenvolvimento “Making a Difference”

## 1.1 Test-Drive e Pesquisa Inicial 🕵️‍♂️  
Resumo  
Antes de programar, use ferramentas existentes para entender o problema: execute calculadoras de pegada de carbono e IMC, estude as entradas, saídas e fórmulas por trás delas.  

Exemplo lúdico  
É como visitar várias padarias e provar suas receitas de pão antes de criar a sua própria — você capta proporções exatas e truques de forno.

---

## 1.2 Formulação de Modelos de Dados 📊  
Resumo  
Pesquise fórmulas oficiais e padrões:  
- **Carbon Footprint**: toneladas CO₂ = Σ(consumo de combustível × fator de emissão).  
- **BMI**: ℎ = pesoₖ𝓰 / (alturaₘ²).  

Exemplo lúdico  
Pense em calcular a receita de um suco: cada fruta (combustível, peso) tem seu suco por quilo (fator), e você soma tudo no liquidificador (fórmula).

---

## 1.3 Modelagem de Classes & Atributos 🏗️  
Resumo  
Defina objetos do domínio com atributos claros. Exemplo: **HybridVehicle** inclui:  
- cityMpg, highwayMpg  
- batteryType, batteryWeight  
- electricRange, gasolineRange  

Exemplo lúdico  
É como descrever todas as peças de um lego técnico: motor elétrico, bateria, rodas grandes, autonomia — tudo listado para montar o conjunto completo.

```java
public class HybridVehicle {
    private double cityMpg;
    private double highwayMpg;
    private String batteryType;
    private double batteryWeight;
    // construtor, getters e setters...
}
```

1.4 Design de Algoritmos & Tratamento de Strings 📝
Resumo Projete procedimentos (algoritmos) antes de codificar:

Percorrer texto palavra a palavra.

Se palavra for “husband” ou “wife”, substituir por “spouse”.

Cuidado com sobreposições (“son” + “daughter” → “spousedaughter”): use limites de palavra.

Exemplo lúdico Imagine carimbar cartões postais: cada carimbo só cobre uma palavra inteira, sem invadir a próxima. Se não, você obtém “gatinho-pernaseca” ao substituir ambas em “gatinho seco”.

java
"```java
String text = input.replaceAll("\\b(wife|husband)\\b", "spouse")
                   .replaceAll("\\b(man|woman)\\b", "person")
                   .replaceAll("\\b(son|daughter)\\b", "child");
```"
1.5 Algoritmo vs. Procedimento ⚙️
Resumo Um algoritmo especifica passos e ordem clara; um procedimento é sua tradução quase natural. Ambos guiam o código final.

Exemplo lúdico Como seguir uma receita de panqueca: primeiro misture ingredientes, depois aqueça a frigideira, por último vire a panqueca — cada etapa bem definida.

✅ Capítulo 2: Boas Práticas & Cenários Reais
2.1 Pesquisa de Domínio e Validação ✅
Consulte fontes oficiais (IPCC para carbono; NIH para IMC).

Valide fórmulas com casos conhecidos (ex.: família de 4 vs. habitantes de uma cidade).

Cenário real Em consultorias de sustentabilidade, cada cálculo de emissão é auditado contra relatórios do governo para garantir certificação ISO 14001.

2.2 Modelagem e Reutilização de Classes 🏢
Crie classes genéricas (Calculator, Vehicle) e herde para casos específicos (BmiCalculator, HybridVehicle).

Empacote utilitários em bibliotecas internas para uso em múltiplos projetos.

Cenário real Em empresas automotivas, a classe Vehicle é base para ElectricVehicle, HybridVehicle e GasolineVehicle, evitando duplicar código de atributos comuns.

2.3 Robustez de Algoritmos e Testes 🧪
Use testes de unidade (JUnit) com dados de referência (BMI de 70 kg/1.75 m = 22.9).

Trate entradas inválidas (divisão por zero, texto sem espaços).

Cenário real Em apps de saúde, cada cálculo de IMC é testado contra milhares de perfis clínicos para evitar resultados absurdos e garantir recomendações corretas.

🏋️ Capítulo 3: Exercícios de Fixação
Exercício 1: Carbon Footprint Research
Pesquise e escreva a fórmula geral para calcular emissões anuais de CO₂ de um carro que roda 15 000 km/ano com consumo de 10 L/100 km.

Solução
Emissões = (15 000 km ÷ 100) × 10 L × 2.31 kgCO₂/L = 3 465 kgCO₂/ano

Exercício 2: BMI em Java
Implemente e teste um método calculateBmi(double weightKg, double heightM).

Solução
java
"```java
public class BmiCalculator {
    public static double calculateBmi(double weightKg, double heightM) {
        if (heightM <= 0) throw new IllegalArgumentException("Altura inválida");
        return weightKg / (heightM * heightM);
    }
    public static void main(String[] args) {
        System.out.println(calculateBmi(70, 1.75)); // ≈ 22.86
    }
}
```"
Exercício 3: Classe HybridVehicle
Defina uma classe HybridVehicle com ao menos cinco atributos híbridos e gere getters/setters.

Solução
Veja o exemplo em 1.3 Modelagem de Classes.

Exercício 4: Algoritmo de Substituição de Gênero
Escreva em pseudocódigo o algoritmo que substitui termos de gênero, cuidando de limites de palavra.

Solução
Para cada palavra em texto:
  se palavra igual a “wife” ou “husband” então
    substituir por “spouse”
  senão se palavra igual a “man” ou “woman” então
    substituir por “person”
  senão se palavra igual a “son” ou “daughter” então
    substituir por “child”
Fim para
