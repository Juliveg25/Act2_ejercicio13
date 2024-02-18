public class EmpleadosLaGenerosaSas {
    private int salario;
    private double incremento;

    public int getSalario() {
        return salario;
    }

    public double getIncremento() {
        return incremento;
    }

    public EmpleadosLaGenerosaSas(int salario, double incremento) {
        this.salario = salario;
        this.incremento = incremento;
    }

    //retorna valor del aumento
    public double valorAumento(int salarioDevengado, double incremento){
        return salarioDevengado * incremento;
    }

    //utiliza el valor del return del metodo valorAumento() para calcular el nuevo salario y lo imprime
    public void calcularNuevoSalario(double valorAumento, int salarioEmpleado) {
        double nuevoSalario = valorAumento + salarioEmpleado;
        System.out.println("El nuevo salario es: $" + nuevoSalario);
    }
}
