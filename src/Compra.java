public class Compra implements Comparable<Compra>{
    private String descricaoCompra;
    private double valorCompra;

    public Compra(String descricaoCompra, double valorCompra) {
        this.descricaoCompra = descricaoCompra;
        this.valorCompra = valorCompra;
    }

    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    @Override
    public String toString() {
        return "Compra: descricaoCompra = " + descricaoCompra +
                " valorCompra = " + valorCompra;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorCompra).compareTo(Double.valueOf(outraCompra.valorCompra));
    }
}
