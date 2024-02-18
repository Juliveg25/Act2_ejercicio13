import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<EmpleadosLaGenerosaSas> empleados = new ArrayList<>();
        empleados.add(new EmpleadosLaGenerosaSas(800000, 0.10));
        empleados.add(new EmpleadosLaGenerosaSas(1200000, 0.08));
        empleados.add(new EmpleadosLaGenerosaSas(1300000, 0.05));

        for (EmpleadosLaGenerosaSas empleado : empleados) {
            double valorAumento = empleado.valorAumento(empleado.getSalario(), empleado.getIncremento());
            empleado.calcularNuevoSalario(valorAumento, empleado.getSalario());
        }
    }
}