package com.team5.bigprojects.controller;

import com.team5.bigprojects.bean.BasicQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
public class BasicFlightController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping("/BasicQuery")
    @ResponseBody
    public List<Map<String,String>> basicFlightQuery(BasicQuery query, HttpServletRequest request) throws ParseException {
        request.getSession().setAttribute("query", query);
        BasicQuery query1 = new BasicQuery(query);

//        return jdbcTemplate.queryForList("SELECT * FROM WHERE dDate = query1.getdDate");
        return null;
    }
}
