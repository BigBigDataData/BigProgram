package com.team5.bigprojects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author lenovo
 */
@Controller
public class TestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     *1.1-1.3统计数据的总体特征
     * */
    @GetMapping("/total-info")
    @ResponseBody
    public List<Map<String, Object>> get_atotall_info() {//男女购买商品的比率
        return jdbcTemplate.queryForList("SELECT * FROM total_info");
    }
}
