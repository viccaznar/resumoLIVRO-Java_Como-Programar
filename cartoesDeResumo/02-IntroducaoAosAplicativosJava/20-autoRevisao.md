Identifique o raciocínio contido no texto. Organize os conceitos em tópicos explicativos, com resumo objetivo, robusto e simples. Para cada conceito, insira um exemplo lúdico rico e explicativo que ilustre a ideia dos conceitos mais difícieis. Insira um capítulo sobre boas práticas e cenários reais onde o que é explicado acontece com frequência em um negócio. Organize os tópicos em capítulos e subcapítulos decorados com emoticons que condizem com o que está sendo abordado. Coloque o resultado em um único bloco no formato Markdown. Se houver exemplos de códigos, envolva-o entre dois ``` junto com o nome da linguagem de programação:

Exercícios de autorrevisão
2.1 Preencha as lacunas em cada uma das seguintes afirmações:
a) Um(a) ________ no corpo de cada método e um(a) ________ termina o corpo de cada método.
b) A instrução ________ é utilizada para tomar decisões.
c) ________ em um comentário de fim de linha.
d) ________, ________ e ________ são chamados espaço em branco.
e) ________ são reservados para uso pelo Java.
f) Aplicativos Java iniciam a execução no método ________.
g) Os métodos ________, ________ e ________ exibem informações em uma janela de comando.
2.2 Determine se cada um dos seguintes é verdadeiro ou falso. Se falso, explique por quê.
a) Os comentários fazem com que o computador imprima o texto depois das // na tela quando o programa executa.
b) Todas as variáveis devem ser atribuídas a um tipo quando são declaradas.
c) O Java considera que as variáveis number e NuMbEr são idênticas.
d) O operador de resto (%) pode ser utilizado apenas com operandos inteiros.
e) Os operadores aritméticos *, /, %, + e- têm, todos, o mesmo nível de precedência.
–, subtração, 41
/* */, comentário tradicional, 29
/, divisão de inteiros, 41
%d, especificador de formato, 39
%s, especificador de formato, 36
<, operador (“maior que”), 43
//, comentário de fim de linha, 29
adição, 41
API (application programming interface), 37
aplicativo, 29
argumento para um método, 32
arquivo de classe, 33
associatividade de operadores, 41
asterisco (*), 41
autodocumentado, 38
barras invertidas (\\), 35
caractere de escape, 35
cd, para mudar de diretório, 33
char, tipo primitivo, 38
class, palavra-chave, 30
.class, arquivo, 33
classe definida pelo programador, 30
código autodocumentado, 38
comentário tradicional (/* */ ), 29
condição, 43
corpo da definição de método, 32
corpo de uma declaração de classe, 37
corpo de uma declaração de método, 32
decisão, 43
declaração de classe, 30
distinção de letras maiúsculas e minúsculas, 30
divisão, 41
divisão de inteiro, 41
documentar programa, 29
double, tipo primitivo, 38
erro de compilação, 30
erro de compilador, 30
erro de sintaxe, 30
erro em tempo de compilação, 30
especificador de formato, 36
expressão, 39
false, palavra-chave, 43
fim de linha (de uma única linha), comentário,
//, 29
forma de linha reta (expressões aritméticas em
Java), 41
identificador, 30
if, instrução de seleção única, 43
import, declaração, 37
imprimir uma linha de texto, 32
inicializar uma variável em uma declaração, 38
instrução, 32
instrução de declaração de variável, 38
instrução vazia (um ponto-e-vírgula, ;), 46
int, tipo primitivo, 38
inteiro, 36
janela terminal, 32
java, comando, 29
java.lang, pacote, 38
Java Application Programming Interface (Java
API), 37
java.util, pacote, 37
Java, biblioteca de classe, 37
javadoc, programa utilitário, 30
linha de comando, 32
lista separada por vírgulas, 36
método, 31
multiplicação, *, operador, 41
new, palavra-chave, 38
nome de classe, 30
nome de uma variável, 40
nova linha, caractere (\l), 34
objeto de entrada padrão (System.in), 38
objeto de saída padrão (System.out), 32
operador, 39
operador binário, 39
operador de adição (+), 42
operador de atribuição, =, 39
operador de divisão (/), 42
operador de multiplicação (*), 42
operador de resto, %, 41
operador de subtração (–), 42
operadores aritméticos, 41
operadores de igualdade, 43
operadores relacionais, 43
operando, 39
pacote, 37
palavra-chave, 30
palavra reservada, 30
parênteses, 31
parênteses aninhados, 41
ponto-e-vírgula (;), 32
precedência, 41
prompt, 38
public, palavra-chave, 31
regras de precedência de operador, 41
resto, 41
Scanner, classe, 38
sequência de escape, 35
shell, 32
string, 32
string de caractere, 32
string de formato, 36
subtração, 41
System.out, (objeto de saída padrão), 32
System.out.printf, método, 35
System.in, 38
tamanho de uma variável, 40
texto fixo em uma string de formato, 36
tipo, 38
tipo de uma variável, 40
tipo primitivo, 38
true, 43
valor de uma variável, 40
variáveis, 36
void, palavra-chave, 31
50 Capítulo 2 Introdução aos aplicativos Java
2.3 Escreva instruções para realizar cada uma das tarefas a seguir:
a) Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
b) Solicite que o usuário insira um inteiro.
c) Insira um inteiro e atribua o resultado à variável int value. Suponha que variável Scanner input possa ser utilizada para ler um valor
digitado pelo usuário.
d) Imprima "This is a Java program" em uma linha na janela de comando. Utilize o método de uso System.out.println.
e) Imprima "This is a Java program" em duas linhas na janela de comando. A primeira linha deve terminar com Java. Utilize o método
System.out.println.
f) Imprima "This is a Java program" em duas linhas na janela de comando. A primeira linha deve terminar com Java. Utilize o método
System.out.printf e dois especificadores de formato %s.
g) Se a variável number não for igual a 7, exiba "The variable number is not equal to 7".
2.4 Identifique e corrija os erros em cada uma das seguintes instruções:
a) if ( c < 7 );
 System.out.println( "c is less than 7" );
b) if ( c => 7 )
 System.out.println( "c is equal to or greater than 7" );
2.5 Escreva declarações, instruções ou comentários que realizam cada uma das tarefas a seguir:
a) Declare que um programa calculará o produto de três inteiros.
b) Crie um Scanner chamado input que lê valores a partir da entrada padrão.
c) Declare as variáveis x, y, z e result como tipo int.
d) Solicite que o usuário insira o primeiro inteiro.
e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
f) Solicite que o usuário insira o segundo inteiro.
g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
h) Solicite que o usuário insira o terceiro inteiro.
i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
j) Compute o produto dos três inteiros contidos nas variáveis x, y e z e atribua o resultado à variável result.
k) Exiba a mensagem "Product is" seguida pelo valor da variável result.
2.6 Usando as instruções que você escreveu no Exercício 2.5, escreva um programa completo que calcula e imprime o produto de três inteiros.
Respostas dos exercícios de autorrevisão
2.1 a) Chave esquerda ({), chave direita (}). b) if. c) //. d) Caracteres de espaço em branco, de nova linha e tabulações. e) Palavras-chave.
f) main. g) System.out.print, System.out.println e System.out.printf.
2.2 a) Falso. Os comentários não causam nenhuma ação quando o programa executa. Eles são usados para documentar programas e melhorar sua
legibilidade.
b) Verdadeiro.
c) Falso. Java diferencia letras maiúsculas de minúsculas, então essas variáveis são distintas.
d) Falso. O operador de resto também pode ser utilizado com operandos não inteiros em Java.
e) Falso. Os operadores *, / e % estão no mesmo nível de precedência e os operadores + e – estão em um nível mais baixo de precedência.
2.3 a) int c, thisIsAVariable, q76354, number;
 ou
 int c;
 int thisIsAVariable;
 int q76354;
 int number;
b) System.out.print( "Enter an integer: " );
c) value = input.nextInt();
d) System.out.println( "This is a Java program" );
e) System.out.println( "This is a Java\nprogram" );
f) System.out.printf( "%s\n%s\n", "This is a Java", "program" );
g) if ( number != 7 )
System.out.println( "The variable number is not equal to 7" );
2.4 a) Erro: O ponto-e-vírgula depois do parêntese direito da condição ( c < 7 ) no if. Correção: remova o ponto-e-vírgula depois do parêntese
direito. [Nota: como resultado, a instrução de saída executará independentemente de a condição em if ser verdadeira].
b) Erro: =>O operador relacional => é incorreto. Correção: altere => para >=.
Exercícios 51
2.5 a) // Calcula o produto de três inteiros
b) Scanner input = new Scanner( System.in );
c) int x, y, z, result;
ou
int x;
int y;
int z;
int result;
d) System.out.print( "Enter first integer: " );
e) x = input.nextInt();
f) System.out.print( "Enter second integer: " );
g) y = input.nextInt();
h) System.out.print( "Enter third integer: " );
i) z = input.nextInt();
j) result = x * y * z;
k) System.out.printf( "Product is %d\n", result );
2.6 A solução para o Exercício de autorrevisão 2.6 é a seguinte:
1 // Ex. 2.6: Product.Java
2 // Calcula o produto de três inteiros.
3 import java.util.Scanner; // programa utiliza Scanner
4
5 public class Product
6 {
7 public static void main( String[] args )
8 {
9 // cria Scanner para obter entrada a partir da janela de comando
10 Scanner input = new Scanner( System.in );
11
12 int x; // primeiro número inserido pelo usuário
13 int y; // segundo número inserido pelo usuário
14 int z; // terceiro número inserido pelo usuário
15 int result; // produto dos números
16
17 System.out.print( "Enter first integer: " ); // solicita entrada
18 x = input.nextInt(); // lê o primeiro inteiro
19
20 System.out.print( "Enter second integer: " ); // solicita entrada
21 y = input.nextInt(); // lê o segundo inteiro
22
23 System.out.print( "Enter third integer: " ); // solicita entrada
24 z = input.nextInt(); // lê o terceiro inteiro
25
26 result = x * y * z; // calcula o produto dos números
27
28 System.out.printf( "Product is %d\n", result );
29 } // fim do método main
30 } // fim da classe Product
Enter first integer: 10
Enter second integer: 20
Enter third integer: 30
Product is 6000