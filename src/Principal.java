import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        var cartao = new Cartao();
        double saldo;

        System.out.println("Digite o limite do cartão");
        cartao.setSaldo(leitura.nextDouble());
        saldo = cartao.getSaldo();
        List<Compra> listaDeCompras = new ArrayList<>();



        while(true){
            var compra = new Compra();
            System.out.println("Digite a descrição da compra");
            compra.setDescricao(leitura.next());
            System.out.println("Digite o valor da compra");
            compra.setValor(leitura.nextDouble());
            if (compra.getValor() <= saldo) {
                listaDeCompras.add(compra);
                saldo -= compra.getValor();
                System.out.printf("Compra realizada! O saldo no seu cartão é de %.2f\n",saldo);
            } else {
                System.out.println("Limite do cartão atingido! Compra não pode ser feita");
            }
            System.out.println("Digite 0 para sair ou qualquer outro número para continuar");
            if (leitura.nextInt() == 0) {
                break;
            }
        }
        listaDeCompras.sort(Comparator.comparing(Compra::getValor));
        System.out.println("----------------------------");
        System.out.println("Lista de compras realizadas:");
        for (Compra compra: listaDeCompras) {
            System.out.println(compra.toString());
        }
        System.out.println("----------------------------");

    }
}