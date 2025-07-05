public class Empresa {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Julisa Merino", 800.00);
        System.out.println(emp1.getNombre() + " gana $" + emp1.calcularSalario());

        Gerente gerente1 = new Gerente("Jehimy Chacama ", 1000.00, 300.00);
        System.out.println(gerente1.getNombre() + " gana $" + gerente1.calcularSalario());
    }
}