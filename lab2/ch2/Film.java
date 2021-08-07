package lab2.ch2;

public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public String getNume() {
        return nume;
    }

    public boolean hasActorAbove50(){
        boolean toReturn = false;

        for(int i=0; i< actori.length;i++){
            if(actori[i].getVarsta()>50){
                toReturn = true;
            }
        }
        return toReturn;
    }

    public boolean hasActorWithName(String nume){
        for(int i=0;i<actori.length;i++){
            if(actori[i].getNume().equals(nume)){
                return true;
            }
        }
        return false;
    }
}