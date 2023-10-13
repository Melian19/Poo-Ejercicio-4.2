package Animales;

public abstract class Animal {
    //atributos
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    //metodos get
    public abstract String getNombreCientifico();
    public abstract String getHabitat();
    public abstract String getAlimentos();
    public abstract String getSonido();
}
