import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Socio> socios;

    public Biblioteca() {
        socios = new ArrayList<>();
    }

    public void agregarSocio(Socio s) {
        socios.add(s);
    }

    public void mostrarTodo() {
        for (Socio s : socios) {
            s.mostrarSocio();
        }
    }
}