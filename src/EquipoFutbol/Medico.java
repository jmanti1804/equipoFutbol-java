package EquipoFutbol;

/**
 *
 * @author Usuario
 */
public class Medico extends Persona{
    private String titulacion;
    private int añosExperiencia;

    public Medico(String titulacion, int añosExperiencia, String nombre, String apeliidos, int edad) {
        super(nombre, apeliidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Da asistencia en el partido");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia en el entrenamiento");
    }
    
    public void curarLesion(){
        System.out.println("Curar lesion");
    }
    
}
