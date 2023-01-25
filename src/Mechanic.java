import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Mechanic {
    private String fio;
    private String license;
    private String company;
    private static Map<Mechanic, Transport> seniorCarMechanicList = new HashMap<>();

    public Mechanic (String fio,String company, String license) {
        this.fio=fio;
        this.license=license;
        this.company=company;
    }

    public void addSeniorCarMechanicList(Transport transport) {
        this.seniorCarMechanicList.put(Mechanic.this,transport);

    }

    public static void infoSeniorCarMechanicList(){
        System.out.println(getSeniorCarMechanicList());
    }

    public static Map<Mechanic, Transport> getSeniorCarMechanicList() {
        return seniorCarMechanicList;
    }

    public String getCompany() {return company;}

    public String getFio() {
        return fio;
    }

    public String getLicense() {
        return license;
    }

    @Override
    public String toString() {
        return "Механик: "
                + fio +
                ", компания " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(fio, mechanic.fio) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, company);
    }
}
