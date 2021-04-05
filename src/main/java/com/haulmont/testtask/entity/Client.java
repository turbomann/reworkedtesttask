package com.haulmont.testtask.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

//@Entity
//@Table(name = "CLIENTS" {
//        (columnNames = "FIRSTNAME"),
//        (columnNames = "LASTNAME"),
//        (columnNames = "MIDDLENAME"),
//        (columnNames = "TELEPHONENUMBER"),
//        (columnNames = "CLIENTEMAIL") })
//        @UniqueConstraint(columnNames = "CLIENTPASSPORTN") })

@Entity
@Table(name = "CLIENT")
public class Client extends AbstractEntity implements Serializable {


    @Id
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    //    @Column(name = "FIRST_NAME", nullable = false, length = 100)
    private String firstName;

    //    @Column(name = "LAST_NAME", nullable = false, length = 100)
    private String lastName;

    //    @Column(name = "MIDDLE_NAME", nullable = false, length = 100)
    private String middleName;

    //    @Column(name = "PHONE_NUMBER", unique = true, nullable = false, length = 100)
    private String telephoneNumber;

    //    @Column(name = "EMAIL", unique = true, nullable = false, length = 100)
    private String clientEmail;

    //    @Column(name = "PASSPORT_NUMBER", nullable = false, length = 100)
    private String clientPassportN;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPassportN() {
        return clientPassportN;
    }

    public void setClientPassportN(String clientPassportN) {
        this.clientPassportN = clientPassportN;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Client{" +
//                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientPassportN='" + clientPassportN + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(firstName, client.firstName) &&
                Objects.equals(lastName, client.lastName) &&
                Objects.equals(middleName, client.middleName) &&
                Objects.equals(telephoneNumber, client.telephoneNumber) &&
                Objects.equals(clientEmail, client.clientEmail) &&
                Objects.equals(clientPassportN, client.clientPassportN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, telephoneNumber, clientEmail, clientPassportN);
    }
}
