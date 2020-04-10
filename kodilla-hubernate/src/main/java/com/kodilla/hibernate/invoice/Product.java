//package com.kodilla.hibernate.invoice;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//@Entity
//@Table(name = "PRODUCT")
//public class Product {
//    private int id;
//    private String name;
//    //zrobić listę item - gettery i settery i zrobić OneToMany i mappedBy product
//
//    public Product() {
//    }
//
//    public Product(String name) {
//        this.name = name;
//    }
//
//    @Id
//    @GeneratedValue
//    @NotNull
//    @Column(name = "PRODUCT_ID", unique = true)
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    private void setId(int id) {
//        this.id = id;
//    }
//
//    private void setName(String name) {
//        this.name = name;
//    }
//}
