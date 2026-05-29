public class Main {

    public static void main(String[] args) {

        String[][] datos = {
                {"Aaron", "40111222", "22", "72.5", "true"},
                {"Samuel", "47999111", "19", "58.0", "false"},
                {"Valentino", "56222333", "12", "81.3", "true"}
        };

        Paciente[] pacientes = new Paciente[datos.length];

        for (int i = 0; i < datos.length; i++) {

            String nombre = datos[i][0];
            String dni = datos[i][1];
            int edad = Integer.parseInt(datos[i][2]);
            double peso = Double.parseDouble(datos[i][3]);
            boolean hospitalizado = Boolean.parseBoolean(datos[i][4]);

            pacientes[i] = new Paciente(
                    nombre,
                    dni,
                    edad,
                    peso,
                    hospitalizado);
        }

        Hospital hospital = new Hospital();

        for (Paciente p : pacientes) {
            hospital.registrarPaciente(p);
        }

        hospital.listarPacientes();

        System.out.println(
                "Cantidad pacientes: "
                + hospital.cantidadPacientes());

        System.out.println(
                "Edad indice 1: "
                + pacientes[1].getEdad());

        System.out.println(
                "Hospitalizado indice 1: "
                + pacientes[1].isHospitalizado());
    }
}