package conversorjj.com.mx;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void ConvertirTemperatura(double input) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celcius a Grados Farenheit":
        	ConvertirCelciusAFarenheit(input);
        	break;
        case "Grados Celcius a Kelvin":
            ConvertirCelciusAKelvin(input);
            break;
        case "Grados Farenheit a Grados Celcius":
           ConvertirFarenheitACelcius(input);
           break;
        case "Kelvin a Grados Celcius":
           ConvertirKelvinACelcius(input);
           break;
        case "Kelvin a Grados Farenheit":
        	ConvertirKelvinAFarenheit(input);
        	break;
        }
	}
	
	private double ConvertirCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null,farenheit+ " Grados Farenheit ");
		return farenheit;
	}
	
	private void ConvertirCelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null,kelvin+ " Kelvin");
	}
	
	private void ConvertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null,celcius+ " Celcius");
	}
	
	private double ConvertirKelvinACelcius(double valor) {
		 double kelvinCelcius = valor - 273.15;
         kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
         JOptionPane.showMessageDialog(null, kelvinCelcius+ " Celcius");
         return kelvinCelcius;
	}
	
	private void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = ConvertirKelvinACelcius(valor);
		kelvinFarenheit = ConvertirCelciusAFarenheit(kelvinFarenheit);
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null,kelvinFarenheit+ " Celcius");
	}
}
