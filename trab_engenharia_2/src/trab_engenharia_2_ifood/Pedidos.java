package trab_engenharia_2_ifood;

public class Pedidos {
	
	
	public int id;
	private Funcionario atende;
	private Cliente pedinte;
	private Pratos refeiçao;
	
	
	
	public void validarSaldo(Pratos p, Cliente c) {
		
		Funcionario f = new Funcionario();
		
		
		switch (p.getNumPrato()) {
		case 1:
				if (c.getSaldo() > p.getPreço()) {
					System.out.println("Saldo Validado!");
					System.out.println("--------------------------------");
					c.setSaldo(c.getSaldo() - p.getPreço());
					System.out.println("Seu Pedido foi confirmado");
					System.out.println("seu saldo agora é :" + c.getSaldo());
					this.id = this.id++;
					f.confirmarPedido();}
					break;
		case 2:
					if (c.getSaldo()  > p.getPreço()) {
						System.out.println("Saldo Validado!");
						System.out.println("--------------------------------");
						c.setSaldo(c.getSaldo() - p.getPreço());
						System.out.println("Seu Pedido foi confirmado");
						System.out.println("seu saldo agora é :" + c.getSaldo());
						this.id++;
						f.confirmarPedido();}
					break;
		case 3:					
			
				   if (c.getSaldo()  > p.getPreço()) {
						System.out.println("Saldo Validado!");
						System.out.println("--------------------------------");
						c.setSaldo(c.getSaldo() - p.getPreço());
						System.out.println("Seu Pedido foi confirmado");
						System.out.println("seu saldo agora é :" + c.getSaldo());
						this.id++;
						f.confirmarPedido();}
					
						break;
		case 4:						
			
					if (c.getSaldo()  > p.getPreço()) {
						System.out.println("Saldo Validado!");
						System.out.println("--------------------------------");
						c.setSaldo(c.getSaldo() - p.getPreço());
						System.out.println("Seu Pedido foi confirmado");
						System.out.println("seu saldo agora é :" + c.getSaldo());
						this.id++;
						f.confirmarPedido();}
						break;
		case 5:						   
			
				if (c.getSaldo()  > p.getPreço()) {
					System.out.println("Saldo Validado!");
					System.out.println("--------------------------------");
					c.setSaldo(c.getSaldo() - p.getPreço());
					System.out.println("Seu Pedido foi confirmado");
					System.out.println("seu saldo agora é :" + c.getSaldo());
					this.id++;
					f.confirmarPedido();}
				break;
		case 6:							 
			
					if (c.getSaldo()  > p.getPreço()) {
						System.out.println("Saldo Validado!");
						System.out.println("--------------------------------");
						c.setSaldo(c.getSaldo() - p.getPreço());
						System.out.println("Seu Pedido foi confirmado");
						System.out.println("seu saldo agora é :" + c.getSaldo());
						this.id++;
						f.confirmarPedido();}
					break;
		default :
			System.out.println("valor invalido, veja os opções no menu 'abrirMenu()'");
	     }	
						
			
	}		
		     
		
								
						
					
						
					
					
						
				
					
					
		
			
				
				
			
				
		
	
	
	
	
	public void reajustaSaldo(Pratos p, Cliente c) {
		
		
		
		switch (p.getNumPrato()) {
			case 1:
				c.setSaldo(c.getSaldo() + p.getPreço());
				System.out.println("seu pedido foi reçarcido");
				System.out.println("É uma pena que tenha cancelado :(");
				break;
			case 2:
				c.setSaldo(c.getSaldo() + p.getPreço());
				System.out.println("seu pedido foi reçarcido");
				System.out.println("É uma pena que tenha cancelado :(");
				break;
			case 3:
				c.setSaldo(c.getSaldo() + p.getPreço());
				System.out.println("seu pedido foi reçarcido");
				System.out.println("É uma pena que tenha cancelado :(");
				break;
			case 4:
				c.setSaldo(c.getSaldo() + p.getPreço());
				System.out.println("seu pedido foi reçarcido");
				System.out.println("É uma pena que tenha cancelado :(");
				break;
			case 5:
				c.setSaldo(c.getSaldo() + p.getPreço());
				System.out.println("seu pedido foi reçarcido");
				System.out.println("É uma pena que tenha cancelado :(");
				break;
			case 6:
				c.setSaldo(c.getSaldo() + p.getPreço());
				System.out.println("seu pedido foi reçarcido");
				System.out.println("É uma pena que tenha cancelado :(");
				break;
		  
		   default :
			System.out.println("Você não fez nenhem pedido ainda, para pedido 'fazerPedido(numero do pedido)'");
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
	
	public Pratos getRefeiçao() {
		return refeiçao;
	}
	public void setRefeiçao(Pratos refeiçao) {
		this.refeiçao = refeiçao;
	}



	public Cliente getPedinte() {
		return pedinte;
	}



	public void setPedinte(Cliente pedinte) {
		this.pedinte = pedinte;
	}
}
