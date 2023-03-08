package ej1_memento;

public class Client {
    public static void main (String []args){
        Archivo apuntes = new Archivo("Apuntes");
        apuntes.addLinea("este documento es una prueba");
        apuntes.addLinea("el exito solo depende de tu esfuerzo");
        apuntes.addLinea("prologo");
        apuntes.addLinea("este documento fue actualizado satisfactoriamente ");

        apuntes.showInfo();

        apuntes.restoreBackup("version1");
        apuntes.showInfo();


    }

}
