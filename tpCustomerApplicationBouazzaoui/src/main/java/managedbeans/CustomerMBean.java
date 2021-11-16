/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managedbeans;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import ma.emsi.tpcustomerapplicationbouazzaoui.Customer;
import ma.emsi.tpcustomerapplicationbouazzaoui.CustomerManager;

/**
 *
 * @author pc
 */
@Named(value = "customerMBean")
@ViewScoped
public class CustomerMBean implements Serializable {
       
    @EJB  
private CustomerManager customerManager;
    /**
     * Creates a new instance of CustomerMBean
     */
    public CustomerMBean() {
    }
    public List<Customer> getCustomers() {
        Object customerList = null;
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return (List<Customer>) customerList;
  }  
}
