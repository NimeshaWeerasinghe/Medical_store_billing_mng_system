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
public class stockDetails {
    private int st_ID;
    private int pro_ID;
    private int quantity;

    /**
     * @return the st_ID
     */
    public int getSt_ID() {
        return st_ID;
    }

    /**
     * @param st_ID the st_ID to set
     */
    public void setSt_ID(int st_ID) {
        this.st_ID = st_ID;
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
}
