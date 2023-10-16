# Todolist - Java e Spring Boot

#### Sobre 📄

- Este é o repositório backend de uma aplicação de gerenciamento de tarefas, desenvolvida em Java com o framework Spring Boot, gerenciada pelo Maven e foi utilizado um banco de dados em memória (H2). Esta aplicação oferece funcionalidades para cadastro de usuários, validação de usuários, criação e atualização de tarefas. Ela é projetada para ser a parte servidor de um aplicativo maior, como um aplicativo web ou móvel.

#### Funcionalidades Principais
- Cadastro de Usuário: Os usuários podem se registrar fornecendo informações básicas, como username, password e name    .

- Validação de Usuário: A aplicação verifica as credenciais de um usuário para autenticação e autorização.

- Criação de Tarefas: Usuários autenticados podem criar novas tarefas, atribuindo-lhes um title, description, priority, startAt e endAt.

- Atualização de Tarefas: Os usuários autenticados podem atualizar tarefas existentes, incluindo a edição de detalhes, e ajuste de datas.




#### Configuração de ambiente
- Java 17+
- Maven
- Rest Client
- VS Code
    Configuração Java no VS Code (extensões):
        - **vscjava.vscode-java-pack**
            vscjava.vscode-java-debug
            vscjava.vscode-java-test
            vscjava.vscode-java-dependency
            vscjava.vscode-maven
            redhat.java
        - **vscjava.vscode-spring-initializr**
        - **vmware.vscode-spring-boot**
        - **vscjava.vscode-spring-boot-dashboard**

        


#### Endpoints da API

A API oferece os seguintes endpoints:

- /users/: Manipulação de usuários (cadastro, validação);
- /tasks/: Manipulação de tarefas (criação, atualização).

#### Executando o Projeto
Siga estas etapas para executar o projeto em seu ambiente de desenvolvimento:

1- Clone este repositório para sua máquina local.

2- Importe o projeto em seu IDE.

3- Execute a classe principal TaskManagerApplication para iniciar o servidor.

4- O servidor estará acessível em http://localhost:8080. Você pode usar ferramentas Rest Client como o ThunderClient para interagir com a API.

ou

Pode acessar pela URL: https://todolist-java-rocketseat-6vss.onrender.com/ com os devidos endpoints, juntamente com um Rest Client.

1-executar primeiro POST /users/ com o body (criar usuário)
{
  "username": "user",
  "password": "123456",
  "name": "user test"
}

2-executar POST /tasks/ com o body (criar tarefa)
{
  "description": "aaaaaaaa",
  "title": "aaaaaa",
  "priority": "medium",
  "startAt": "2023-10-15T15:50:00",
  "endAt": "2023-10-15T16:51:00"
}
