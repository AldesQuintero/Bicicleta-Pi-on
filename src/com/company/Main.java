package Bici;
import javax.swing.JOptionPane;
public class Main {
    public static void main (String[] args) {
        int velocidad=Integer.parseInt(JOptionPane.showInputDialog(null, ""
                + "Ingrese la velocidad actual de mi bicicleta"));
        int plato=Integer.parseInt(JOptionPane.showInputDialog(null, ""
                + "Ingrese el plato actual de mi bicicleta"));
        int piñon=Integer.parseInt(JOptionPane.showInputDialog(null, ""
                + "Ingrese el piñon actual de mi bicicleta"));

        Bicicleta mibicicleta = new Bicicleta(velocidad, plato, piñon);
        mibicicleta.acelerar();
        mibicicleta.frenar();
        mibicicleta.Cambiarpiñon();
        mibicicleta.Cambiarplato();


        int velocidad2=Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                "Ingrese la velocidad actual de mi bicicleta"));
        int plato2=Integer.parseInt(JOptionPane.showInputDialog(null, ""
                +"Ingrese el plato actual de mi bicicleta"));
        int piñon2=Integer.parseInt(JOptionPane.showInputDialog(null, ""
                + "Ingrese el piñon actual de mi bicicleta"));

        Bicicleta tubicicleta = new Bicicleta(velocidad2, plato2, piñon2);
        tubicicleta.acelerar2();
        tubicicleta.frenar2();
        tubicicleta.Cambiarplato2();
        tubicicleta.Cambiarpiñon2();

    }
}

