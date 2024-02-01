package javamockito;

import java.util.*;

public class Pix {
    private static List<Transacao> transacoes = new ArrayList<>();
    public Transacao gerarPIX(int valor){
        Transacao transacao = new Transacao(UUID.randomUUID().toString(), valor);
        transacoes.add(transacao);
        return transacao;
    }
    public Transacao consultarTransacao(String id){
        Transacao transacao = transacoes.stream()
                .filter((t)-> Objects.equals(t.getId(), id))
                .toList()
                .getFirst();
        return transacao;
    }
}
