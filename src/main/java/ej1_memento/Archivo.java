package ej1_memento;

public class Archivo {
    private String nombre;
    private String contenido = "";
    private int version = 0;

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
        contenido += texto + '\n';
        if (texto.split(" ").length >= 5) {
            createBackup();
        }

    }

    public void createBackup() {
        version++;
        Archivo backup = new Archivo(this.nombre);
        backup.setContenido(this.contenido);
        RegistroVersiones.getInstance().saveMemento("version"+version, new MementoArchivo(backup));
    }

    public void restoreBackup(String alias){
        Archivo archivoRestaurado = RegistroVersiones.getInstance().getMemento(alias).getArchivo();
        this.nombre = archivoRestaurado.getNombre();
        this.contenido = archivoRestaurado.getContenido();
    }

    public void showInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Contenido: \n" + contenido);
        System.out.println("***********************");
    }

}
