package com.team5.bigprojects.controller;

import com.team5.bigprojects.bean.BasicQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;

/**
 * @author lenovo
 */
@Controller
public class BasicFlightController {
    @Autowired
    private JdbcTemplate jdbcTemplate1;

    @GetMapping("/BasicQuery1")//单程查询
    @ResponseBody
    public List<Map<String, Object>> get_flight_info(@RequestParam(value = "dDate")String dDate,
                                                      @RequestParam(value = "dCity")String dCity,
                                                      @RequestParam(value = "aCity")String aCity) {
        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate +"AND dCity ="+dCity+"AND aCity = "+aCity+"ORDER BY price";
        return jdbcTemplate1.queryForList(sqlStr);
    }

    /**
     *
     * @param dDate
     * @param dCity
     * @param aCity
     * @description 往返查询
     * @return
     */
    /*
    @GetMapping("/round-trip")
    @ResponseBody
    public List<Map<String, Object>> get_roundtrip_back_info(@RequestParam(value = "dDate")String dDate,
                                                              @RequestParam(value = "dCity")String aCity,
                                                              @RequestParam(value = "aCity")String dCity) {

        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate +"AND dCity ="+dCity+"AND aCity = "+aCity+"ORDER BY price";
      //  System.out.println(sqlStr);
        BasicQuery query1 = new BasicQuery(dDate,aCity,dCity);//将目的地改为出发地，出发地改为目的地
        get_roundtrip_leave_info(query1); //调用去程机票查询
        System.out.println(" -------------------------------------------------");
        return jdbcTemplate1.queryForList(sqlStr);
    }

    public List<Map<String, Object>> get_roundtrip_leave_info(BasicQuery query) {

        String sqlStr = "SELECT * FROM plane_log where dDate = "+query.getdDate() +"AND dCity ="+query.getdCity()+"AND aCity = "+query.getaCity()+"ORDER BY price";
     //   System.out.println(sqlStr);

        return jdbcTemplate1.queryForList(sqlStr);
    }*/
}
