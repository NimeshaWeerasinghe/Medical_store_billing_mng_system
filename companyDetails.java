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
public class companyDetails {
    private int co_ID;
    private String coName;
    private String address;
    private int mob_num;

    /**
     * @return the co_ID
     */
    public int getCo_ID() {
        return co_ID;
    }

    /**
     * @param co_ID the co_ID to set
     */
    public void setCo_ID(int co_ID) {
        this.co_ID = co_ID;
    }

    /**
     * @return the coName
     */
    public String getCoName() {
        return coName;
    }

    /**
     * @param coName the coName to set
     */
    public void setCoName(String coName) {
        this.coName = coName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mob_num
     */
    public int getMob_num() {
        return mob_num;
    }

    /**
     * @param mob_num the mob_num to set
     */
    public void setMob_num(int mob_num) {
        this.mob_num = mob_num;
    }
}
