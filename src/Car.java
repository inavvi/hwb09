import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Car extends Transport implements Competing {

    private double bestLapTimeCar;
    private int maxSpeed;
    private String bodyType;

    private int diagnostics;
    private String driver;
    private LinkedList<Sponsors> sponsors;
    private ArrayList<Mechanic> mechanicList;



    public enum BodyType {
        SEDAN("седан"),
        HATCHBACK(""),
        COUPE("купе"),
        STATION_WAGON(""),
        SUV(""),
        CROSSOVER(""),
        PICKUP_TRUCK(""),
        VAN(""),
        MINIVAN("");

        private String type;

        BodyType(String type) {
            this.type=type;}

        public String getType() {
            return type;}

    }

    public Car(String brand, String model,BodyType bodyType, String color, String engineVolume) {
        super(brand,model,color,engineVolume);
        this.bodyType=bodyType.getType();
        this.bestLapTimeCar=100000;
        this.maxSpeed=320;
        this.diagnostics=1;
        this.driver=null;
        this.sponsors=new LinkedList<>();
    }


    public void SetBestLapTime(Car car, Race race, double time) {
        Car a=(Car) car;
        Race b=(Race) race;
        if(time<a.getBestLapTimeCar()) {
        this.bestLapTimeCar=time;
        }
           if (time < b.bestLapTime) {
               b.setBestLapTime(time);}
    }

    public void performMaintenance(Mechanic... mechanics) {
        int count=0;
        this.mechanicList=new ArrayList<>();
        if (count<=3)
            for (Mechanic mechanic : mechanics) {
                if (count < 3) {
                    this.mechanicList.add(mechanic);
                    count++;
                } else {
                    System.out.println("Внимание! Лишний механик на техобслуживании "+getBrand()+" "+getModel()+" "+getColor()+".");
                }
            }
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" провели техобслуживание "+count+" механика "+mechanicList+".");
    }

    public void repair(Mechanic... mechanics) {
        int count=0;
        this.mechanicList=new ArrayList<>();
        if (count<=3)
            for (Mechanic mechanic : mechanics) {
                if (count < 4) {
                    this.mechanicList.add(mechanic);
                    count++;
                } else {
                    System.out.println("Внимание! Лишний механик на ремонте "+getBrand()+" "+getModel()+" "+getColor()+".");
                }
            }
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" отремонтировали "+count+" механика "+mechanicList+".");
    }

    public boolean diagnostics() throws ErrorDiagnosticsException {
        if (getClass().equals(Car.class) || getClass().equals(Truck.class)) {
            System.out.println(getBrand()+" "+getModel()+" "+getColor()+" диагностика разрешена!");
        } else { throw new ErrorDiagnosticsException(getBrand()+" "+getModel()+" "+getColor()+" Диагностика запрещена!");}
        return true;
    }


    public ArrayList<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public String getDriver() {
        return driver;
    }

    public LinkedList<Sponsors> getSponsors() {
        return sponsors;
    }

    public int getDiagnostics() {
        return diagnostics;}

    public void carInfo() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" "+getBodyType()+" "+getSponsors()+".");
    }

    public String getBodyType() {
        return bodyType;}

    public double getBestLapTimeCar() {
        return bestLapTimeCar;}

    public int getMaxSpeed() {
        return maxSpeed;}

    @Override
    public void goTransport(Transport transport) {

    }

    public void setBestLapTimeCar(Race race, double bestLapTimeCar) {
        Race a=race;
        if (bestLapTimeCar<a.getBestLapTime()){
            a.setBestLapTime(bestLapTimeCar);
        }
        this.bestLapTimeCar = bestLapTimeCar;}

    public void setDriver(Driver drivers) {
        this.driver = driver;
    }

    public void bestLapTimeRace(Race race) {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" самый быстрый круг: "+getBestLapTimeCar()+".");
        System.out.println("Рекорд круга: "+race.getBestLapTime()+".");
    }

    @Override
    public void startDrive() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" стартовал.");

    }

    @Override
    public void finishDrive() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" финишировал.");
    }

    @Override
    public void refuel() {System.out.println(getBrand()+" "+getModel()+" "+getColor()+" заправлен.");

    }

    @Override
    public void pitStop() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" заехал на Пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" самый быстрый круг: "+getBestLapTimeCar()+".");
    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" развил максимальную скорость: "+getMaxSpeed()+" км/ч.");
    }


}
