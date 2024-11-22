package taller6.ejercicio1;


public class Gerente extends Empleado {
    protected String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario + ", Departamento: " + departamento);
    }
}