package ej2_mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatJuego implements IMediatorJuego{
    private List<Jugador> jugadoresList = new ArrayList<>();
    @Override
    public void send(String msg, Jugador emisor) {
        for (Jugador jugador : jugadoresList) {
            if (!jugador.equals(emisor)){
                jugador.recieveMessage(msg,emisor);
            }
        }
    }

    @Override
    public void addJugador(Jugador jugador) {
        jugadoresList.add(jugador);
    }
}
