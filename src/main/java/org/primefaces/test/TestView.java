package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;
    
    private LazyDataModel<Customer> lazyModel;
    
    private CustomerService service = new CustomerService();
    
    @PostConstruct  
    public void init() {
        string = "Welcome to PrimeFaces!!!";
        lazyModel = new LazyCustomerDataModel(service.getCustomers());
    }

    public String getString() {
      return string;
    }

    public void setString(String string) {
      this.string = string;
    }

    public LazyDataModel<Customer> getLazyModel() {
      return lazyModel;
    }

    public CustomerService getService() {
      return service;
    }

    public void setService(CustomerService service) {
      this.service = service;
    }

    
    
}
