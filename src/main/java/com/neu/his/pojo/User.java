package com.neu.his.pojo;

import java.io.Serializable;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Short userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_login_name
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private String userLoginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_psw
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private String userPsw;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_type
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Byte userType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Short getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setUserId(Short userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_login_name
     *
     * @return the value of user.user_login_name
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public String getUserLoginName() {
        return userLoginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_login_name
     *
     * @param userLoginName the value for user.user_login_name
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_psw
     *
     * @return the value of user.user_psw
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public String getUserPsw() {
        return userPsw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_psw
     *
     * @param userPsw the value for user.user_psw
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw == null ? null : userPsw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_type
     *
     * @return the value of user.user_type
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_type
     *
     * @param userType the value for user.user_type
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }
}