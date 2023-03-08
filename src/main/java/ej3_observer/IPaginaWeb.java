package ej3_observer;

public interface IPaginaWeb {
    void attach (IUsuario observer);
    void deattach (IUsuario observer);
    void notifyObservers();
}
