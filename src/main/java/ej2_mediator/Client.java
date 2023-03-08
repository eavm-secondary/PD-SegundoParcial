package ej2_mediator;

public class Client {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("aa", "Antonio", "Pro");
        Estudiante e2 = new Estudiante("bb", "Brenda", "Pro");
        Estudiante e3 = new Estudiante("cc", "Carlos", "Pro");

        Docente d1 = new Docente("dd", "Daniel", "Amateur");
        Docente d2 = new Docente("ee", "Enrique", "pro");
        Docente d3 = new Docente("ff", "Fernando", "Amateur");

        ChatJuego chatEstudiantes = new ChatJuego();
        ChatJuego chatGeneral = new ChatJuego();

        e1.setChatTodos(chatGeneral);
        e2.setChatTodos(chatGeneral);
        e3.setChatTodos(chatGeneral);
        d1.setChatTodos(chatGeneral);
        d2.setChatTodos(chatGeneral);
        d3.setChatTodos(chatGeneral);

        e1.setChatEquipo(chatEstudiantes);
        e2.setChatEquipo(chatEstudiantes);
        e3.setChatEquipo(chatEstudiantes);

        e1.sendMessageEquipo("Hola equipo!!!!");

        e2.sendMessageTodos("Hol estudiantes y docentes");
    }
}
