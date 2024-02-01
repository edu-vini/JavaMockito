package javamockito;

public class Pedido {
    private int numero;
    private int valor;
    private String cliente;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Pedido(int numero, int valor, String cliente) {
        this.numero = numero;
        this.valor = valor;
        this.cliente = cliente;
    }

    public Transacao gerarPix(){
        Pix pix = new Pix();
        return pix.gerarPIX(this.valor);
    }

    public int getNumero() {
        return numero;
    }

    public int getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }
}
