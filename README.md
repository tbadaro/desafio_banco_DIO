# desafio_banco_DIO

Projeto desevolvido para o desafio de código: Criando um Banco Digital com Java e Orientação a Objetos da DIO.

O projeto implementa funcionalidades de um banco digital através do gerenciamento de clientes e contas.

Da classe Banco:
Um banco é gerado a partir do uma string nome e possui uma lista de clientes e uma de contas.
O método imprimirListaDeClientes() imprime uma lista de clientes com as contas atribuídas a cada um deles, assim como imprimirListaDeContas() 
imprime uma lista de contas registradas.

Da classe Cliente:
O objeto cliente recebe um nome e de um tipo de pessoa (física ou jurídica) e a ele é atribuído um código identificador (gerado automaticamente) e uma lista de contas.
O método imprimirInfoCliente() retorna as informações e a lista de contas do cliente.

Da classe Conta: 
O objeto conta recebe um cliente e um tipo de conta (poupança ou corrente) e lhe são atribuídos um número de agência (nessce caso, padrão), um número de conta automático, e uma lista de transações.
O método imprimirExtrato() imprime as informações básicas da conta, o saldo e um histórico de transações.

Da classe Transacao: 
Uma transacao é gerada a partir do tipo (saque, depósito e transferência), conta (origem da transação), contaDestino (destino para o caso de transferências) e o valor.
Seus dados são automaticamente adicionados ao histórico da conta.
