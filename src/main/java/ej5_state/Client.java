package ej5_state;

public class Client {
    public static void main (String []args){
        Computadora compu = new Computadora();

        compu.setState(new Prendido());
        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();

        compu.setState(new Reiniciar());
        compu.usarCompu();

        compu.usarCompu();
        compu.usarCompu();
        compu.usarCompu();
    }

}
