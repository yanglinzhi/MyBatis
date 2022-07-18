package com.ylz.pojo;

/**
 * @author ylz
 * @date 2022/7/17 17:10
 */
public class User {
    private Integer u_id;
    private String u_pwd;
    private String u_phone;
    private Integer u_role;
    private Integer u_isdelete;
    private String u_name;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getU_isdelete() {
        return u_isdelete;
    }

    public void setU_isdelete(Integer u_isdelete) {
        this.u_isdelete = u_isdelete;
    }
    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public Integer getU_role() {
        return u_role;
    }

    public void setU_role(Integer u_role) {
        this.u_role = u_role;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_pwd='" + u_pwd + '\'' +
                ", u_phone='" + u_phone + '\'' +
                ", u_role=" + u_role +
                ", isdelete=" + u_isdelete +
                ", u_name='" + u_name + '\'' +
                '}';
    }
}
