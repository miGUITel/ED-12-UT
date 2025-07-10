package Polimorfismo.SalarioEmpleado;

class Desarrollador extends Empleado {
    private double bono;

    public Desarrollador(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Sobreescritura del método para calcular el salario
    @Override
    public double calcularSalario() {
        // El salario del desarrollador incluye el bono
        return getSalarioBase() + bono;
    }
}