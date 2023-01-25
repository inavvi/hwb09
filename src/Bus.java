public class Bus extends Transport {

    private String bodyType;

    public enum BodyType {

        ESPECIALLY_SMALL(""),
        SMALL(""),
        AVERAGE(""),
        LARGE(""),
        ESPECIALLY_LARGE("");

        private String type;

        BodyType(String type) {
            this.type=type;}

        public String getType() {
            return type;}

    }

    public Bus(String brand, String model, String color, String engineVolume) {
        super(brand,model,color,engineVolume);
    }

    public void startDrive() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" стартовал.");}

    @Override
    public void finishDrive() {

    }

    @Override
    public void refuel() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" заправлен.");}


    public void diagnostics() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+"  Диагностика запрещена!");
    }

}
