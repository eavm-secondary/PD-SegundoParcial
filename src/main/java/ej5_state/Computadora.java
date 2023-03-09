package ej5_state;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private final List<String> programasAbiertos = new ArrayList<>();
    private int consumoRAM;
    private int consumoCPU;
    private IStateComputadora state;


    public Computadora() {
        setState(new Apagado());
        usarCompu();
    }

    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public List<String> getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void openProgram(String program) {
        this.programasAbiertos.add(program.toLowerCase());
    }

    public void closeProgram(String program) {
        this.programasAbiertos.remove(program.toLowerCase());
    }

    public void closeAllPrograms() {
        this.programasAbiertos.clear();
    }
    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    public int getConsumoRAM() {
        return consumoRAM;
    }

    public void setConsumoRAM(int consumoRAM) {
        this.consumoRAM = consumoRAM;
    }

    public void usarCompu(){
        this.state.computerBehavior(this);
    }

    public void showInfo() {
        System.out.println("Programas abiertos: "+programasAbiertos);
        System.out.println("Consumo de RAM: "+ consumoRAM +"%");
        System.out.println("Consumo de CPU: "+consumoCPU+"%");
        System.out.println("***************************************");
    }
}
