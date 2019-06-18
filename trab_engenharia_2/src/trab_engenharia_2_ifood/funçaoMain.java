package trab_engenharia_2_ifood;

public class funçaoMain {

	public static void main(String[] args) {
		Cliente c[] = new Cliente[6];
		
		c[0] = new Cliente("luiz", 300);
		c[1] = new Cliente("maria", 70);
		c[2] = new Cliente("lucia", 100);
		c[3] = new Cliente("carlos", 180);
		Pratos p[] = new Pratos [7];
		 p[1] = new Pratos(1, 21);
		 p[2] = new Pratos(2, 10);
		 p[3] = new Pratos(3, 13);
		 p[4] = new Pratos(4, 70);
		 p[5] = new Pratos(5, 17);
		 p[6] = new Pratos(6, 32);
		c[0].abrirMenu();
		c[0].fazerPedido(p[2], c[0]);
		c[0].cancelarPedido(p[2], c[0]);
		c[0].fazerPedido(p[2], c[0]);
		
		
	}

}
