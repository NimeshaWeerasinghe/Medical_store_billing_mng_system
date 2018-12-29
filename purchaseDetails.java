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
public class purchaseDetails {
    private int pur_ID;
    private int dea_ID;
    private int pro_ID;
    private int pur_date;
    private int quantity;
    private int rate;
    private int total;

    /**
     * @return the pur_ID
     */
    public int getPur_ID() {
        return pur_ID;
    }

    /**
     * @param pur_ID the pur_ID to set
     */
    public void setPur_ID(int pur_ID) {
        this.pur_ID = pur_ID;
    }

    /**
     * @return the dea_ID
     */
    public int getDea_ID() {
        return dea_ID;
    }

    /**
     * @param dea_ID the dea_ID to set
     */
    public void setDea_ID(int dea_ID) {
        this.dea_ID = dea_ID;
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
     * @return the pur_date
     */
    public int getPur_date() {
        return pur_date;
    }

    /**
     * @param pur_date the pur_date to set
     */
    public void setPur_date(int pur_date) {
        this.pur_date = pur_date;
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
     * @return the rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(int rate) {
        this.rate = rate;
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
