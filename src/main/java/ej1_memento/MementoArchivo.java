package ej1_memento;

public class MementoArchivo {

    private Archivo archivo;

    public MementoArchivo(Archivo concreteObject) {
        this.archivo = concreteObject;
    }

    public Archivo getArchivo() {
        return archivo;
    }
}
