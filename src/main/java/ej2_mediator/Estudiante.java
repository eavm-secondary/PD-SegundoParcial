package ej2_mediator;

public class Estudiante extends Jugador{
    private IMediatorJuego chatEquipo;

    public Estudiante(String alias, String nombre, String ranking) {
        super(alias, nombre, ranking);
    }

    public void setChatEquipo(IMediatorJuego chatEquipo) {
        chatEquipo.addJugador(this);
        this.chatEquipo = chatEquipo;
    }

    public void sendMessageEquipo(String msg) {
        chatEquipo.send(msg,this);
    }
}
