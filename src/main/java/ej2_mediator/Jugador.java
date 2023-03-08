package ej2_mediator;

public abstract class Jugador {
    private String alias;
    private String nombre;
    private String ranking;
    private IMediatorJuego chatEquipo;
    private IMediatorJuego chatTodos;

    public Jugador(String alias, String nombre, String ranking) {
        this.alias = alias;
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public void setChatEquipo(IMediatorJuego chatEquipo) {

        this.chatEquipo = chatEquipo;
    }

    public void setChatTodos(IMediatorJuego chatTodos) {
        this.chatTodos = chatTodos;
    }

    public void recieveMessage(String msg, Jugador emisor){
        System.out.println(this.nombre+" recibio un mensaje de "+emisor.nombre+": "+msg);
    }

    public abstract void sendMessage(String msg);
}
