package test;

import com.haulmont.testtask.entity.Client;
import com.haulmont.testtask.repository.ClientRepository;

public class TestCRUD {
    public static void main(String[] args) {
        ClientRepository usersCRUD = new ClientRepository();
        Client client1 = new Client();
        client1.setFirstName("John");
        client1.setLastName("Vasilev");
        client1.setMiddleName("Rimmovich");
        client1.setTelephoneNumber("90922288812");
        client1.setClientPassportN("0000123142");
       usersCRUD.create(client1);

        Client client2 = new Client();
        client2.setFirstName("Rambo");
        client2.setLastName("Petrovich");
        client2.setMiddleName("Rimmovich");
        client2.setTelephoneNumber("90922288812");
        client2.setClientPassportN("000088123");
        usersCRUD.create(client2);

        usersCRUD.findAll().forEach(it->System.out.println(it));

        usersCRUD.delete(client2);

        usersCRUD.findAll().forEach(it->System.out.println(it));

    }
}
