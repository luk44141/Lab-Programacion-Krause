public class Main {
    public static void main(String[] args) {

        String[][] datosCantantes = {
            {"Taylor Swift", "Pop", "1500000", "18", "Tree Paine"},
            {"Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad"},
            {"Coldplay", "Rock", "1200000", "3", "Phil Harvey"},
            {"Duki", "Trap", "500000", "14", null}
        };

        for(int i = 0; i < datosCantantes.length; i++){
            try {
                String nombre = datosCantantes[i][0];
                String generoMusical = datosCantantes[i][1];
                int cachet = Integer.parseInt(datosCantantes[i][2]);
                int cantidadCanciones = Integer.parseInt(datosCantantes[i][3]);
                String manager = datosCantantes[i][4];

                Cantante cantante = new Cantante(nombre, generoMusical, cachet, cantidadCanciones, manager);

                cantante.realizarSoundcheck();

                System.out.println(cantante);
                if(manager == null){
                    throw new NullPointerException("El cantante no tiene manager");
                }

                System.out.println("Manager: "+ manager);
                
                cantante.liquidarHonorarios(10);

                cantante.asignarEscenario("Escenario Principal");


            } catch(NumberFormatException e){
                System.out.println("Error: el cachet o cantidad de canciones no es un numero valido");
            } catch(NullPointerException e){
                System.out.println("Error: "+ e.getMessage());
            } catch(EspectaculoCortoException e){
                System.out.println("Error: "+ e.getMessage());
            } catch(IllegalArgumentException e){
                System.out.println("Error en impuestos: "+ e.getMessage());
            } finally {
                System.out.println("Se termino de procesar el cantante");
            }

        }

    }
}