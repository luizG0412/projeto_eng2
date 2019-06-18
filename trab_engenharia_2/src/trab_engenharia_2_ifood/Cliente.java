package trab_engenharia_2_ifood;

public class Cliente {
	int id;
	String nome;
	int idade;
	int Numero;
	String Endereço;
	private float saldo;
	
	Pedidos pedi = new Pedidos();
	boolean verificador = false; 
	
	public Cliente(String nome, float saldo) {
		this.nome = nome;
		this.saldo = saldo;
		
	}
	
	public void fazerPedido(Pratos p,Cliente c) {
		pedi.validarSaldo(p, c);
		if (this.verificador= false) {
			System.out.println("Olá " + this.nome + ", seja bem vindo a nosso apricativo.");
			System.out.println("Casso queria ver os pratos do dia 'abriMenu()'");
			System.out.println("Casso queira fazer seu pedido 'fazerPedido('numero do prato')'");
			System.out.println("para cancelar um pedido 'cancelarPedido('numero do prato')'");
			System.out.println("----------------------------------------------------------");
			this.verificador = true;
		pedi.validarSaldo(p, c);
		}
		
		}
		
	
	public void abrirMenu() {
		System.out.println("   PRATOS   ");
		System.out.println("p1.Hanburguer-R$21");
		System.out.println("p2.Pastel-R$10");
		System.out.println("p3.A la minuta-R$13");
		System.out.println("p4.suchi-R$70(porção)");
		System.out.println("p5.Cachorro-Quente-R$17");
		System.out.println("p6.Pizza-R$32");
		System.out.println("para fazer um pedido 'fazerPedido(numero do prato)'");
		System.out.println("----------------------------------------------------------");
	}
	
	public void cancelarPedido(Pratos p, Cliente c) {
		System.out.println("Seu pedido esta sendo cancelado, o valor do pedido será reembolçado");
		System.out.println("----------------------------------------------------------");
		pedi.reajustaSaldo(p, c);
		
		}
	
	
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public float getSaldo() {
		return this.saldo;
	}


}
