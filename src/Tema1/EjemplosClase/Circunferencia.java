//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Circunferencia{
    public static void main(String[] args) {

        int radio = 0;
        double circunferencia = 0;
        double longitud = 0;

        radio = 10;

        circunferencia = Math.PI * radio * radio;
        longitud = 2 * Math.PI * radio;

        System.out.println("Área= " + circunferencia);
        System.out.println("Longitud= " + longitud);

        }
    }
