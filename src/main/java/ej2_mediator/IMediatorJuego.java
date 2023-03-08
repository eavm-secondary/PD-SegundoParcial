package ej2_mediator;

public interface IMediatorJuego {
    void send(String msg, Jugador emisor);
    void addJugador(Jugador jugador);
}
