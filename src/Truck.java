import java.util.LinkedList;

public class Truck extends Transport {

    private String bodyType;
    private int diagnostics;
    private LinkedList<Sponsors> sponsors;

    public enum BodyType {

        N1(""),
        N2(""),
        N3("");

        private String type;

        BodyType(String type) {
            this.type=type;}

        public String getType() {
            return type;}

    }


    public Truck(String brand, String model, String color, String engineVolume) {
        super(brand,model,color,engineVolume);
        this.diagnostics=0;
        this.sponsors=new LinkedList<>();
    }


    public boolean diagnostics() throws ErrorDiagnosticsException {
        if (getClass().equals(Car.class) || getClass().equals(Truck.class)) {
            System.out.println(getBrand()+" "+getModel()+" "+getColor()+" диагностика пройдена!");
        } else { throw new ErrorDiagnosticsException(getBrand()+" "+getModel()+" "+getColor()+" Диагностика запрещена!");}
        return true;
    }

    public LinkedList<Sponsors> getSponsors() {
        return sponsors;
    }

    public int getDiagnostics() {
        return diagnostics;}

    public void startDrive() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" стартовал.");}

    @Override
    public void finishDrive() {

    }

    @Override
    public void refuel() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" заправлен.");}

}
