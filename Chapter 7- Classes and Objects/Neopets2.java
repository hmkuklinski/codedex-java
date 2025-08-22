class Neopet{
    private String name;
    private String species;
    private String color;
    private char gender;
    private boolean hasScarf;
    public Neopet(String name, String species, String color, char gender, boolean hasScarf){
        this.name = name;
        this.species = species;
        this.color = color;
        this.gender = gender;
        this.hasScarf = hasScarf;
    }
    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public String getColor(){
        return color;
    }
    public char getGender(){
        return gender;
    }
    public boolean getHasScarf(){
        return hasScarf;
    }
    @Override
    public String toString(){
        return "NAME: " + this.name + "\nSPECIES: " + this.species + "\nCOLOR: " + this.color+ "\nGENDER: " + this.gender+ "\nHAS SCARF: " + this.hasScarf;
    }
}



public class Neopets2 {
    public static void main(String[] args) {
        System.out.println("                             _       ");
        System.out.println(" _ __    ___   ___  _ __   ___| |_ ___ ");
        System.out.println("| '_ \\ / _ \\/ _ \\| '_ \\ / _ | __/ __|");
        System.out.println("| | | |  __| (_) | |_) |  __| |_\\__ \\");
        System.out.println("|_| |_|\\___|\\___/| .__/ \\___|\\__|___/");
        System.out.println("                 |_|                     ");

        Neopet gravatia = new Neopet("Gravatia", "Eyrie", "Blue", 'f', false);
        System.out.println(gravatia.toString() + "\n");

        Neopet myneo = new Neopet("Mickey", "Dragon", "Red", 'f', true);
        System.out.println(myneo.toString());
    }
}

