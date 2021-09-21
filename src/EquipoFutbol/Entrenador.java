package EquipoFutbol;

/**
 *
 * @author Usuario
 */
public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apeliidos, int edad) {
        super(nombre, apeliidos, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Dirige partido");
    }
    @Override
    public void entrenamiento(){
        System.out.println("Dirige el entrenamiento");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planificacion hecha");
    }
}
