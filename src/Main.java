
public class Main {

public static void checkDiagnostics(Transport... transports) {
    for (Transport transport1 : transports) {
        if (transport1.getDiagnostics() == 1) {
            System.out.println(transport1.getBrand() + " " + transport1.getModel() + " " + transport1.getColor() + " диагностика проведена!");
        } else {
            System.out.println(transport1.getBrand() + " " + transport1.getModel() + " " + transport1.getColor() + " диагностика не проведена!");
        }
    }
}

public static void allowanceDiagnostics(Car... cars){
        int count=0;
        try {
            for (Car car: cars) {
                car.diagnostics();
                count++;
            } } catch (ErrorDiagnosticsException e) {
            System.out.println(e.getMessage());
        } finally { System.out.println(count);}
    }


    public static void main(String[] args) {




        Users batman =new Users("Batman","b2C135","b2C135");
        Users bat =new Users("Bat","b2C136","b2C136");

        Sponsors mars=new Sponsors("Марс",1000000);
        Sponsors lamborghini=new Sponsors("Lamborghini",7000000);
        Sponsors gazprom=new Sponsors("Газпром",3000000);

        Mechanic petrov=new Mechanic("Петров Иван Иванович","Петров и Ко","Б, С, Д");
        Mechanic petrova=new Mechanic("Петров Алексей Иванович","Петров и Ко","Б");
        Mechanic petrovb=new Mechanic("Петров Борис Иванович","Петров и Ко","Б, Д");
        Mechanic petrovc=new Mechanic("Петров Сергей Иванович","Петров и Ко","Б, С, Д");

        ServiceStation petrovKo = new ServiceStation("Петров и Ко");


        Car murcielago=new Car("Lamborghini","Murcielago", Car.BodyType.COUPE,"оранжевый","6,19 л.");
        Car murcielagob=new Car("Lamborghini","Murcielago", Car.BodyType.COUPE,"белый","6,19 л.");
        Car murcielagoc=new Car("Lamborghini","Murcielago", Car.BodyType.COUPE,"красный","6,19 л.");
        Car lancer=new Car("Mitsubishi","Lancer Evolution VIII", Car.BodyType.SEDAN,"красный","2 л.");

        Bus tourismo=new Bus("Mercedes-Benz","Tourismo","оранжевый","11,98 л.");
        Bus tourismob=new Bus("Mercedes-Benz","Tourismo","белый","11,98 л.");
        Bus tourismoc=new Bus("Mercedes-Benz","Tourismo","красный","11,98 л.");
        Bus tourismod=new Bus("Mercedes-Benz","Tourismo","жёлтый","11,98 л.");

        Truck actros=new Truck ("Mercedes-Benz","Actros","оранжевый","11,94 л.");
        Truck actrosb=new Truck ("Mercedes-Benz","Actros","белый","11,94 л.");
        Truck actrosc=new Truck ("Mercedes-Benz","Actros","красный","11,94 л.");
        Truck actrosd=new Truck ("Mercedes-Benz","Actros","жёлтый","11,94 л.");

        Driver shumaher=new Driver("Михаэль Шумахер","Б");
        Driver ivanov=new Driver("Иван Иванов","Б, С");
        Driver ivanovs=new Driver("Сергей Иванов","Д");

        Lb b=new Lb("Б");
        Lc c=new Lc("С");
        Ld d=new Ld("Д");

        Race leman=new Race("Леман");

        leman.getListParticipants().add(murcielago);
        leman.getListParticipants().add(murcielagob);
        leman.getListParticipants().add(actros);

        leman.infoListParticipants();

        murcielago.getSponsors().add(mars);
        murcielago.getSponsors().add(lamborghini);
        murcielagob.getSponsors().add(lamborghini);
        actros.getSponsors().add(gazprom);

        lamborghini.fundDriver(shumaher,1000000);

        murcielago.performMaintenance(petrov,petrova,petrovc,petrovb);
        murcielagob.repair(petrov,petrova,petrovc,petrovb);

        petrovKo.addTransportService(murcielago); //!!!!
        petrovKo.addTransportService(murcielagoc);
        petrovKo.addTransportService(actros);
        petrovKo.addTransportService(tourismo);

        petrovKo.performTransportService(petrov);
        petrovKo.performTransportService(petrovb);
        petrovKo.performTransportService(petrovc);


        batman.logIn("Batman","b2C135",murcielago);

        Users.checkUsers(batman, bat);

        checkDiagnostics(murcielago,actros);
        allowanceDiagnostics(murcielago,murcielagob);

        murcielago.carInfo();
        lancer.carInfo();

        tourismo.startDrive();
        actros.startDrive();

        murcielagoc.pitStop();
        murcielago.finishDrive();
        murcielago.refuel();
        murcielago.setBestLapTimeCar(leman,180.48);
        murcielagob.setBestLapTimeCar(leman,178.21);
        murcielago.bestLapTimeRace(leman);

        b.goTransport(shumaher,murcielago);
        b.goTransport(shumaher,actrosd);
        b.goTransport(ivanov,murcielagob);
        c.goTransport(ivanov,actrosd);
        d.goTransport(ivanovs,tourismo);

        petrov.addSeniorCarMechanicList(murcielago);
        petrova.addSeniorCarMechanicList(murcielagob);
        petrova.addSeniorCarMechanicList(murcielagob);
        petrovb.addSeniorCarMechanicList(murcielagoc);
        System.out.println(Mechanic.getSeniorCarMechanicList().get(petrov));
        System.out.println(Mechanic.getSeniorCarMechanicList().containsValue(murcielagob));
        Mechanic.infoSeniorCarMechanicList();


    }
}