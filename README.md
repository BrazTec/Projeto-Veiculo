Integrantes: Eduardo Braz de Oliveira // Willian Makoto Maeda

Exercício: Introdução à POO - Herança, Abstração e Encapsulamento

Parte 1: Abstração
Imagine que você precisa criar um sistema para gerenciar veículos em uma empresa de
aluguel de carros. Cada veículo tem certas características, como marca, modelo, ano de
fabricação, e cor.
Perguntas:
1. Quais características (atributos) e comportamentos (métodos) você consideraria
importantes para uma classe abstrata chamada Veículo? Liste pelo menos 4
atributos e 2 métodos que fariam parte dessa classe.

R: Atributos: Marca; modelo; ano de fabricação; cor e VIN.
Métodos: Acelerar e frear.

2. Por que você acha que essa classe deveria ser abstrata? Explique o conceito de
abstração com base nesse exemplo.

R: Essa classe deve ser abstrata, devido que consiste em características e comportamentos que todo veículo possa ter. A abstração se concentra em ocultar os detalhes complexos de uma implementação, expondo apenas as funcionalidades essenciais que são necessárias para o uso de um objeto, não precisamente fazendo uso de todas as funcionalidades, ou seja, todos os métodos e atributos.

Parte 2: Herança
Com base na classe abstrata Veículo, você precisa criar classes específicas para tipos de
veículos: Carro, Moto, e Caminhão.
Perguntas:
1. Se a classe Veiculo tem um método abstrato chamado mover(), como você
implementaria esse método nas classes Carro, Moto, e Caminhao? Descreva
como cada tipo de veículo se move de maneira diferente.

R:Fazendo uso do método abstrato chamado acelerar(), podemos implementa-lo nas classes Carro, Moto e Caminhão, de acordo com o nome de cada veículo, que no caso é uma característica individual de cada um, herdando então as características e comportamentos abstratos. O acelerar() será diferente para cada um, de acordo com a premissa que o nome utilizado em cada, terá nome diferente.

2. Qual é a vantagem de usar herança nesse caso, em vez de criar as classes Carro,
Moto, e Caminhao do zero? Explique o conceito de herança com base nesse
exemplo.

R:As vantagens de fazer uso da herança nesse caso, se concentra em herdar os atributos e métodos abstratos, quais esses, todos os tipos de veículos terão e ao realizar isso, evito ter que inserir as mesmas informações para classes diferentes. Herança permite que uma nova classe, chamada subclasse ou classe derivada, herde propriedades e comportamentos de uma classe existente, chamada superclasse ou classe base.

Parte 3: Encapsulamento
Para proteger as informações dos veículos, você precisa garantir que os atributos, como o
número de identificação do veículo (VIN), não possam ser alterados diretamente.
Perguntas:
1. Como você implementaria o encapsulamento para proteger o atributo vin na
classe Veículo? Descreva como você usaria métodos getter e setter para acessar e
modificar esse atributo.

R:Implementaria através do modificador chamado “private”. Uma vez que o número de identificação esteja implementado com o modificador private, para conseguir acessa-lo usaria o método chamado getter, para puxar a informação anexada junto ao número de identificação e assim, conseguir visualiza-lo e usaria o método setter, para realizar uma atribuição ao número de identificação, podendo alterá-lo.

2. Por que é importante proteger os atributos de uma classe? Explique o conceito de
encapsulamento com base nesse exemplo.

R:É importante protegê-los de modo que não possam ser acessados de fora da classe, restringindo assim o seu uso, podemos referi-lo como uma identificação única e pessoal. Encapsulamento é um processo de envolver dados e código em uma única unidade. Essa proteção pode ser conquistada utilizando o modificador de acesso private, que indica que a variável ou dado não pode ser acessado de fora da classe.

Instruções para Resolução
• Escreva suas respostas no papel, explicando seus pensamentos de forma clara e
objetiva.
• Não é necessário escrever código Java completo, apenas descreva como você
abordaria cada questão usando os conceitos de POO.
