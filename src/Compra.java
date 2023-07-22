

public class Compra implements Comparable<Compra> {

    private String descricao;
    private double valor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%s - R$%.2f", this.getDescricao(), this.getValor());
    }

    @Override
    public int compareTo(Compra compra) {
        return this.getDescricao().compareTo(compra.getDescricao());
    }
}
