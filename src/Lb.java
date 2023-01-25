public class Lb<B extends Driver & Competing> {

    String license;

    public Lb(String license) {
        this.license=license;
    }

    public void goTransport(B driver, Transport transport) {
       if (driver.getLicense().contains(this.license) && transport.getClass()==Car.class) {
           System.out.println("Водитель "+driver.getFio()+" управляет автомобилем "+transport.getBrand()+" "+transport.getModel()+" "+transport.getColor()+" и будет участвовать в заезде.");
      } else {
           System.out.println("Ты не можешь сесть за руль!");}
    }


}
