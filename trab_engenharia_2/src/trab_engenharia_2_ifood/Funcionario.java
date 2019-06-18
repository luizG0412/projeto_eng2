package trab_engenharia_2_ifood;

public class Funcionario {
	String nomeFun;
	int rg;
	String Cpf;
	int numero;
	int idade;
	private Cliente Pedinte;
	
	public Funcionario() {
		
	}
	
				
		
	
	
	public void confirmarPedido() {
		System.out.println("seu Pedido será prepado agora!");
		
		System.out.println("----------------------------------------------------------");
		
		Cozinheiro coz = new Cozinheiro();
		coz.prepararPedido();
	}
	public void reenbolçarCancelamento(int n) {
		switch (n) {
		case 1:
			 Pedinte.setSaldo(Pedinte.getSaldo() + 21);
			 break;
		case 2:
			Pedinte.setSaldo(Pedinte.getSaldo() + 10);
			break;
		case 3:
			Pedinte.setSaldo(Pedinte.getSaldo() + 13);
			break;
		case 4:
			Pedinte.setSaldo(Pedinte.getSaldo() + 70);
			break;
		case 5:
			Pedinte.setSaldo(Pedinte.getSaldo() + 17);
			break;
		case 6:
			Pedinte.setSaldo(Pedinte.getSaldo() + 32);
			break;
		}
		
	}
	
	public void saldoOriginal() {
		
	}
	public Cliente getPedinte() {
		return Pedinte;
	}
	public void setPedinte(Cliente pedinte) {
		Pedinte = pedinte;
	}
}
