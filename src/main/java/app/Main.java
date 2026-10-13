package app;

import model.Drone;
import service.ConsultasFlota;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Drone> flota = List.of(
                new Drone("D-01", "DJI Mini 3", 85, true,  "Bloque A"),
                new Drone("D-02", "DJI Mini 3", 42, false, "Biblioteca"),
                new Drone("D-03", "DJI Mini 3", 91, true,  "Bloque C"),
                new Drone("D-04", "DJI Mini 3", 18, true,  "Bloque B"),
                new Drone("D-05", "DJI Mini 3", 67, true,  "Bloque D")
        );

        ConsultasFlota consultasFlota = new ConsultasFlota();

        System.out.println(consultasFlota.idsDronesDisponiblesConMayorAMenorBateria(flota));
        System.out.println(consultasFlota.hayAlgunDronDisponibleBloqueC(flota));
        System.out.println(consultasFlota.numeroDeDronesConBateriaCritica(flota));
        System.out.println(consultasFlota.listaDeDronesConSusBaterias(flota));

    }
}
