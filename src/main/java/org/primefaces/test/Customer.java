package org.primefaces.test;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

    public int id;
    public String name;
    public String company;

    public Customer() {
    }

    public Customer(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
