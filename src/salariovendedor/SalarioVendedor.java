package salariovendedor;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author David Campoverde
 */
public class SalarioVendedor {

    public static void main(String[] args) {
        DecimalFormat dosDecimales = new DecimalFormat("#.00");
        
        final int salario = 1000;
        final int comisionPorCarro = 150;
        int carrosVendidos;
        float precioCarroVendido, comisionCincoPorc = 0, salarioTotal, aux, comisionPorNumCarros;
        String vendedor;
        
        vendedor = JOptionPane.showInputDialog("Vendedor");
        carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Carros vendidos"));
        comisionPorNumCarros = comisionPorCarro * (float)carrosVendidos;
        
        for(int i = 1; i <= carrosVendidos; i++){
            precioCarroVendido = Float.parseFloat(JOptionPane.showInputDialog("Precio Carro "+i+": "));
            aux = precioCarroVendido*0.05f;
            comisionCincoPorc = comisionCincoPorc + aux;
        }
        
        salarioTotal = salario+comisionPorNumCarros+comisionCincoPorc;
        JOptionPane.showMessageDialog(null, "Vendedor: "+vendedor+"\n\nCarros vendidos: "+carrosVendidos+"\nComisión total: $"+comisionPorNumCarros+"\nComisión 5% total: $"+
                dosDecimales.format(comisionCincoPorc)+"\nSalario total: $"+dosDecimales.format(salarioTotal));
        
    }
    
}
