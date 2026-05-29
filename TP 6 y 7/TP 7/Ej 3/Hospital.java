import java.util.ArrayList;

public class Hospital {

    private ArrayList<Paciente> pacientes;

    public Hospital() {
        pacientes = new ArrayList<>();
    }

    public void registrarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public void listarPacientes() {

        for (Paciente p : pacientes) {
            p.mostrar();
        }
    }

    public int cantidadPacientes() {
        return pacientes.size();
    }
}