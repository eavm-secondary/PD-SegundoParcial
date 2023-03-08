package ej1_memento;

import java.util.HashMap;
import java.util.Map;

public class RegistroVersiones {
    private static RegistroVersiones instance;
    private final Map<String, MementoArchivo> registro = new HashMap<>();

    private RegistroVersiones(){}
    public static RegistroVersiones getInstance() {
        if (instance == null) {
            instance = new RegistroVersiones();
        }
        return instance;
    }

    public RegistroVersiones saveMemento(String alias, MementoArchivo mementoArchivo){
        registro.put(alias, mementoArchivo);
        return this;
    }

    public MementoArchivo getMemento(String alias){
        if (!registro.containsKey(alias)){
            throw new RuntimeException("No existe un backup con el alias solicitado");
        }
        return registro.get(alias);
    }


}
