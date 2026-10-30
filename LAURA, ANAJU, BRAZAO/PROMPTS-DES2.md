# PROMPTS: Grupo ____

**Integrantes:**

1.Anajulia Biscassi
2.Laura Brilhante
3. Vinícius Brazão

**Prova:** API em MVC

**Usamos IA?** (X) Sim  ( ) Não

**Qual ferramenta e modelo (se usaram):** Chat gpt

> Quem não usou IA: troque "prompt" por "passo". Em cada bloco abaixo, descreva o que vocês fizeram naquele passo, na ordem em que aconteceu, e preencha os outros campos do mesmo jeito.

## Registro, na ordem

Copie o bloco abaixo para cada prompt. Escreva o prompt exatamente como foi enviado.

### Prompt 1

**O prompt (cópia exata):**

> Pessoal, na sexta-feira, 30/10, na nossa aula, das 10h05 às 10h55, teremos a prova prática de API em MVC.

Local: Laboratório 3. Quando der o horário, vão direto para o laboratório. A prova dura 45 minutos e começa no início do horário da nossa aula.

Como será:

Em grupo de até 3 alunos.

O uso de IA é liberado, mas opcional. Quem fizer sem IA não perde nada por isso.

A API deve ser organizada em camadas (Model, Repository, Service e Controller), com as regras de negócio na Service, e responder cada situação com o status HTTP certo.

A nota tem duas partes: Produto (6,0), a API entregue, e Processo (4,0), o caminho que vocês seguiram.

Preencham o arquivo PROMPTS.md durante a prova, não depois. Quem não usar IA descreve cada passo na ordem em que foi feito.

Entrega: pelo Classapp, nesta própria atividade. Enviem um único arquivo .zip com a pasta do projeto Escola-base (sem a pasta target), o README.md com os nomes dos integrantes e o roteiro de conferência preenchido, e o PROMPTS.md. Só um integrante de cada grupo precisa enviar.  ME AJUDE A FAZER ESSE TRABALHO

**O que a IA devolveu (uma ou duas linhas):**
2. Como a API deve ser organizada
A estrutura precisa seguir estas quatro camadas:

Controller

Recebe as requisições HTTP e retorna as respostas.

Service

Contém as regras de negócio e validações.

Repository

Responsável pelo acesso e armazenamento dos dados.

Model

Representa as entidades do sistema, como Aluno e Curso.
**O que fizemos com a resposta:** ( ) usamos como veio  (x) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**
Conferimeos se realmente era @repository e não @override
### Prompt 2

**O prompt (cópia exata):**

> e no controller fica assim: @RestController
@RequestMapping("/salas")
public class SalaController 

**O que a IA devolveu (uma ou duas linhas):**
Sim! Está certinho! ✅

No SalaController.java, você deve usar.
**O que fizemos com a resposta:** (x) usamos como veio  ( ) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):** Estavamos com dúvida sobre essa etapa, iamos colocar da maneira errada, mas conferimos no chat e ele tirou nossa dúvida.

(continuem com quantos blocos precisarem)

## Como conferimos

Descrevam como vocês testaram o que ficou pronto. Colem aqui a saída do programa (POO) ou o resultado do roteiro (API) e digam se bateu com a tabela da prova. Se não bateu, digam o que fizeram.

## Onde a IA errou, ou onde nós erramos

Contem pelo menos um erro que apareceu durante a prova: o que era, como perceberam e como resolveram. Se não apareceu nenhum, expliquem como vocês têm certeza disso.

## Respostas finais, sem consultar a IA

Respondam com as suas palavras, nos últimos 5 minutos. Não copiem de lugar nenhum.

**Pergunta 1:** O Controller recebe a solicitação e envia para a Service, que verifica a sala e sua disponibilidade. O Repository consulta os dados, enquanto o Model representa as informações da sala. Se estiver livre, a Service confirma a reserva e o Controller retorna o status HTTP correspondente.

**Pergunta 2:**A Service concentra as validações e decisões do sistema, deixando o Controller apenas com a comunicação HTTP. Essa separação facilita a organização, as alterações e o reaproveitamento do código.

**Pergunta 3:**As partes que mais mudariam seriam o Repository e as configurações do banco, pois cuidam dos dados. Model e Service poderiam ser mantidas se as informações e funcionalidades continuassem as mesmas.
