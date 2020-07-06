package com.team5.bigprojects.bean;
import java.io.Serializable;
/**
@description 保存查询请求信息
 */
public class BasicQuery implements Serializable{
    @javax.validation.constraints.NotBlank(message = "出发日期不能为空,请输入")

    private String dDate; //出发日期

     @javax.validation.constraints.NotBlank(message = "出发地点不能为空,请输入")
    private String dCity; //出发地

    @javax.validation.constraints.NotBlank(message = "目的地点不能为空,请输入")
    private String aCity; //目的地


    public BasicQuery() {
    }
    public BasicQuery(BasicQuery query){
        this.setdDate(query.getdDate());
        this.setdCity(query.getdCity());
        this.setaCity(query.getaCity());
    }

    public BasicQuery(String dDate, String dCity, String aCity) {
        this.dDate = dDate;
        this.dCity = dCity;
        this.aCity = aCity;
    }



    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate;
    }

    public String getdCity() {
        return dCity;
    }

    public void setdCity(String dCity) {
        this.dCity = dCity;
    }

    public String getaCity() {
        return aCity;
    }

    public void setaCity(String aCity) {
        this.aCity = aCity;
    }

    @Override
    public String toString() {
        return "Query{" +
                "startTime='" + dDate + '\'' +
                ", startPlace='" + dCity + '\'' +
                ", endPlace='" + aCity + '\'' +
                '}';
    }
}
