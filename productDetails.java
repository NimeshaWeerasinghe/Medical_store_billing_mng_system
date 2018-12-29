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
public class productDetails {
    private int pro_ID;
    private String proName;
    private String coName;
    private String batch_num;
    private int rate;
    private String pro_type;
    private int mfg_date;
    private int exp_date;

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
     * @return the proName
     */
    public String getProName() {
        return proName;
    }

    /**
     * @param proName the proName to set
     */
    public void setProName(String proName) {
        this.proName = proName;
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
     * @return the batch_num
     */
    public String getBatch_num() {
        return batch_num;
    }

    /**
     * @param batch_num the batch_num to set
     */
    public void setBatch_num(String batch_num) {
        this.batch_num = batch_num;
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
     * @return the pro_type
     */
    public String getPro_type() {
        return pro_type;
    }

    /**
     * @param pro_type the pro_type to set
     */
    public void setPro_type(String pro_type) {
        this.pro_type = pro_type;
    }

    /**
     * @return the mfg_date
     */
    public int getMfg_date() {
        return mfg_date;
    }

    /**
     * @param mfg_date the mfg_date to set
     */
    public void setMfg_date(int mfg_date) {
        this.mfg_date = mfg_date;
    }

    /**
     * @return the exp_date
     */
    public int getExp_date() {
        return exp_date;
    }

    /**
     * @param exp_date the exp_date to set
     */
    public void setExp_date(int exp_date) {
        this.exp_date = exp_date;
    }
    
}
