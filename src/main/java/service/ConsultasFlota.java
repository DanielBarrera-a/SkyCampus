package service;

import java.util.List;
import java.util.Comparator;

import model.Drone;


public class ConsultasFlota {


    public List<String> idsDronesDisponiblesConMayorAMenorBateria(List<Drone> flota) {
        return flota.stream()
                .filter(Drone::disponible)
                .filter(dron -> dron.bateria() >= 50)
                .sorted(Comparator.comparingInt(Drone::bateria).reversed())
                .map(Drone::id)
                .toList();
    }

    public boolean hayAlgunDronDisponibleBloqueC(List<Drone> flota) {
        return flota.stream()
                .filter(dron -> dron.ubicacion().equals("Bloque C"))
                .anyMatch(Drone::disponible);
    }

    public long numeroDeDronesConBateriaCritica(List<Drone> flota){
        return flota.stream()
                .filter(dron -> dron.bateria() < 20 )
                .count();

    }

    public List<String> listaDeDronesConSusBaterias(List<Drone> flota) {
        return flota.stream()
                .map(dron -> dron.id() + ": " + dron.bateria() + "%")
                .toList();
    }
}
