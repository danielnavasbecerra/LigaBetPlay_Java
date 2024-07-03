package com.da_navas.liga_betplay.model;

import java.util.List;

public class Entrenamiento {
    private String id;
    private Equipo equipo;
    private String fecha;
    private String hora;
    private String lugar;
    private List<Actividad> listActividades;
    private List<Jugador> listJugadoresConvocados;
}
