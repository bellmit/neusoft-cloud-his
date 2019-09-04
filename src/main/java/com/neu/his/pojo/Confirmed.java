package com.neu.his.pojo;

import java.util.Date;

public class Confirmed {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column confirmed.confirmed_id
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    private Integer confirmedId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column confirmed.regist_id
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    private Integer registId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column confirmed.disease_id
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    private Integer diseaseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column confirmed.disease_time
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    private Date diseaseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column confirmed.confirmed_category
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    private Byte confirmedCategory;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column confirmed.confirmed_id
     *
     * @return the value of confirmed.confirmed_id
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public Integer getConfirmedId() {
        return confirmedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column confirmed.confirmed_id
     *
     * @param confirmedId the value for confirmed.confirmed_id
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public void setConfirmedId(Integer confirmedId) {
        this.confirmedId = confirmedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column confirmed.regist_id
     *
     * @return the value of confirmed.regist_id
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public Integer getRegistId() {
        return registId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column confirmed.regist_id
     *
     * @param registId the value for confirmed.regist_id
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public void setRegistId(Integer registId) {
        this.registId = registId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column confirmed.disease_id
     *
     * @return the value of confirmed.disease_id
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public Integer getDiseaseId() {
        return diseaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column confirmed.disease_id
     *
     * @param diseaseId the value for confirmed.disease_id
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column confirmed.disease_time
     *
     * @return the value of confirmed.disease_time
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public Date getDiseaseTime() {
        return diseaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column confirmed.disease_time
     *
     * @param diseaseTime the value for confirmed.disease_time
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public void setDiseaseTime(Date diseaseTime) {
        this.diseaseTime = diseaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column confirmed.confirmed_category
     *
     * @return the value of confirmed.confirmed_category
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public Byte getConfirmedCategory() {
        return confirmedCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column confirmed.confirmed_category
     *
     * @param confirmedCategory the value for confirmed.confirmed_category
     *
     * @mbg.generated Thu Sep 05 00:39:57 CST 2019
     */
    public void setConfirmedCategory(Byte confirmedCategory) {
        this.confirmedCategory = confirmedCategory;
    }
}