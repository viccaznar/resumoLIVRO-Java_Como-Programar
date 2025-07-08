# 🌐 Capítulo 1: Internet e World Wide Web

## 1.11.1 Da ARPANET ao TCP/IP 🚀  
Resumo  
Nos anos 1960, ARPA interligou universidades via ARPANET. Surgiu o **TCP** para enviar pacotes numerados com segurança, e o **IP** para conectar diversas redes, formando a Internet.  

Exemplo lúdico  
Imagine cartas numeradas (pacotes) viajando por carteiros diferentes (roteadores) até chegarem na ordem certa no destino graças a um super-álbum de envelopes (TCP/IP).

---

## 1.11.2 A World Wide Web: HTML e HTTP 🌍  
Resumo  
Em 1989 Tim Berners-Lee criou o **HTML** para documentos com links e o **HTTP** para transferi-los. A Web tornou a Internet amigável, exibindo texto, imagens, áudio e vídeo em navegadores.  

Exemplo lúdico  
Pense na Web como uma biblioteca mágica onde cada livro (“page.html”) tem bilhetes que teleportam você a outras estantes (links), e o HTTP é o bibliotecário que traz o livro certo.

---

## 1.11.3 Web Services e Mashups 🛠️  
Resumo  
**Web services** são APIs que entregam dados (maps, tweets, vídeos). **Mashups** combinam esses serviços para criar apps poderosos, como unir anúncios de imóveis ao Google Maps.  

Exemplo lúdico  
É como misturar sorvete de baunilha (dados de imóveis) com calda de caramelo (mapas): juntos formam uma sobremesa que nem um dos dois pode oferecer sozinho.

---

## 1.11.4 Ajax: Web Dinâmica ⚡  
Resumo  
**Ajax** envia/recebe dados em segundo plano via JavaScript e XMLHttpRequest, deixando aplicações web rápidas e interativas, sem recarregar a página inteira.  

Exemplo lúdico  
É como um garçom ninja que traz novo suco ao seu copo sem interromper sua conversa na mesa de bar.

---

## 1.11.5 Internet das Coisas (IoT) 🤖  
Resumo  
Qualquer “coisa” com IP e capacidade de enviar dados entra na IoT: carros que pagam pedágio sozinhos, termostatos inteligentes e wearables que medem saúde.  

Exemplo lúdico  
Imagine que suas geladeiras e lâmpadas têm carteirinhas de estudante de IP e mandam selfies (dados) ao servidor da casa toda vez que precisam de repor estoque ou luz.

---

# 🔧 Capítulo 2: Boas Práticas & Cenários Reais

## 2.1 Arquitetura de Rede Corporativa 🏢  
- **DMZ** para servidores públicos (web, email).  
- **VPN** para acesso remoto seguro.  
- **Load Balancer** para distribuir tráfego HTTP/HTTPS.  

Exemplo real  
Bancos usam DMZ para o site e VPN + 2FA para que funcionários administrem sistemas internos sem expor dados sensíveis.

---

## 2.2 Design de APIs e Segurança 🔒  
- Adote **RESTful** com recursos claros e verbos HTTP corretos (GET, POST, PUT, DELETE).  
- Proteja endpoints com **OAuth 2.0** ou **API Keys**.  
- Versione a API (`/v1/`, `/v2/`) para não quebrar clientes.  

Exemplo real  
Uma fintech oferece `/v1/accounts` para saldo, `/v2/payments` para transferências; tokens JWT garantem que somente apps autenticados acessem dados.

---

## 2.3 Mashups em Negócios 🌟  
- Integre **Google Maps** para geolocalização de clientes.  
- Combine **Weather API** para sugerir promoções de produtos sazonais.  
- Use **Social Media APIs** (Twitter, Instagram) para alimentar dashboards de marketing.  

Exemplo real  
Uma rede de fast-food cria mashup que mostra no app a loja mais próxima, previsão do tempo e promoções de bebidas quentes em dias frios.

---

## 2.4 IoT & Indústria 4.0 🏭  
- Sensores enviam dados via **MQTT** ou **HTTP**.  
- Plataforma de IoT (AWS IoT, Azure IoT Hub) para coleta e análise em tempo real.  
- **Dashboard** com gráficos de KPI e alertas por SMS/Email.  

Exemplo real  
Fábricas monitoram máquinas com sensores de vibração; se o eixo girar além do limite, receba alerta no celular e evite parada de linha.

---

# 🏋️ Capítulo 3: Exercícios de Fixação

## Exercício 1: Preencha as Lacunas  
1. ARPANET evoluiu para a ________ com os protocolos TCP e IP.  
2. HTML define a estrutura de páginas e ________ transporta esses documentos.  
3. Mashups combinam dados de múltiplos ________.  
4. Ajax permite comunicação assíncrona entre cliente e ________.  
5. Na IoT, “coisas” usam endereços ________ para enviar dados.

### Solução  
1. Internet  
2. HTTP  
3. web services  
4. servidor  
5. IP

---

## Exercício 2: Verdadeiro ou Falso  
a) TCP garante que pacotes cheguem em ordem e sem perdas.  
b) HTTP funciona apenas em portas acima de 10000.  
c) Ajax recarrega toda a página web ao buscar dados novos.  
d) IoT usa somente Wi-Fi para comunicação.  

### Solução  
a) Verdadeiro  
b) Falso (normalmente portas 80 e 443)  
c) Falso (comunica-se em segundo plano)  
d) Falso (pode usar LoRa, LTE-M, Ethernet, etc.)

---

## Exercício 3: Mapeamento de Protocolos  
Associe cada protocolo/ferramenta à sua função:

| Protocolo/Ferramenta | Função                                   |
|----------------------|------------------------------------------|
| TCP                  | a) Hipertexto em páginas web             |
| HTTP                 | b) Roteamento confiável de pacotes       |
| AJAX                 | c) Geolocalização em mashups             |
| Google Maps API      | d) Comunicação assíncrona sem reload     |

### Solução  
- TCP → b  
- HTTP → a  
- AJAX → d  
- Google Maps API → c

---

## Exercício 4: Código Java – Requisição HTTP Simples  
Escreva um trecho em Java que faça GET de uma URL e imprima o corpo da resposta.

"```java
import java.io.*;
import java.net.*;

public class SimpleHttp {
    public static void main(String[] args) throws Exception {
        URL url = new URL(\"https://api.example.com/data\");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(\"GET\");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) System.out.println(line);
        in.close();
    }
}
```"

---

> Estes exercícios e práticas consolidam sua compreensão de Internet, Web, APIs, Ajax e IoT. Aplique-os em projetos reais para arquitetar soluções escaláveis e inov