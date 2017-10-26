import java.util.*;
import java.util.stream.Collectors;

//Возвращает массив клиентов в разрезе причин отказа в выдаче кредита (Map<Enum, List<Client>>) за заданный интервал дат

public class Main {

    private static final int n = 10;

    //Java 6 version

    public Map<RejectReason, List<Client>> getClientMap(List<Client> clients) {
        Map<RejectReason, List<Client>> map = new HashMap<>();

        for (RejectReason reasons : RejectReason.values()) {
            map.put(reasons, new ArrayList<>());
        }

        for (Client client : clients) {
            map.get(client.getRejectReason()).add(client);
        }

        return map;
    }

    public static void main(String... args) {

        Main tmp = new Main();

        List<Client> clients = new ArrayList<>();
        List<Client> clientsToAdd = new ArrayList<>();
        Date date = new Date();

        for (int i = 0; i < n; i++) {
            Client client = new Client(args.toString());
            clients.add(client);
        }

        for (Client client : clients) {
            if (client.getRejectDate().after(date)) {
                clientsToAdd.add(client);
            }
        }

        tmp.getClientMap(clientsToAdd);

        //Java 8 version

        Map<RejectReason, List<Client>> ClientsByRejectReason = clientsToAdd.stream().collect(Collectors.groupingBy(Client::getRejectReason));

        return;
    }
}