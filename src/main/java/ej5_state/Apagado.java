package ej5_state;

public class Apagado implements IStateComputadora {
    @Override
    public void computerBehavior(Computadora computadora) {
        if (!computadora.getProgramasAbiertos().isEmpty()) {
            System.out.println("Cerrando Programas...");
        }
        for (String program : computadora.getProgramasAbiertos()) {
            System.out.println("> "+program);
        }
        computadora.closeAllPrograms();
        computadora.setConsumoCPU(0);
        computadora.setConsumoRAM(0);
        computadora.showInfo();
    }
}
