package ej4_strategy;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private List<Estudiante> estudiantesList = new ArrayList<>();

    private IStrategyOrdenamiento strategy;

    public void addEstudiante(Estudiante estudiante){
        estudiantesList.add(estudiante);
    }

    public void setStrategy(IStrategyOrdenamiento strategy) {
        this.strategy = strategy;
    }

    public void ordenar(){
        List<Estudiante> listaOrdenada = strategy.ordenar(estudiantesList);
        for (Estudiante e : listaOrdenada) {
            System.out.println("> "+e);
        }
        System.out.println("**************************************");
    }
}
