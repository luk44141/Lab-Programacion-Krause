public class Paciente {

    private String nombre;
    private String dni;
    private int edad;
    private double peso;
    private boolean hospitalizado;

    public Paciente(String nombre, String dni, int edad,
                    double peso, boolean hospitalizado) {

        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.hospitalizado = hospitalizado;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isHospitalizado() {
        return hospitalizado;
    }

    public void mostrar() {

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Hospitalizado: " + hospitalizado);
        System.out.println();
    }
}