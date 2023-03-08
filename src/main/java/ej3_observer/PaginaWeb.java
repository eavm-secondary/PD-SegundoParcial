package ej3_observer;


import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPaginaWeb {

    private String attribute1;
    private String attribute2;
    private String attribute3;

    private List<IUsuario> observerList = new ArrayList<>();
    public PaginaWeb() {
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
        this.notifyObservers();
    }

    @Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IUsuario observer:observerList
             ) {
            observer.update("El Attribute 3 fue modificado con este valor: "+attribute3);
        }
    }
}
