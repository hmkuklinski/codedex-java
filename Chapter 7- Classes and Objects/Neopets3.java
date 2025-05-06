class Neopet{
    private String name;
    private String species;
    private String color;
    private char gender;
    private boolean hasScarf;
    private double strength;
    private double defense;
    private double movement;
    public Neopet(String name, String species, String color, char gender, boolean hasScarf){
        this.name = name;
        this.species = species;
        this.color = color;
        this.gender = gender;
        this.hasScarf = hasScarf;
        this.strength = 0.0;
        this.defense = 0.0;
        this.movement = 0.0;
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
    public double getStrength(){
        return strength;
    }
    public void setStrength(double val){
        this.strength = val;
    }
    public double getDefense(){
        return defense;
    }
    public void setDefense(double val){
        this.defense = val;
    }
    public double getMovement(){
        return movement;
    }
    public void setMovement(double val){
        this.movement = val;
    }
    @Override
    public String toString(){
        return "NAME: " + this.name + "\nSPECIES: " + this.species + "\nCOLOR: " + this.color+ "\nGENDER: " + this.gender+ "\nHAS SCARF: " + this.hasScarf + "\nSTRENGTH: " + this.strength + "\nDEFENSE: " + this.defense + "\nMOVEMENT" + this.movement;
    }
}



public class Neopets3 {
    public static void main(String[] args) {
        System.out.println("                             _       ");
        System.out.println(" _ __    ___   ___  _ __   ___| |_ ___ ");
        System.out.println("| '_ \\ / _ \\/ _ \\| '_ \\ / _ | __/ __|");
        System.out.println("| | | |  __| (_) | |_) |  __| |_\\__ \\");
        System.out.println("|_| |_|\\___|\\___/| .__/ \\___|\\__|___/");
        System.out.println("                 |_|                     ");

        Neopet gravatia = new Neopet("Gravatia", "Eyrie", "Blue", 'f', false);
        System.out.println("BEFORE STATS: " + gravatia.toString() + "\n");

        gravatia.setStrength(6.2);
        gravatia.setDefense(2.5);
        gravatia.setMovement(5.5);

        System.out.println("AFTER STATS: " + gravatia.toString() + "\n");


        
    }
}

