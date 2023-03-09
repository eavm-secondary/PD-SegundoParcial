package ej4_strategy;

public class Client {
    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        Estudiante e1 = new Estudiante("123","Enrique", "12/28/02", "ISC");
        Estudiante e2 = new Estudiante("233","Adolfo", "02/21/02", "FIN");
        Estudiante e3 = new Estudiante("738","Fernanda", "11/29/02", "ADM");
        Estudiante e4 = new Estudiante("912","Amelia", "10/08/02", "DHC");
        Estudiante e5 = new Estudiante("136","Eduardo", "17/28/02", "IEE");

        bd.addEstudiante(e1);
        bd.addEstudiante(e2);
        bd.addEstudiante(e3);
        bd.addEstudiante(e4);
        bd.addEstudiante(e5);

        bd.setStrategy(new OrdenarPorNombre());
        bd.ordenar();

        bd.setStrategy(new OrdenarPorCarrera());
        bd.ordenar();

        bd.setStrategy(new OrdenarPorCI());
        bd.ordenar();
    }
}
