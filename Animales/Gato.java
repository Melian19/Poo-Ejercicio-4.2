package Animales;

public class Gato extends Felino{
    //metodos abstractos
    public String getSonido(){
        return "Maullido";
    }

    public String getAlimentos(){
        return "Ratones";
    }

    public String getHabitat(){
        return "Domestico";
    }
    public String getNombreCientifico(){
        return "Felis silvestris catus";
    }
}
