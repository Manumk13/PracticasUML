package practica5;


public class Candidato {
    private String nombre;
    private String partido;
    private int numeroVotos = 0;

    public Candidato(String nombre, String partido) {
        this.nombre = nombre;
        this.partido = partido;
    }
//Encapsulacion
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Partido :" +partido);
        System.out.println("Numero de votos: "+numeroVotos);
    }
    public void agregarVoto(){
        this.numeroVotos++;
        
    }
}