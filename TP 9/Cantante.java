public class Cantante implements Contratable{
    private String nombre;
    private String generoMusical;
    private int cachet;
    private int cantidadCanciones;
    private String manager;

    public Cantante(String nombre, String generoMusical, int cachet, int cantidadCanciones, String manager){
        this.nombre=nombre;
        this.generoMusical=generoMusical;
        this.cachet=cachet;
        this.cantidadCanciones=cantidadCanciones;
        this.manager=manager;
    }

public String getNombre(){
    return nombre;
} 
public String getGeneroMusical(){
    return generoMusical;
}
public int getCachet(){
    return cachet;
}
public int getCantidadCanciones(){
    return cantidadCanciones;
}
public String getManager(){
    return manager;
}

@Override
public String toString(){
    return "Nombre: " + nombre +
    "\nGenero: " + generoMusical +
    "\nCachet: " + cachet +
    "\nNumero Canciones: " + cantidadCanciones +
    "\nManager: " + manager;
}

@Override
public void liquidarHonorarios(double impuestos){
    if(impuestos<0 || impuestos>100){
        throw new IllegalArgumentException("Impuesto Invalido");
    }
}

@Override
public void asignarEscenario(String nombreEscenario){
    if(nombreEscenario == null){
        throw new NullPointerException("Escenario Inexistente");
    }
}

public void realizarSoundcheck() throws EspectaculoCortoException{
    if(cantidadCanciones < 5){
        throw new EspectaculoCortoException("El cantante tiene menos de 5 canciones");
    }
}
}
