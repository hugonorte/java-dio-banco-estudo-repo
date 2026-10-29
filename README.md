# Java Banco Digital DIO (estudo)

> **Abstração de um Banco Digital com Programação Orientada a Objetos em Java**  
> Projeto de caráter acadêmico voltado ao estudo prático, consolidação dos pilares de Orientação a Objetos e boas práticas do ecossistema Java.

---

## 📖 Sobre o Projeto

O **Java Banco Digital DIO (estudo)** é um projeto prático concebido como laboratório de aprendizado e consolidação da linguagem **Java** e do paradigma de **Programação Orientada a Objetos (POO)**, desenvolvido como parte do desafio prático da Digital Innovation One (DIO). A aplicação modela o domínio de uma instituição bancária, permitindo a abertura de contas (Corrente e Poupança) e a realização de operações financeiras essenciais.

O projeto tem como foco principal o domínio dos quatro pilares da Orientação a Objetos:
- **Abstração:** Capacidade de concentrar-se nos aspectos essenciais do domínio bancário, representada pela interface `IConta` e pela classe abstrata `Conta`, que definem o contrato e a estrutura base das operações financeiras.
- **Encapsulamento:** Proteção do estado interno dos objetos (`agencia`, `numero`, `saldo`, `nome`), expondo comportamentos seguros por meio de métodos de negócio (`depositar`, `sacar`, `transferir`) e métodos acessores (`getters` e `setters`).
- **Herança:** Reaproveitamento de código e especialização de comportamento através das classes filhas `ContaCorrente` e `ContaPoupanca`, que estendem a superclasse `Conta` (`extends Conta`) e herdam seus atributos e regras de negócio.
- **Polimorfismo:** Capacidade de referenciar objetos de forma genérica (`Conta cc = new ContaCorrente()`, `Conta cp = new ContaPoupanca()`) e invocar comportamentos específicos em tempo de execução, como na impressão customizada de extratos (`imprimirExtrato`) e nas transferências entre diferentes tipos de conta.

---

## 🛠️ Tecnologias & Stack Utilizada

A arquitetura do projeto foi estruturada com foco na clareza do código e nos fundamentos nativos da plataforma Java:

| Tecnologia | Descrição |
|---|---|
| **Java (JDK)** | Linguagem base e recursos nativos da biblioteca padrão (`java.lang`) |
| **Paradigma** | Programação Orientada a Objetos (Interfaces, Classes Abstratas, Herança e Polimorfismo) |
| **IDE & Tooling** | Visual Studio Code (Extension Pack for Java) |
| **Estrutura de Build** | Projeto Java padrão do VS Code (`src/` para código-fonte e `bin/` para bytecodes compilados) |

---

## ✨ Principais Funcionalidades

- **Geração Automática de Dados Bancários:** Atribuição automática de agência padrão (`AGENCIA_PADRAO = 1`) e número de conta sequencial (`SEQUENCIAL`) a cada nova instância de conta criada.
- **Operação de Depósito (`depositar`):** Adição direta de valores ao saldo da conta.
- **Operação de Saque (`sacar`):** Dedução de valores do saldo disponível na conta.
- **Transferência entre Contas (`transferir`):** Movimentação financeira polimórfica que realiza o saque na conta de origem e o depósito na conta de destino (`Conta contaDestino`), independentemente de ser Conta Corrente ou Poupança.
- **Emissão de Extrato (`imprimirExtrato`):** Exibição detalhada no console contendo o cabeçalho específico da modalidade da conta, agência, número e saldo atualizado.

---

## 🚀 Como Executar o Projeto Localmente

Siga o passo a passo abaixo para clonar, compilar e executar a aplicação em seu ambiente local:

### 1. Pré-requisitos

Certifique-se de possuir instalado em sua máquina:
- **[Java JDK](https://adoptium.net/)** (versão 11, 17 ou superior)
- **[Git](https://git-scm.com/)**
- **IDE Java** de sua preferência (VS Code com *Extension Pack for Java*, IntelliJ IDEA ou Eclipse)

---

### 2. Clonando o Repositório

Abra o terminal e execute:
```bash
git clone https://github.com/hugonorte/java-dio-banco-estudo-repo.git
cd java-dio-banco-estudo-repo
```

---

### 3. Compilando o Código-Fonte

A partir da raiz do projeto, compile os arquivos `.java` direcionando os bytecodes para a pasta `bin/`:
```bash
javac -d bin src/*.java
```

---

### 4. Executando a Aplicação

Inicie a classe principal `App` a partir dos arquivos compilados:
```bash
java -cp bin App
```

Saída esperada no terminal:
```text
Extrato Conta Corrente
Agencia: 1
Numero: 1
Saldo: 0.0
Extrato Conta Poupanca
Agencia: 1
Numero: 2
Saldo: 100.0
```

> **Dica:** Caso esteja utilizando o **Visual Studio Code**, basta abrir o arquivo `src/App.java` e clicar em **Run** acima do método `public static void main(String[] args)`.

---

## 📂 Estrutura de Pastas

```text
java-dio-banco-estudo-repo/
├── .vscode/
│   └── settings.json          # Configurações de diretórios do projeto Java no VS Code
├── src/                       # Código-fonte da aplicação
│   ├── App.java               # Classe principal (entrypoint) com simulação de uso das contas
│   ├── Banco.java             # Classe de representação da entidade Banco
│   ├── Cliente.java           # Modelo de dados do cliente titular
│   ├── Conta.java             # Classe abstrata base com atributos, sequencial e operações comuns
│   ├── ContaCorrente.java     # Especialização de Conta para a modalidade Conta Corrente
│   ├── ContaPoupanca.java     # Especialização de Conta para a modalidade Conta Poupança
│   └── IConta.java            # Interface que define o contrato das operações bancárias
├── lib/                       # Diretório reservado para dependências externas (.jar)
├── bin/                       # Arquivos bytecode (.class) gerados após a compilação
└── README.md                  # Documentação do projeto
```

---

## 👨‍💻 Autor & Propósito

Projeto desenvolvido por **Hugo Norte** para fins estritamente educacionais e aprofundamento prático nos fundamentos da linguagem Java e na Programação Orientada a Objetos.

Sinta-se à vontade para explorar o código, clonar o projeto e utilizá-lo como referência de estudos!
