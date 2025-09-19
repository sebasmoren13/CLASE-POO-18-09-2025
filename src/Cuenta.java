import java.util.Scanner;

public class Cuenta {

    Scanner teclado= new Scanner(System.in);
    //ATRIBIUTOS CLASES

    private int numero;
    private int cedula;
    private double saldo;

    // CONSTRUCTOR VACIO


    public Cuenta() {
    }

    //CONSTRUCTORES CON TODOS LOS PARAMETROS

    public Cuenta(int numero, int cedula, double saldo) {
        this.numero = numero;
        this.cedula = cedula;
        this.saldo = saldo;
    }

    //GETTER AND SETTER

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //METODO TOSTRING


    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", cedula=" + cedula +
                ", saldo=" + saldo +
                '}';
    }

    //METODO INGRESAR

    public String ingresarDinero(double t) {



        System.out.println("Ingresar dinero");
        saldo= teclado.nextDouble();
        System.out.println("Su saldo es de " +saldo);
        return null;
    }
}
