package trab_engenharia_2_ifood;

public class Pedidos {
	
	
	public int id;
	private Funcionario atende;
	private Cliente pedinte;
	private Pratos refei�ao;
	
	
	
	public void validarSaldo(Pratos p, Cliente c) {
		
		Funcionario f = new Funcionario();
		
		
		switch (p.getNumPrato()) {
		case 1:
				if (c.getSaldo() > p.getPre�o()) {
					System.out.println("Saldo Validado!");
					System.out.println("--------------------------------");
					c.setSaldo(c.getSaldo() - p.getPre�o());
					System.out.println("Seu Pedido foi confirmado");
					System.out.println("seu saldo agora � :" + c.getSaldo());
					this.id = this.id++;
					f.confirmarPedido();}
					break;
		case 2:
					if (c.getSaldo()  > p.getPre�o()) {
						System.out.println("Saldo Validado!");
						System.out.println("--------------------------------");
						c.setSaldo(c.getSaldo() - p.getPre�o());
						System.out.println("Seu Pedido foi confirmado");
						System.out.println("seu saldo agora � :" + c.getSaldo());
						this.id++;
						f.confirmarPedido();}
					break;
		case 3:					
			
				   if (c.getSaldo()  > p.getPre�o()) {
						System.out.println("Saldo Validado!");
						System.out.println("--------------------------------");
						c.setSaldo(c.getSaldo() - p.getPre�o());
						System.out.println("Seu Pedido foi confirmado");
						System.out.println("seu saldo agora � :" + c.getSaldo());
						this.id++;
						f.confirmarPedido();}
					
						break;
		case 4:						
			
					if (c.getSaldo()  > p.getPre�o()) {
						System.out.println("Saldo Validado!");
						System.out.println("--------------------------------");
						c.setSaldo(c.getSaldo() - p.getPre�o());
						System.out.println("Seu Pedido foi confirmado");
						System.out.println("seu saldo agora � :" + c.getSaldo());
						this.id++;
						f.confirmarPedido();}
						break;
		case 5:						   
			
				if (c.getSaldo()  > p.getPre�o()) {
					System.out.println("Saldo Validado!");
					System.out.println("--------------------------------");
					c.setSaldo(c.getSaldo() - p.getPre�o());
					System.out.println("Seu Pedido foi confirmado");
					System.out.println("seu saldo agora � :" + c.getSaldo());
					this.id++;
					f.confirmarPedido();}
				break;
		case 6:							 
			
					if (c.getSaldo()  > p.getPre�o()) {
						System.out.println("Saldo Validado!");
						System.out.println("--------------------------------");
						c.setSaldo(c.getSaldo() - p.getPre�o());
						System.out.println("Seu Pedido foi confirmado");
						System.out.println("seu saldo agora � :" + c.getSaldo());
						this.id++;
						f.confirmarPedido();}
					break;
		default :
			System.out.println("valor invalido, veja os op��es no menu 'abrirMenu()'");
	     }	
						
			
	}		
		     
		
								
						
					
						
					
					
						
				
					
					
		
			
				
				
			
				
		
	
	
	
	
	public void reajustaSaldo(Pratos p, Cliente c) {
		
		
		
		switch (p.getNumPrato()) {
			case 1:
				c.setSaldo(c.getSaldo() + p.getPre�o());
				System.out.println("seu pedido foi re�arcido");
				System.out.println("� uma pena que tenha cancelado :(");
				break;
			case 2:
				c.setSaldo(c.getSaldo() + p.getPre�o());
				System.out.println("seu pedido foi re�arcido");
				System.out.println("� uma pena que tenha cancelado :(");
				break;
			case 3:
				c.setSaldo(c.getSaldo() + p.getPre�o());
				System.out.println("seu pedido foi re�arcido");
				System.out.println("� uma pena que tenha cancelado :(");
				break;
			case 4:
				c.setSaldo(c.getSaldo() + p.getPre�o());
				System.out.println("seu pedido foi re�arcido");
				System.out.println("� uma pena que tenha cancelado :(");
				break;
			case 5:
				c.setSaldo(c.getSaldo() + p.getPre�o());
				System.out.println("seu pedido foi re�arcido");
				System.out.println("� uma pena que tenha cancelado :(");
				break;
			case 6:
				c.setSaldo(c.getSaldo() + p.getPre�o());
				System.out.println("seu pedido foi re�arcido");
				System.out.println("� uma pena que tenha cancelado :(");
				break;
		  
		   default :
			System.out.println("Voc� n�o fez nenhem pedido ainda, para pedido 'fazerPedido(numero do pedido)'");
			break;
		}
		
		this.id = 0;
	
	
}	
	/*-------------------------------------*/
	
	
	public Funcionario getAntende() {
		return atende;
	}
	public void setAntende(Funcionario antende) {
		this.atende = antende;
	}
	
	public Pratos getRefei�ao() {
		return refei�ao;
	}
	public void setRefei�ao(Pratos refei�ao) {
		this.refei�ao = refei�ao;
	}



	public Cliente getPedinte() {
		return pedinte;
	}



	public void setPedinte(Cliente pedinte) {
		this.pedinte = pedinte;
	}
}
