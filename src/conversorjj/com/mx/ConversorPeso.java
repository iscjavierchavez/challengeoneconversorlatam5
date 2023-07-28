package conversorjj.com.mx;

import javax.swing.JOptionPane;

public class ConversorPeso {

	public void converitMasa(double input) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Kilos a Onzas", "Kilos a Libras", "Onzas a Kilos", "Libras a kilos"}, "Seleccion")).toString();
        switch(opcion) {
        case "Kilos a Onzas":
        	convertirKilosOnzas(input);
        	break;
        case "Kilos a Libras":
        	convertirKilosLibras(input);
            break;
        case "Onzas a Kilos":
        	convertirOnzasKilos(input);
           break;
        case "Libras a kilos":
        	ConvertirLibrasKilos(input);
           break;
        }
	}
	
	private void convertirKilosOnzas(double valor) {
		double onzas = valor / 0.0283495;
		onzas = (double) Math.round(onzas*100d)/100;
        JOptionPane.showMessageDialog(null,onzas+ " Onzas");
	}
	
	private void convertirKilosLibras(double valor){
		double libras = valor / 0.453592;
		libras = (double) Math.round(libras *100d)/100;
        JOptionPane.showMessageDialog(null,libras+ " Libras");
	}
	
	private void convertirOnzasKilos(double valor) {
		double kilos = valor  * 0.0283495;
		kilos = (double) Math.round(kilos *100d)/100;
        JOptionPane.showMessageDialog(null,kilos+ " Kilos");
	}
	
	private void ConvertirLibrasKilos(double valor) {
		double kilos = valor  * 0.453592;
		kilos = (double) Math.round(kilos*100d)/100;
        JOptionPane.showMessageDialog(null,kilos+ " Kilos");
	}
}
