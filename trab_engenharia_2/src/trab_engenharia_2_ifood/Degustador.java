package trab_engenharia_2_ifood;

import java.util.Observable;
import java.util.Observer;

public class Degustador implements Observer {
	@Override
    public void update(Observable prato, Object novaReceita) {
              if (prato instanceof Menu) {
                       System.out.println((String)novaReceita);
              }
    }
}
