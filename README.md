# DS-Calc
Trabalho da disciplina de Sistemas Distribuídos.

## Objetivo
Criar uma apliação que, de forma distribuída, realize as operações matemáticas básica. O sistema deve seguir a arquitetura entregue.

## Sistema

### Arquitetura

![Diagrama](https://github.com/Max-Wendel-UFC/DS-Calc/blob/master/diagrama.png)

### Papéis

##### User
+ Objeto de fronteira que implementa a interação com o usuário. Permite que o usuário escolha uma operação, atribua os parâmetros necessários e receba a resposta.

##### Proxy
+ Tornar a invocação remota a método transparente para o usuário. O objeto de fronteira (User) “acha” que o Proxy é o objeto que realmente fornece o serviço.

+ Empacota a requisição remota (operação + parâmetros) em uma mensagem e solicita o envio via sendRequest(String request) de
TCPClient.

+ Recebe a resposta via getResponse de TCPClient, desempacota o resultado e o retorna para User.

##### Despachante
+ Recebe a requisição, desempacota a operação e invoca o método correspondente do esqueleto.

+ Recebe o retorno do esqueleto e o retorna para o ServidorTCP para ser enviado ao cliente.

 ##### Esqueleto
 + Semelhante ao Proxy para o lado Servidor.
 
 + Desempacota os parâmetros, faz as conversões necessárias e chama o método apropriado do serviço (Calc).
 
 + Recebe a resposta e a empacota para retorná-la ao despachante.
 
 ##### Calc
 + Realmente implementa as funções da calculadora.
 
