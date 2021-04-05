package test;

import com.haulmont.testtask.entity.Client;
import com.haulmont.testtask.repository.HibernateRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        try (Session session = HibernateRepository.getSessionFactory().openSession()) {
//            session.beginTransaction();

//            Client client = new Client();
//            client.setFirstName("Roma");
//            client.setLastName("Vovkin");
//            client.setMiddleName("Petrovich");
//            client.setClientPassportN("1234567890");
//            client.setClientEmail("mail@mail.com");
//            client.setTelephoneNumber("89198189929");
//
//            session.save(client);
//
//            client = new Client();
//            client.setFirstName("Petia");
//            client.setLastName("Sorokin");
//            client.setMiddleName("Zigizmundovich");
//            client.setClientPassportN("0000999999");
//            client.setClientEmail("mali_mail@mail.com");
//            client.setTelephoneNumber("89098087071");
//
//            session.save(client);

//            session.getTransaction().commit();
        } catch (Throwable cause) {
            cause.printStackTrace();
        }

        List<Client> listClients = null;

        try (Session session = HibernateRepository.getSessionFactory().openSession()) {
            session.beginTransaction();

            Query query = session.createQuery("From Client");
            listClients = (List<Client>) query.list();

            session.getTransaction().commit();

        } catch (Throwable cause) {
            cause.printStackTrace();
        }

        if (listClients != null && !listClients.isEmpty()) {
            for (Client client : listClients) {
                System.out.println(client);
            }
            System.out.println("End");
        }

    }
}
