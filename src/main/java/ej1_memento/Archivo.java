package ej1_memento;

public class Archivo {
    private String nombre;
    private String contenido = "";

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void addLinea(String texto) {
        if (texto.split(" ").length >= 5) {
            createBackup();
        }
        contenido += texto + '\n';

    }

    public void createBackup() {
        Archivo backup = new Archivo(this.nombre);
        backup.setContenido(this.contenido);
        RegistroVersiones.getInstance().saveMemento("Version1",new MementoArchivo(backup));
    }

    public void showInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Contenido: \n" + contenido);
        System.out.println("***********************");
    }

}
