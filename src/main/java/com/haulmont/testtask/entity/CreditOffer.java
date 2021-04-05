package com.haulmont.testtask.entity;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CreditOffer extends AbstractEntity {
   private int creditSum;

   @JoinColumn(name = "CLIENT_ID", nullable = false)
   @ManyToOne
   private Client client;

   @JoinColumn(name = "BANK_ID")
   @ManyToOne
    private Bank bank;








}
