/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msbms;

/**
 *
 * @author Hansi
 */
public class BillDetails {
    private int bill_ID;
    private int pro_ID;
    private String cos_name;
    private int quantity;
    private int price;
    private int total;
    private int date;

    /**
     * @return the bill_ID
     */
    public int getBill_ID() {
        return bill_ID;
    }

    /**
     * @param bill_ID the bill_ID to set
     */
    public void setBill_ID(int bill_ID) {
        this.bill_ID = bill_ID;
    }

    /**
     * @return the pro_ID
     */
    public int getPro_ID() {
        return pro_ID;
    }

    /**
     * @param pro_ID the pro_ID to set
     */
    public void setPro_ID(int pro_ID) {
        this.pro_ID = pro_ID;
    }

    /**
     * @return the cos_name
     */
    public String getCos_name() {
        return cos_name;
    }

    /**
     * @param cos_name the cos_name to set
     */
    public void setCos_name(String cos_name) {
        this.cos_name = cos_name;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(int date) {
        this.date = date;
    }
}
