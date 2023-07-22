# Projeto Final - Java: trabalhando com listas e coleções de dados da Alura

***

![Static Badge](https://img.shields.io/badge/Status-Done-dark_green)

*Projeto Final do curso Java: trabalhando com listas e coleções de dados da Alura*

### Sistema simples de compras com cartão de crédito

Estabeleça um limite para seu cartão de crédito e faça compras nele até 
estourá-lo, podendo parar quando quiser. O sistema avisa quando não pode realizar a compra. Ao final 
das compras, receba o extrato com a descrição e o valor de cada compra
realizada em ordem crescente de valor.

### Classes

**Classe *Cartao***: permite determinar o limite do cartão (objeto) e ter acesso a ele. 

**Classe *Compra***: permite determinar e ter acesso à descrição e ao valor de cada objeto
desse tipo. Além disso, a classe implementa a interface *Comparable*, sobrescrevendo o 
método de comparação *compareTo()* para que seja possível fazer a organização em ordem
crescente quando aplicado o método *sort()*.

#### Principal

Na classe *Principal*, crio o objeto **leitura** do tipo *Scanner* para receber a entrada 
do teclado. Além disso, crio o objeto **cartao** e a váriavel **limiteDisponivel**, que vai
representar o limite disponível do cartão depois de cada compra, acessando o valor do limite
do cartão através do método *getLimite()* apenas uma vez sem alterá-lo nunca.

Peço para que seja inserido o valor do limite do **cartao** no teclado e o atribuo ao **cartao** 
através do método *setLimite()*. Crio a **listaDeCompras**, um objeto do tipo *ArrayList* para
guardas os objetos do tipo *Compra* que serão criados em breve.

Dentro de um loop (que será quebrado apenas quando o usuário digitar o número 0 quando o programa
perguntar), crio uma variável local **compra**, que recebe um objeto do tipo *Compra*. Desta forma,
sempre que o loop se repetir, será criado um novo objeto, mesmo que seus atributos sejam os mesmos
de um anterior. Então peço para que o usuário entre com uma palavra para a descrição da compra e o 
valor da compra, atribuindo cada um ao objeto **compra** criado.

Se o valor da compra for menor ou igual ao limite disponível do cartão, então a compra será adicionada
à lista de compras feitas (**listaDeCompras**) e a variável **limiteDisponivel** será recalculada
decrementando seu valor do valor da compra realizada. Uma mensagem será exibida na tela informando que
a compra foi feita e o novo limite disponível do cartão. Caso o valor da comrpa seja maior que o limite 
disponível do cartão, será exibido uma mensagem de que a compra não pode ser realizada, pois o limite do 
cartão foi atingido.

Após este condicional, o programa pergunta ao usuário se deseja continuar no menu ou se deseja sair e, de acordo
da leitura do teclado, o loop retorna ao início ou finaliza. Após finalizado, é aplicado o método *sort()* na 
**listaDeCompras** que, implementando o método *comparing()* da classe *Comparator*, organiza a lista de forma 
crescente de acordo com o atributo *valor* de cada item da lista, obtido através do método *getValor()*. Então, 
para cada item do tipo *Compra* na **listaDeCompras** é impresso na tela os dados da *compra*, de acordo com o
método *toString()* sobrescrito na classe *Compra*. 