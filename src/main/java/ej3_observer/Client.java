package ej3_observer;

public class Client {

    public static void main (String[]args){
        PaginaWeb subject = new PaginaWeb();

        subject.attach(new ConcreteUsuarioA());
        subject.attach(new ConcreteUsuarioB());
        subject.attach(new ConcreteUsuarioA());

        subject.setAttribute3("Deberia de notificarse");

    }
}
