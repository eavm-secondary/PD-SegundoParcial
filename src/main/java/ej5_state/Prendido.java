package ej5_state;

import java.util.Random;

public class Prendido implements IStateComputadora {
    @Override
    public void computerBehavior(Computadora computadora) {
        Random rnd = new Random();
        if (computadora.getProgramasAbiertos().isEmpty() || rnd.nextBoolean()){
            computadora.openProgram("Program "+rnd.nextInt(10000));
        } else {
            computadora.closeProgram(computadora.getProgramasAbiertos().get(rnd.nextInt(computadora.getProgramasAbiertos().size())));
        }

        computadora.setConsumoRAM(computadora.getProgramasAbiertos().size()*5);
        computadora.setConsumoCPU(computadora.getProgramasAbiertos().size()*5);
        computadora.showInfo();
    }
}
