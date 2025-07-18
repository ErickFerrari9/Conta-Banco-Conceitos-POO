# Conta-Banco-Conceitos-POO

## Repositório com implementação de um sistema bancário simples em Java, desenvolvido com o objetivo de aplicar e demonstrar os pilares da Programação Orientada a Objetos (POO).

## 🔧 Funcionalidades principais
Criar contas (poupança e corrente)

Depositar e sacar valores, com validações de saldo e limites

Transferência interna entre contas

Exibição de saldo e histórico de operações (extrato)

## 🔑 Conceitos de POO aplicados
1. Abstração
Definição das classes Conta, ContaCorrente, ContaPoupanca, Cliente, etc., que modelam somente o que realmente importa para o domínio bancário. 

2. Encapsulamento
Atributos como saldo, numeroConta, titular são privados e acessados somente via métodos públicos (getSaldo(), depositar(), sacar()), garantindo controle e proteção interna do estado.

3. Herança
Reutilização de código da classe base (Conta) por classes especializadas (ContaCorrente, ContaPoupanca), que herdam atributos e comportamentos, podendo ampliar ou modificar regras específicas. 
GitHub

4. Polimorfismo
Uso de métodos sobrescritos (override), como sacar() com regras diferentes em cada tipo de conta, permitindo tratar objetos distintos através de uma interface comum. 


## ✔️ Benefícios do projeto
Demonstração prática dos quatro pilares da POO: abstração, encapsulamento, herança e polimorfismo.

Coesão e modularidade: cada classe cuida de uma responsabilidade clara. 

Facilidade de manutenção e expansão: novos tipos de conta ou funcionalidades podem ser adicionados com mínimo impacto.

## 🚀 Próximos passos / melhorias
Armazenar as transações em um histórico (List<Transaction>) com data, valor e tipo

Permitir transferência entre diferentes clientes

Implementar login/autenticação por login/senha e validação de acesso

Adicionar interface gráfica (JavaFX / Swing) ou API REST (Spring Boot)


