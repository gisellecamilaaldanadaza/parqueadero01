import javax.swing.*;

public class parqueadero {
    public static void main (String [] args ){        String nombre;
        String placa;        double hora_entrada,salida;
        double multiplicacion,resta;        double valor,dato = 1;

        JOptionPane.showMessageDialog(null,"bienvenido al parqueadero" + "\n" +                "el costo por hora del carro es: 2000" + "\n" + "y el de la moto es : 1000");
        nombre = JOptionPane.showInputDialog(null,"POR FAVOR USUARIO ingrese el nombre");
        placa = JOptionPane.showInputDialog( null, " por favor usuario ingrese la placa");        hora_entrada =Double.parseDouble( JOptionPane.showInputDialog(null, "por favor ingrese hora entrada "));
        salida =Double.parseDouble( JOptionPane.showInputDialog( " por favor usuario ingrese la hora de salida"));       resta = salida - hora_entrada;
        JOptionPane.showMessageDialog(null,"su nombre es:" + nombre + "\n" +
                "el nombre de placa es: " + placa +  "\n " + "la hora de entrada es:"+ hora_entrada + "\n" +               "la hora en que salio es:" + salida);
        valor = Double.parseDouble(JOptionPane.showInputDialog("por favor usuario si es carro numero 1 y si no es escriba 2 si es moto"));       /*
   if (dato == valor);    multiplicacion = Math.ceil(resta)*valor*2000;
    else {        multiplicacion = Math.ceil(resta)*valor*1000;
    }    JOptionPane.showMessageDialog(null, " el valor que ingreso no es valido");
    */        switch ((int)valor) {
            case 1: multiplicacion =Math.ceil(resta)*valor*2000;            JOptionPane.showMessageDialog(null,"señor usuario cuanto debe pagar:" + multiplicacion);
            case 2:                multiplicacion = Math.ceil(resta)*valor*1000;
                JOptionPane.showMessageDialog( null," señor usuario cuanto debe pagar:" + multiplicacion);
                JOptionPane.showMessageDialog(null,"señor usuario su valor no es valido " );        }
    }}

}