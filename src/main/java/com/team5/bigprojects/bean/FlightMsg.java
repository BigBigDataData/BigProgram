package com.team5.bigprojects.bean;

public class FlightMsg {
    private String airName; //航空公司
    private String flightNo; //航班号
    private String dCity; //出发地
    private String dCD; //出发地三字码
    private String dAriport; //出发机场
    private String dDate; //出发日期（2020-xx-xx）
    private String dTime; //出发时间 (xx:xx)
    private String aCity; //目的地
    private String via; //经停或直飞
    private String aCD; //目的地三字码
    private String aAriport; //到达机场
    private String aTime; //到达时间
    private String price; //票价
    private String rate; //准点率
    private String supplier; //供应商
    private String fUrl; //跳转链接

    public FlightMsg(){
    }

    public FlightMsg(String airName,String flightNo,String dCity,String dCD,String dAriport,String dDate,String dTime,String aCity,String via,String aCD
            ,String aAriport,String aTime,String price,String rate,String supplier,String fUrl){
        this.airName = airName;
        this.flightNo = flightNo;
        this.dCity = dCity;
        this.dCD = dCD;
        this.dAriport = dAriport;
        this.dDate = dDate;
        this.dTime = dTime;
        this.aCity = aCity;
        this.via = via;
        this.aCD = aCD;
        this.aAriport = aAriport;
        this.aTime = aTime;
        this.price = price;
        this.rate = rate;
        this.supplier = supplier;
        this.fUrl = fUrl;
    }

    public String getAirName(){ return airName; }
    public void setAirName(){ this.airName = airName; }

    public String getFlightNo(){ return flightNo; }
    public void setFlightNo(){ this.flightNo = flightNo; }

    public String getdCity(){ return dCity; }
    public void setdCity(){ this.dCity = dCity; }

    public String getdCD(){return dCD;}
    public void setdCD(){this.dCD = dCD;}

    public String getdAriport(){return dAriport;}
    public void setdAriport(){this.dAriport = dAriport;}

    public String getdDate(){return  dDate;}
    public void setdDate(){this.dDate = dDate;}

    public String getdTime(){return dTime;}
    public void setdTime(){this.dTime = dTime;}

    public String getaCity(){return aCity;}
    public void setaCity(){this.aCity = aCity;}

    public String getVia(){return via;}
    public void setVia(){this.via = via;}

    public String getaCD(){return aCD;}
    public void setaCD(){this.aCD = aCD;}

    public String getaAriport(){return aAriport;}
    public void setaAriport(){this.aAriport = aAriport;}

    public String getaTime(){return aTime;}
    public void setaTime(){this.aTime = aTime;}

    public String getPrice(){return price;}
    public void setPrice(){this.price = price;}

    public String getRate(){return rate;}
    public void setRate(){this.rate = rate;}

    public String getSupplier(){return supplier;}
    public void setSupplier(){this.supplier = supplier;}

    public String getfUrl(){return fUrl;}
    public void setfUrl(){this.fUrl = fUrl;}
}
