package conversorjj.com.mx;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ConversorMoneda monedas= new ConversorMoneda();
		ConversorTemperatura temperatura= new ConversorTemperatura();
		ConversorPeso masa= new ConversorPeso();
		boolean repetir=true;
		
		try {
			while(repetir==true) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Masa"}, "Seleccion")).toString();
			switch(opciones)
			{
				case "Conversor de Moneda":
					String input = JOptionPane.showInputDialog("Ingresa la cantidad a convertir: ");
					if(ValidarNumero(input)) 
					{
	                    double valor = Double.parseDouble(input);
	                    monedas.convertirMonedas(valor);
	
	                    int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
	                    if (JOptionPane.OK_OPTION == respuesta){
	                    	System.out.println("Selecciona opción Afirmativa");
	                    }else{
	                       	JOptionPane.showMessageDialog(null, "Programa terminado");   
	                       	repetir=false;    
	                    }
	
	                } else {
	                    JOptionPane.showMessageDialog(null, "Favor de ingresar valor numerico");                
	                }
	                break;
	                
				case "Conversor de Temperatura":
		        	 input = JOptionPane.showInputDialog("Ingresa el valor a convertir ");
		             if(ValidarNumero(input) == true) {
		                 double valor = Double.parseDouble(input);
		                 temperatura.ConvertirTemperatura(valor);
	
		                 int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
		                    if (JOptionPane.OK_OPTION == respuesta){
		                    	System.out.println("Selecciona opción Afirmativa");
		                    }else{
		                       	JOptionPane.showMessageDialog(null, "Programa terminado");   
		                       	repetir=false;   
		                    }
		
		                } else {
		                    JOptionPane.showMessageDialog(null, "Favor de ingresar valor numerico");                
		                }
		             break;
		             
				case "Conversor de Masa":
		        	 input = JOptionPane.showInputDialog("Ingresa el valor a convertir ");
		             if(ValidarNumero(input) == true) {
		                 double valor = Double.parseDouble(input);
		                 masa.converitMasa(valor);
	
		                 int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
		                    if (JOptionPane.OK_OPTION == respuesta){
		                    	System.out.println("Selecciona opción Afirmativa");
		                    }else{
		                       	JOptionPane.showMessageDialog(null, "Programa terminado");   
		                       	repetir=false;   
		                    }
		
		                } else {
		                    JOptionPane.showMessageDialog(null, "Favor de ingresar valor numerico");                
		                }
		             break;
				}
			}
		}
		catch( NullPointerException ex)
		{			
		}

	}
	
	public static boolean ValidarNumero(String input) {
		try {
            double x = Double.parseDouble(input);
            if(x >0 || x < 0)
                return true;
            else
            	return false;
            } catch (NumberFormatException e) {
                return false;
        }
    }

}