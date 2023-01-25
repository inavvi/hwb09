import java.util.Objects;

public abstract class Transport  {

    private String brand;
    private String model;
    private String color;
    private String engineVolume;
    private int diagnostics;


    public Transport(String brand, String model, String color, String engineVolume) {
        this.brand=brand;
        this.model=model;
        this.color=color;

        this.engineVolume=engineVolume;}



    public abstract void startDrive();
    public abstract void finishDrive();

    public abstract void refuel();


    public void transportInfo () {
        System.out.println(brand+" "+model+", цвет "+color+".");}

    public int getDiagnostics() {
        return diagnostics;}

    public String getBrand() {
        return brand;}

    public void setBrand(String brand) {
        this.brand = brand;}

    public String getModel() {
        return model;}

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Транспорт: "
                + brand +
                ", модель " + model +
                ", цвет " + color +
                " --- ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color);
    }
}
