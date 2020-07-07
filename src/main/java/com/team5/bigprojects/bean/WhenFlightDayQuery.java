package com.team5.bigprojects.bean;

public class WhenFlightDayQuery {
    @javax.validation.constraints.NotBlank(message = "出发日期不能为空,请输入")
    private String month; //出发日期

    @javax.validation.constraints.NotBlank(message = "出发地点不能为空,请输入")
    private String dCity; //出发地

    @javax.validation.constraints.NotBlank(message = "目的地点不能为空,请输入")
    private String aCity; //目的地


    public WhenFlightDayQuery() {
    }
    public WhenFlightDayQuery(WhenFlightDayQuery query){
        this.setMonth(query.getMonth());
        this.setdCity(query.getdCity());
        this.setaCity(query.getaCity());
    }

    public WhenFlightDayQuery(String month, String dCity, String aCity) {
        this.month = month;
        this.dCity = dCity;
        this.aCity = aCity;
    }



    public String getMonth() {
        return month;
    }

    public void setMonth(String dDate) {
        this.month= dDate;
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
}
