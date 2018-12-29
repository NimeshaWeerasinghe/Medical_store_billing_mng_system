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
public class salesDetails {
    private int sale_ID;
    private int pro_ID;
    private int sale_date;
    private int quantity;
    private int price;
    private int total;

    /**
     * @return the sale_ID
     */
    public int getSale_ID() {
        return sale_ID;
    }

    /**
     * @param sale_ID the sale_ID to set
     */
    public void setSale_ID(int sale_ID) {
        this.sale_ID = sale_ID;
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
     * @return the sale_date
     */
    public int getSale_date() {
        return sale_date;
    }

    /**
     * @param sale_date the sale_date to set
     */
    public void setSale_date(int sale_date) {
        this.sale_date = sale_date;
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
}
