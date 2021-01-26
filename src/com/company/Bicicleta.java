package Bici;

import javax.swing.JOptionPane;

public class Bicicleta {
    //Atributos
    int velocidadActual;
    int platoActual;
    int piñonActual;
    //Constructor
    public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
        this.velocidadActual=velocidadActual;
        this.platoActual=platoActual;
        this.piñonActual=piñonActual;
    }
    //Metodos

    public void acelerar() {
        System.out.print("La velocidad actual de mi bicicleta "
                + "es: "+velocidadActual+"Km/h\n");
        velocidadActual=(velocidadActual*2);
        System.out.print("La velocidad de la "
                +"bicicleta si aceleras será de: "+velocidadActual+"Km/h\n");
    }
    public void frenar(){
        int freno = velocidadActual/4;
        System.out.print("La velocidad de mi bicicleta al momento de frenar será: "
                + "de: "+freno+"Km/h\n");
    }
    public void Cambiarplato(int plato){

        System.out.print("El plato actual de mi bicicleta es: "+platoActual+"\n");
        platoActual=Integer.parseInt(JOptionPane.showInputDialog(null, "¿A"
                + "que número de plato desea cambiar?\n"));
        System.out.print("El plato actual de mi bicicleta es: "+platoActual+"\n");
    }
    public void Cambiarplato(){
        platoActual=1;
        System.out.print("El plato actual de la bicicleta es: "+platoActual+"\n");
    }
    public void Cambiarpiñon (int piñon){

        System.out.print("El piñon actual de mi bicicleta es: "+piñonActual+"\n");
        piñonActual=Integer.parseInt(JOptionPane.showInputDialog(null, "¿A"
                + "qué número de piñon desea cambiar?\n"));
        System.out.print("El piñon actual de mi bicicleta es: "+piñonActual+"\n");
    }
    public void Cambiarpiñon(){
        piñonActual=1;
        System.out.print("El plato actual de la bicicleta es: "+piñonActual+"\n");
    }
    //Metodos2
    public void acelerar2() {
        System.out.print("La velocidad actual de tu bicicleta "
                + "es: "+velocidadActual+"Km/h\n");
        velocidadActual=(velocidadActual*2);
        System.out.print("La velocidad de la "
                +"bicicleta si aceleras será de: "+velocidadActual+"Km/h\n");
    }
    public void frenar2(){
        int freno = velocidadActual/4;
        System.out.print("La velocidad de tu bicicleta al momento de frenar será "
                + "de: "+freno+"Km/h\n");
    }
    public void Cambiarplato2(int plato2){

        System.out.print("El plato actual de tu bicicleta es: "+platoActual+"\n");
        platoActual=Integer.parseInt(JOptionPane.showInputDialog(null, "¿A"
                + "que número de plato desea cambiar?\n"));
        System.out.print("El plato actual de mi bicicleta es: "+platoActual+"\n");
    }
    public void Cambiarplato2(){
        platoActual=1;
        System.out.print("El plato actual de la bicicleta es: "+platoActual);
    }
    public void Cambiarpiñon2 (int piñon2){

        System.out.print("El piñon actual de tu bicicleta es: "+piñonActual+"\n");
        piñonActual=Integer.parseInt(JOptionPane.showInputDialog(null, "¿A"
                + "qué número de piñon desea cambiar?\n"));
        System.out.print("El piñon actual de tu bicicleta es: "+piñonActual+"\n");
    }
    public void Cambiarpiñon2(){
        piñonActual=1;
        System.out.print("\nEl piñon actual de la bicicleta es: "+piñonActual+"\n");
    }

}
