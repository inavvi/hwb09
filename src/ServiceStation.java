import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    private String name;

    private Queue<T> queue = new LinkedList<>();
    //private static Map<String, String> phoneBook = new HashMap<>();
    //private Queue<T> queue = new LinkedList<>();

    public ServiceStation(String name) {
        this.name=name;
    }

    public void addTransportService(T transport) {
        if (transport.getClass()!=Bus.class) {
            queue.offer(transport);
        } else {
                System.out.println("Ошибка! Автобусы не обслуживаются!");}
    }

    public void  performTransportService(Mechanic mechanic) {
        T transport=queue.poll();
        if(queue!=null) {
            System.out.println("Механик "+mechanic.getFio()+" провёл техническое обслуживание "+transport.getBrand()+" "+transport.getModel()+" "+transport.getColor()+".");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue<T> getQueue() {
        return queue;
    }

    public void setQueue(Queue<T> queue) {
        this.queue = queue;
    }
}
