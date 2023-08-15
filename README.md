# Atividade Threads

Neste código, para que se tornasse possível a realização das especificações passadas no exercício, comecei pelas intruções "import java.util.Scanner;", pois gostaria de testar no terminal do IntelliJ se realmente estava indo tudo certo durante a execução do programa.
Após o "import", foi criada a classe que seria a responsável por gerenciar as Threads em paralelo e também guarda o método que faria os cálculos para identificar se era ou não número primo.

# Passos a passo do método calculaPrimo

Assim como existe fórmulas para alguns cálculos complexos, também existe para determinar se um número é primo ou não. 
É importante destacar que os números primos só são divisíveis por 1 e por ele mesmo, tendo em vista essas informações, há também a existência de outras regrinhas, como: Resto da divisão igual a zero; Possíveis divisões por números como 3, 5 e o 7; etc.
Assim sendo, foi desenvolvida uma estrutura de decisão que recebesse essas regras e a partir delas, podesse classificar se o número seria primo ou não.

# Threads no programa

Comecei nomeando meu Scanner como sistema e armazenando os números inteiros através dessa variável. Informei que poderiam ser inseridos 5 números para a análise, assim como foi inicializado o Scanner e as Threads.
Inicializo as Threads de maneira idependente e passando também o método responsável por calcular se o número é primo, podendo em seguida, gerar sua classificação.

# Código
O código recebe os 5 números de uma só vez e, em seguida, retorna o número e sua classificação.
