package trab_engenharia_2_ifood;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Pratos extends Observable implements Menu {
	
	
	
	private int numPrato;
	String ingredientes;
	int quantidade;
	private float preço;
	public Pratos(int numPrato,float preço) {
		this.numPrato = numPrato;
		this.preço = preço;
	}
	
private List<Observer> mudançaCardapio = new ArrayList<>();
	
	public void adicionaReceita(String novaReceita) {
        notifyObservers(novaReceita);
}
	public void notifyObservers(String novaReceita) {
        for (Observer observer : this.mudançaCardapio) {
                 observer.update(this, novaReceita);
        }
	}
	public void registrar(Observer observer) {
		mudançaCardapio.add(observer);
}


public void setNumPrato(int n) {
	this.numPrato = n;
}
public int getNumPrato() {
	return this.numPrato;
 }
public void setPreço(float p) {
	this.preço = p;
}
public float getPreço() {
	return this.preço;
}
}