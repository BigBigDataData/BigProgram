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

@Controller
public class MoreTripController {
    /**
     *
     * @param dDate
     * @param dCity
     * @param aCity
     * @description 往返查询
     * @return
     */
    @Autowired
    private JdbcTemplate jdbcTemplate1;

    @GetMapping("/round-trip-first")
    @ResponseBody
    public List<Map<String, Object>> get_moreTrip_first_info(@RequestParam(value = "dDate1")String dDate1,
                                                              @RequestParam(value = "dCity1")String dCity,
                                                              @RequestParam(value = "aCity1")String aCity) {

        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate1+"AND dCity ="+dCity+"AND aCity = "+aCity+"ORDER BY price";
        return jdbcTemplate1.queryForList(sqlStr);
    }
    @GetMapping("/round-trip-second")
    @ResponseBody
    public List<Map<String, Object>> get_roundTrip_second_info(@RequestParam(value = "dDate2")String dDate2,
                                                             @RequestParam(value = "dCity")String dCity2,
                                                             @RequestParam(value = "aCity")String aCity2) {

        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate2 +"AND dCity ="+dCity2+"AND aCity = "+aCity2+"ORDER BY price";

        return jdbcTemplate1.queryForList(sqlStr);
    }
}
