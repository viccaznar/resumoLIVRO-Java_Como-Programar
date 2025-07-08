# 📚 Chapter 1: Overview of Programming Languages

## 1.7.1 Legacy Scientific & Business Languages 🧮🏦  
Resumo  
Linguagens pioneiras criadas nos anos 1950 para cálculos numéricos (Fortran) e processamento de grandes volumes de dados comerciais (COBOL). Ambas ainda suportam paradigmas modernos como OOP.

Exemplo lúdico  
Fortran é como um supercomputador de nave espacial calculando órbitas; COBOL é o cofre de banco que lida com milhões de registros de contas por segundo.

- Fortran: developed by IBM for heavy math in science/engineering; now OO-capable.  
- COBOL: born da colaboração indústria/governo para sistemas financeiros; mantém-se em bancos e governos.

---

## 1.7.2 Structured & Educational Languages 🎓  
Resumo  
Projetadas para ensinar programação estruturada e boas práticas de design: Pascal e Ada focam em clareza e segurança; Basic facilita os primeiros passos; Visual Basic traz GUI fácil.

Exemplo lúdico  
Pascal é a prancheta do artista — limpa e organizada; Ada é a prancheta militar — rigorosa e segura; Basic é o primeiro giz na lousa do novato; Visual Basic é o kit de blocos coloridos para criar janelas no Windows.

- Pascal: ideal para ensino de “structured programming”.  
- Ada: padronizada pelo Departamento de Defesa dos EUA, robusta e tipada.  
- Basic/Visual Basic: linguagem de entrada para iniciantes, evoluiu para OOP e desenvolvimento rápido de GUIs.

---

## 1.7.3 System & Object-Oriented Compiled Languages ⚙️  
Resumo  
Linguagens de baixo nível com alta performance: C domina sistemas operacionais e kernels; C++ e Objective-C ampliam C com OOP; C# combina C++ e Java para aplicações .NET.

Exemplo lúdico  
C é a carroceria de metal resistente de um carro de corrida; C++ adiciona o turbo e suspensão ajustável (classes e herança); Objective-C é o C com um sistema de GPS (Smalltalk messaging); C# é o sedã inteligente que conversa com a nuvem .NET.

- C: base de UNIX, SOs e código embarcado.  
- C++: adiciona classes, herança e templates.  
- Objective-C: C + runtime de mensagens para macOS/iOS.  
- Visual C#: inspirado em C++/Java para o ecossistema Microsoft.

---

## 1.7.4 Scripting & Web Languages 🌐  
Resumo  
Linguagens de script dinamicamente tipadas, ideais para Web, automação e prototipagem: PHP, Perl, Python e JavaScript dominam servidores e navegadores; Ruby on Rails acelera desenvolvimento de aplicações intensivas em banco de dados.

Exemplo lúdico  
PHP é o barista que serve cafés (páginas web) na maioria dos cafés do mundo; Perl é o meticuloso editor de texto que refina logs e relatórios; Python é o assistente multicombo com kits de ciência de dados; JavaScript é o mágico que faz páginas ganharem vida ao toque; Ruby on Rails é a cozinha profissional que prepara sites completos em minutos.

- PHP: embutido em HTML, conecta a MySQL e outros bancos.  
- Perl: forte em processamento de texto e automação de tarefas.  
- Python: versátil, “baterias incluídas” e extensível via C/C++  
- JavaScript: linguagem onipresente no browser, agora também no servidor (Node.js).  
- Ruby on Rails: framework opinionado para CRUD rápido e DRY.

---

# 🛠️ Chapter 2: Best Practices & Real-World Scenarios

## 2.1 Escolha da Linguagem Certa ✅  
- **Critérios**: performance vs rapidez de desenvolvimento vs ecossistema de bibliotecas.  
- **Domínio**: finance (C++), data science (Python), web front-end (JavaScript), mobile (Java/C#/Swift).  

Exemplo real  
Numa startup de e-commerce, backend em Python/Django acelera o MVP; microsserviços críticos de pagamento em C++ garantem latência mínima.

## 2.2 Padronização e Qualidade 📝  
- Adote **style guides** (PEP8, Google C++ Style, JavaScript Standard).  
- Use **linters** e **formatadores** automáticos (ESLint, Black, clang-format).  

Exemplo real  
Grande banco utiliza clang-format em C++ e PEP8 em Python para manter consistência em milhares de arquivos de código.

## 2.3 Reuse & Modularidade 🔗  
- Empacote funções comuns em bibliotecas ou frameworks internos.  
- Gerencie dependências com **Maven**, **npm**, **pip**, **Composer**.  

Exemplo real  
Equipe de marketing constrói uma lib interna de autenticação em Node.js, reutilizada em três produtos web diferentes.

---

# 🏋️ Chapter 3: Exercises for Mastery

## Exercício 1: Correspondência  
Associe cada linguagem ao uso mais comum:

| Linguagem      | Uso Principal                  |
|----------------|--------------------------------|
| Fortran        | a) Web scripting               |
| JavaScript     | b) Cálculos científicos        |
| Python         | c) Desenvolvimento front-end   |
| PHP            | d) Prototipagem e ciência de dados |
| C              | e) Sistemas operacionais       |

### Solução  
- Fortran → b  
- JavaScript → c  
- Python → d  
- PHP → a  
- C → e  

---

## Exercício 2: Verdadeiro ou Falso  
1. C++ só suporta programação procedural.  
2. JavaScript roda apenas no navegador.  
3. Ruby on Rails acelera a criação de CRUDs de banco de dados.  

### Solução  
1. Falso (C++ suporta OOP e genéricos).  
2. Falso (com Node.js também roda no servidor).  
3. Verdadeiro  

---

## Exercício 3: Escolha de Linguagem  
Para cada cenário, indique a melhor linguagem ou framework:

a) Pipeline de ETL de Big Data com alto volume e processamento em lote.  
b) SPA (Single-Page Application) com interatividade rica no cliente.  
c) Firmware de drone com restrição de memória.  

### Exemplo de Resposta  
a) Python (PySpark) ou Java (Hadoop)  
b) JavaScript (React, Vue.js)  
c) C/C++  

---

> Estes exercícios fixam as características e aplicações de linguagens populares no mercado. Aplique-os em estudos de caso reais para entender trade-offs e sinergias entre ferramentas e domínios de negócio.