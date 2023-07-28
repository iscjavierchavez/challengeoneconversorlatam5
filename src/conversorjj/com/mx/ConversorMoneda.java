package conversorjj.com.mx;

import javax.swing.JOptionPane;

public class ConversorMoneda {
		
    public void convertirMonedas(double input) {
    	double tipoCambio=0;
    	String moneda="Pesos MXN";
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
    	
        switch(opcion) {
        case "De Pesos a Dólar":
        	tipoCambio=16.86;
        	moneda="Dólar";
        	convertir(input,tipoCambio,moneda);
        	break;
        case "De Pesos a Euro":
        	tipoCambio=18.51;
        	moneda="Euro";
        	convertir(input,tipoCambio,moneda);
        	break;
        case "De Pesos a Libras":
        	tipoCambio=21.57;
        	moneda="Libras";
        	convertir(input,tipoCambio,moneda);
        	break;
        case "De Pesos a Yen":
        	tipoCambio=0.12;
        	moneda="Yen";
        	convertir(input,tipoCambio,moneda);
        	break;
        case "De Pesos a Won Coreano":
        	tipoCambio=0.013;
        	moneda="Won Coreano";
        	convertir(input,tipoCambio,moneda);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	tipoCambio=16.86;
        	convertirPesos(input,tipoCambio,moneda);
        	break;
        case "De Euro a Pesos":
        	tipoCambio=18.51;
        	convertirPesos(input,tipoCambio,moneda);
        	break;
        case "De Libras a Pesos":
        	tipoCambio=21.57;
        	convertirPesos(input,tipoCambio,moneda);
        	break;
        case "De Yen a Pesos":
        	tipoCambio=0.12;
        	convertirPesos(input,tipoCambio,moneda);
        	break;
        case "De Won Coreano a Pesos":
        	tipoCambio=0.013;
        	convertirPesos(input,tipoCambio,moneda);
            break;
        }      
    }

    private void convertir(double valor, double tipoCambio, String moneda) {
		double resultado = valor / tipoCambio;
		resultado = (double) Math.round(resultado *100d)/100;
        JOptionPane.showMessageDialog(null, "$ " +resultado+ " "+moneda);
	}
    
    private void convertirPesos(double valor, double tipoCambio, String moneda ) {
		double resultado = valor * tipoCambio;
		resultado = (double) Math.round(resultado *100d)/100;
        JOptionPane.showMessageDialog(null, " $ " +resultado+ " "+moneda);
	}
    
}
