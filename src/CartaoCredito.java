import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limiteCartao;
    private  double saldoCartao;
    private List<Compra> compras;

    public CartaoCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldoCartao = limiteCartao;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if (this.saldoCartao > compra.getValorCompra()){
            this.saldoCartao -= compra.getValorCompra();
            this.compras.add(compra);
            return true;
        }

        return false;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldoCartao() {
        return saldoCartao;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
