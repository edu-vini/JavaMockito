package javamockito;

import java.util.Objects;

public class Transacao {
    private String id;
    private int valor;
    private String pagador;
    private int valorPago;

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public Transacao(String id, int valor){
        this.id = id;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public int getValor() {
        return valor;
    }

    public String getPagador() {
        return pagador;
    }

    public int getValorPago() {
        return valorPago;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return valor == transacao.valor && Objects.equals(id, transacao.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valor);
    }
}
