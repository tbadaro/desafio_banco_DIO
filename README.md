# desafio_banco_DIO

Projeto desevolvido para o desafio de projeto: Criando um Banco Digital com Java e Orientação a Objetos da DIO.

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
A classe Transação possui 3 métodos:
    
    saque(conta, valor): subtrai o valor especificado da conta especificada e insere a operação à lista de transações sob o tipo SAQUE;
    deposito(conta, valor): adiciona o valor especificado da conta especificada e insere a operação à lista de transações sob o tipo DEPOSITO;
    transferencia(conta, contaDestino, valor): subtrai o valor especificado da conta especificada, adiciona o valor à conta destino especificada, e adiciona a operação à lista de transações sob o tipo SAQUE;

Main
A título de teste das funcionalidades implementadas, o arquivo Main.java possui exemplos de operações realizadas a partir das classes criadas em um fluxo normal de operaçao da aplicação. Na ordem:
    
    -Gera um banco;
    -Gera 4 clientes:
        cliente1 - Pessoa física;  
        cliente2 - Pessoa física;  
        cliente3 - Pessoa física;  
        cliente4 - Pessoa juridica;  
    -Cadastra os clientes na lista de clientes do banco;
    -Gera 5 contas:
        conta1 - Conta corrente atribuida ao cliente1;
        conta2 - Conta poupança atribuida ao cliente1;
        conta3 - Conta poupança atribuida ao cliente2;
        conta4 - Conta corrente atribuida ao cliente3;
        conta5 - Conta corrente atribuida ao cliente4;
    -Adiciona as contas à lista de contas de cada cliente;
    -Adiciona as contas à lista de contas do banco;
    -Realiza as seguintes transações:
        Depósito de 200 reais na conta1;
        Transferencia de 50 reais da conta1 para a conta4;
        Transferencia de 50 reais da conta1 para a conta2;
        Saque de 50 reais da conta1;
        Saque de 300 reais da conta3;
        Depósito de 1500 reais na conta3;
        Transferência de 150 reais da conta3 para a conta1;
        Transferencia de 250 reais da conta4 para a conta 3;
    -Imprime o extrato bancário das 5 contas individualmente;
    -Imprime a lista de clientes do banco;
    -Imprime as informações do cliente1;
    
