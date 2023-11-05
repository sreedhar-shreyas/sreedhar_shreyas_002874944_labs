/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author archil
 */
public class Feature {
    private Product Owner;
    private String name;
    private Object value;

    public Feature(Product Owner, String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public Feature() {
    }
    
    public Feature(Product Owner) {
        this.Owner = Owner;
    }

    public Product getOwner() {
        return Owner;
    }

    public void setOwner(Product Owner) {
        this.Owner = Owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
    
    
    

    
}


