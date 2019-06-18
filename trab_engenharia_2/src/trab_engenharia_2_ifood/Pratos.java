package trab_engenharia_2_ifood;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Pratos extends Observable implements Menu {
	
	
	
	private int numPrato;
	String ingredientes;
	int quantidade;
	private float pre�o;
	public Pratos(int numPrato,float pre�o) {
		this.numPrato = numPrato;
		this.pre�o = pre�o;
	}
	
private List<Observer> mudan�aCardapio = new ArrayList<>();
	
	public void adicionaReceita(String novaReceita) {
        notifyObservers(novaReceita);
}
	public void notifyObservers(String novaReceita) {
        for (Observer observer : this.mudan�aCardapio) {
                 observer.update(this, novaReceita);
        }
	}
	public void registrar(Observer observer) {
		mudan�aCardapio.add(observer);
}


public void setNumPrato(int n) {
	this.numPrato = n;
}
public int getNumPrato() {
	return this.numPrato;
 }
public void setPre�o(float p) {
	this.pre�o = p;
}
public float getPre�o() {
	return this.pre�o;
}
}