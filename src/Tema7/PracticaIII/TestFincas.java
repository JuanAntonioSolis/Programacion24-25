package Tema7.PracticaIII;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestFincas {

    public static void main(String[] args) {

        DAOLectura daoL = new DAOLectura();
        DAOFinca daoF = new DAOFinca();

        System.out.println("==============================");
        System.out.println("FINCAS POR SUPERFICIE");
        daoF.getFincasPorSuperficie().forEach(System.out::println);

        System.out.println("==============================");
        System.out.println("3 FINCAS MÁS GRANDES");
        daoF.getMasGrandes().forEach(System.out::println);

        System.out.println("==============================");
        System.out.println("FINCAS POR CIUDAD");
        daoF.getFincasPorCiudad().forEach((k,v) -> System.out.println(k+" - "+v));

        System.out.println("==============================");
        System.out.println("FINCAS CON SUPERFICIE ENTRE 50 Y 150 METROS");
        daoF.getFincasMedio().forEach(System.out::println);

        System.out.println("==============================");
        System.out.println("LECTURAS AGRUPADAS POR FINCA");
        daoL.getLecturasPorFinca().forEach((k,v) -> System.out.println(k+" - "+v));

        System.out.println("==============================");
        System.out.println("TEMPERATURA MÁXIMA REGISTRADA DE UNA FINCA");
        System.out.println(daoL.getTempMaximaFinca(1));

        System.out.println("==============================");
        System.out.println("TEMPERATURA MÍNIMA REGISTRADA DE UNA FINCA");
        System.out.println(daoL.getTempMinimaFinca(1));

        System.out.println("==============================");
        System.out.println("REGISTROS DE HUMEDAD EN UNA FINCA");
        daoL.getHumedadPorFinca(2).forEach(System.out::println);

        System.out.println("==============================");
        System.out.println("REGISTROS DE TEMPERATURA EN UNA FINCA");
        daoL.getTemperaturaPorFinca(3).forEach(System.out::println);

        System.out.println("==============================");
        System.out.println("TEMPERATURAS REGISTRADAS EN UN DIA EN UNA FINCA");
        daoL.getTempDiaPorFinca(4, LocalDate.of(2025,03,05)).forEach(System.out::println);












    }
}
