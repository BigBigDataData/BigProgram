package com.team5.bigprojects.bean;


import org.springframework.stereotype.Controller;

@Controller
public class WhereFlightQuery {
    @javax.validation.constraints.NotBlank(message = "出发日期不能为空,请输入")
    private String dDate; //出发日期

    @javax.validation.constraints.NotBlank(message = "出发地点不能为空,请输入")
    private String dCity; //出发地

    public WhereFlightQuery() {
    }
    public WhereFlightQuery(BasicQuery query){
        this.setdDate(query.getdDate());
        this.setdCity(query.getdCity());
    }

    public WhereFlightQuery(String dDate, String dCity) {
        this.dDate = dDate;
        this.dCity = dCity;
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
}
