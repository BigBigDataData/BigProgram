package com.team5.bigprojects.bean;

public class WhenFlightQuery {
    @javax.validation.constraints.NotBlank(message = "出发地点不能为空,请输入")
    private String dCity; //出发地

    @javax.validation.constraints.NotBlank(message = "目的地点不能为空,请输入")
    private String aCity; //目的地

    public WhenFlightQuery() {
    }
    public WhenFlightQuery(WhenFlightQuery query){
        this.setdCity(query.getdCity());
        this.setaCity(query.getaCity());
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
