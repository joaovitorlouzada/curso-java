package aplicacao;

import java.util.Date;

import entidades.Pedido;
import entidades.enums.StatusDoPedido;

public class Programa {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1080, new Date(), StatusDoPedido.ENVIADO);
		System.out.println(pedido);
		
		StatusDoPedido os1 = StatusDoPedido.ENTREGUE;
		
		StatusDoPedido os2 = StatusDoPedido.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);


	}

}
