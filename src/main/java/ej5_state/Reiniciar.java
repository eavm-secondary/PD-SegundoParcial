package ej5_state;

public class Reiniciar implements IStateComputadora {
    @Override
    public void computerBehavior(Computadora computadora) {
        computadora.setState(new Apagado());
        computadora.usarCompu();
        computadora.setState(new Prendido());
    }
}
