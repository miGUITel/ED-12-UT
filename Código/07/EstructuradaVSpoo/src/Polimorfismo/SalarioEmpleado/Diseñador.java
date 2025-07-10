package Polimorfismo.SalarioEmpleado;

class Diseñador extends Empleado {
    private double horasExtra;

    public Diseñador(String nombre, double salarioBase, double horasExtra) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
    }

    // Sobreescritura del método para calcular el salario
    @Override
    public double calcularSalario() {
        // El salario del diseñador incluye el pago por horas extra
        return getSalarioBase() + (horasExtra * 10); // Supongamos que cada hora extra se paga a $10
    }
}