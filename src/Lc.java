public class Lc<С extends Driver & Competing> {

    String license;

    public Lc(String license) {
        this.license=license;
    }

    public void goTransport(Driver driver, Transport transport) {
        if (driver.getLicense().contains(this.license) && transport.getClass()==Truck.class) {
            System.out.println("Водитель "+driver.getFio()+" управляет автомобилем "+transport.getBrand()+" "+transport.getModel()+" "+transport.getColor()+" и будет участвовать в заезде.");
        } else {
            System.out.println("Ты не можешь сесть за руль!");}
    }


}
