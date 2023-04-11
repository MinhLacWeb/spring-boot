package com.example.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "billdetail")
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "billdetail_id", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Integer billdetailID;

    public Integer getBilldetailID() {
        return billdetailID;
    }

    public void setBilldetailID(Integer billdetailID) {
        this.billdetailID = billdetailID;
    }
    
    @Column(name = "bill_id", nullable = false)
    private Integer billID;

    public Integer getBillID() {
        return billID;
    }

    public void setBillID(Integer billID) {
        this.billID = billID;
    }

    @Column(name = "product_id")
    private Integer productID;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    @Column(name = "quantity")
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}