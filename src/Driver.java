public class Driver {

    String fio;
    String license;
    String experience;

    public Driver (String fio, String license) {
        this.fio=fio;
        this.license=license;
        this.experience="Начинающий гонщик";
    }

    public String getFio() {
        return fio;
    }

    public String getLicense() {
        return license;
    }


}
