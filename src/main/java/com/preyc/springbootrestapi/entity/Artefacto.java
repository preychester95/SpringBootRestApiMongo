/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preyc.springbootrestapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 *
 * @author prc
 */
public class Artefacto implements Serializable{
    
    @Id
    public ObjectId _id;
    public String item;
    public Integer qty;

    public Artefacto(ObjectId _id, String item, Integer qty) {
        this._id = _id;
        this.item = item;
        this.qty = qty;
    }

    @JsonIgnore
    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    
    
}
