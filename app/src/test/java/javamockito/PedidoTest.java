package javamockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PedidoTest {
    @Test
    void test1(){
        Pedido pedidoMock = mock(Pedido.class);

        pedidoMock.setCliente("Vinicius");
        pedidoMock.setNumero(1);
        pedidoMock.setValor(15);

        verify(pedidoMock).setCliente("Vinicius");
        verify(pedidoMock).setNumero(1);
        verify(pedidoMock).setValor(15);
    }

    @Test
    void test2(){
        Pedido pedidoMock = mock(Pedido.class);
        when(pedidoMock.gerarPix()).thenReturn(new Transacao("1",19));
        assertEquals(19,pedidoMock.gerarPix().getValor());
    }

}
