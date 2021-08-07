
package lab2.ch2;

import java.util.Arrays;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public boolean publishedMoreThanTwo(){
        return filme.length > 2;
    }

    public boolean hasCertainActor(String actorName){
        for(int i=0;i<filme.length;i++){
            if(filme[i].hasActorWithName(actorName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nume;
    }
}