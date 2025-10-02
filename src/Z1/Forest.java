package Z1;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;
    static String season;
    // объявите недостающие переменные и добавьте конструктор

    public Forest(ArrayList<MountainHare> hares){
        this.hares = hares;
    }

    public void setSeason(String newSeason){
        season = newSeason;
        if(newSeason.equals("зима")){
            MountainHare.color = "белый";
        }
        else {MountainHare.color = "серо-рыжий";}
    }
    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    public void printHares(){
        for(MountainHare hare : hares){
            System.out.println(hare);
        }

    }
    // добавьте метод printHares()

}