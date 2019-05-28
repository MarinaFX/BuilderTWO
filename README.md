# 2. Builder
## 2.2.Exercício:

###### Escreva classes para satisfazer os seguintes papéis do padrão _Builder_:
- _Client_: recebe como parâmetros o nome, endereço, telefone e e-mail de uma pessoa, solicita ao
_director_ que construa informações de contato, recupera a informação do _builder_ e imprime;
- _Director_: recebe como parâmetro o _builder_ a ser utilizado e os dados de contato. Manda o _builder_
construir o contato;
- _Builder_: constrói o contato. Existem três tipos de contato e um _builder_ para cada tipo:
  - `ContatoInternet`: armazena nome e e-mail;
  - `ContatoTelefone`: armazena nome e telefone;
  - `ContatoCompleto`: armazena nome, endereço, telefone e e-mail.

A classe que representa o papel `client` deve ter o método `main()` que irá criar um director e um _builder_ de
cada tipo. Em seguida, deve pedir ao _director_ que crie um contato de cada tipo e imprimi-los (use o
`toString()` da classe que representa a informação de contato).
