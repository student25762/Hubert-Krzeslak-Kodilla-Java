package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COMAPNIES")
public class Company {
    private int id;
    private String companyName;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
