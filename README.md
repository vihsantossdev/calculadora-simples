# Calculadora Simples em Java

Este é um projeto de uma calculadora simples desenvolvida em Java. Ele permite realizar operações matemáticas básicas: soma, subtração, multiplicação e divisão.

## Como Executar

### Pré-requisitos
1. Certifique-se de que você tem o Java Development Kit (JDK) instalado em sua máquina. Você pode verificar isso executando no terminal:
   ```
   java -version
   ```
   Caso não tenha o JDK instalado, baixe e instale a versão mais recente a partir do site oficial do [Oracle Java](https://www.oracle.com/java/technologies/javase-downloads.html) ou use uma alternativa como o [OpenJDK](https://openjdk.org/).

2. Tenha um editor ou IDE de sua preferência instalado, como:
   - IntelliJ IDEA
   - Eclipse
   - VS Code com extensão Java

### Passo a Passo

1. Clone este repositório ou copie os arquivos do projeto para sua máquina.
2. Navegue até o diretório onde salvou os arquivos e certifique-se de que os arquivos `Calculadora.java` e `Principal.java` estão no mesmo diretório.
3. Abra o terminal nesse diretório e compile os arquivos:
   ```
   javac *.java
   ```
   Isso criará os arquivos `.class` que são necessários para executar o programa.

4. Execute o programa usando o seguinte comando:
   ```
   java Principal
   ```

5. O programa solicitará que você insira dois números e o operador desejado. Siga as instruções no terminal.

### Exemplo de Uso

**Entrada no terminal:**
```
Digite o primeiro número: 10
Digite o segundo número: 5
Digite a operação (+, -, *, /): +
```

**Saída no terminal:**
```
Resultado: 15.0
```

## Funcionalidades

- **Soma (+)**: Adiciona dois números.
- **Subtração (-)**: Subtrai o segundo número do primeiro.
- **Multiplicação (*)**: Multiplica dois números.
- **Divisão (/)**: Divide o primeiro número pelo segundo. Mostra um erro caso a divisão seja por zero.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License].
