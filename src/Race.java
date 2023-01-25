import java.util.ArrayList;
import java.util.LinkedList;

public class Race {

    public String  name;
    public double bestLapTime;
    private LinkedList<Transport> listParticipants;
   // private String


    public Race (String name) {
        this.name=name;
        this.bestLapTime=10000;
        listParticipants = new LinkedList<>();
    }

    public void infoListParticipants(){
        System.out.println("Гонка "+getName()+". Всего участников: "+listParticipants.size());
        for (int i=0; i<3; i++) {
            System.out.println(listParticipants.get(i).getBrand()+" "+listParticipants.get(i).getModel()+" "+listParticipants.get(i).getColor());
        }
    }

    public String getName() {
        return name;
    }

    public LinkedList<Transport> getListParticipants() {
        return listParticipants;
    }


    public double getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(double bestLapTime) {
        this.bestLapTime = bestLapTime;
    }


}
