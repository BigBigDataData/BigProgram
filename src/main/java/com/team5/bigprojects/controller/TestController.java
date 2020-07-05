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
 * @author
 * 单程查询
 */
@Controller
public class TestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/Query")
    @ResponseBody
    public List<Map<String, Object>> get_atotall_info(@RequestParam(value = "dDate")String dDate,
                                                      @RequestParam(value = "dCity")String dCity,
                                                      @RequestParam(value = "aCity")String aCity) {
        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate +"AND dCity ="+dCity+"AND aCity = "+ aCity +"ORDER BY price";
        System.out.println(sqlStr);

        return jdbcTemplate.queryForList(sqlStr);


    }







}
