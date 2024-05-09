- No momento em que o desenvolvedor faz uma push ou pull_request a pipeline é executada conforme o trecho de código abaixo:

        on:
          push:
            branches: [ "main" ]
          pull_request:
            branches: [ "main" ]

- Foi criado a classe Saque a simula a retirar do dinheiro (débito) e atualiação do saldo de uma conta.
Para realizar o teste foram criadas duas classes SaqueUnitarioTest e SaqueIntegracaoTest.
A classe SaqueUnitarioTest realiza dois testes unitário que fazem a validação da senha digitada pelo cliente.
Já classe SaqueIntegracaoTest realiza dois testes de integração para validar o débito em conta e atualização do saldo.

- A pipeline tem os seguintes passos "buildar_testar" e "implantar".
  Nesse trecho de código abaixo é executado o build e os testes do projeto do passo "buildar_testar"
  
          - name: Build with Maven
          run: mvn -B package --file pom.xml
  
  Nesse trecho de código abaixo é executado a implantação do projeto do passo "implantar"

        - name: Build with Maven
          run: mvn -B install --file pom.xml   
