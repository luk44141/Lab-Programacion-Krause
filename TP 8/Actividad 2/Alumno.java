public class Alumno {

    private String dni;
    private String nombreApellido;
    private String curso;
    private int inasistencias;
    private String estadoAcademico;
    private Tutor tutor;

    public Alumno(String dni, String nombreApellido, String curso,
                  int inasistencias, String estadoAcademico, Tutor tutor) {

        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.curso = curso;

        validarInasistencias(inasistencias);
        this.inasistencias = inasistencias;

        this.estadoAcademico = estadoAcademico;
        this.tutor = tutor;
    }

    public void validarInasistencias(int cantidad) {

        if (cantidad < 0) {
            throw new IllegalArgumentException("Las inasistencias no pueden ser negativas.");
        }

    }

    public void operacionEspecial() throws AlumnoLibreException {

        if (inasistencias > 20) {
            throw new AlumnoLibreException("El alumno esta libre por exceso de inasistencias.");
        }

        System.out.println("Operacion academica realizada correctamente.");
    }

    public String getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getCurso() {
        return curso;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias(int inasistencias) {
        validarInasistencias(inasistencias);
        this.inasistencias = inasistencias;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "DNI: " + dni +
                "\nNombre: " + nombreApellido +
                "\nCurso: " + curso +
                "\nInasistencias: " + inasistencias +
                "\nEstado Academico: " + estadoAcademico;
    }

}