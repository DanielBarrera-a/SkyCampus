package model;

public record Drone(
        String  id,
        String  modelo,
        int     bateria,       // 0-100%
        boolean disponible,
        String  ubicacion      // "Bloque A", "Bloque B", etc.
) {}
