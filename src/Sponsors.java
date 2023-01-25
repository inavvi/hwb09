public class Sponsors {

    private String name;
    private int sponsorship;

    public Sponsors(String name, int sponsorship) {
        this.name = name;
        this.sponsorship = sponsorship;
    }

    public void fundRace(Race race) {
        System.out.println(name+" спонсор профинансировал на сумму "+sponsorship+" руб. гонку "+race.getName()+".");
    }

    public void fundDriver(Driver driver, int sponsorship) {
        System.out.println(name+" спонсор профинансировал на сумму "+sponsorship+" руб. водителя "+driver.getFio()+".");
    }

    public String getName() {
        return name;
    }

    public int getSponsorship() {
        return sponsorship;
    }

}
