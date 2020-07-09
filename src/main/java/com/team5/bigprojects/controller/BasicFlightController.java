package com.team5.bigprojects.controller;

import com.team5.bigprojects.bean.BasicQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lenovo
 */
@Controller
public class BasicFlightController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/BasicQuery1")
    @ResponseBody
    public List<Map<String, Object>> get_flight_info(@Valid BasicQuery query, BindingResult bindingResult) {
        List<Map<String, Object>> listMaps = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        if(bindingResult.hasErrors()){
            List<ObjectError> objectErrors = bindingResult.getAllErrors();
            System.out.println(objectErrors.toString());
            for(ObjectError objectError: objectErrors){
                System.out.println("objectError = " + objectError.getObjectName());
                System.out.println("objectError = " + objectError.getDefaultMessage());
                map1.put("resultMessage",objectError.getDefaultMessage());
                System.out.println("objectError = " + objectError.getCode());
                System.out.println("objectError = " + objectError.getArguments());
                String str = objectError.getDefaultMessage();
            }
            return null;
        }

        String sqlStr = "SELECT a.*,b.score,b.timelag FROM plane_log AS a LEFT JOIN dws_plane_score AS b ON a.flightNo = b.flightNo AND a.supplier = b.supplier AND a.dDate = b.dDate WHERE a.dDate ="+query.getdDate()+"AND a.dCity =" +query.getdCity()+ "AND a.aCity =" +query.getaCity()+ "ORDER BY b.score";
        return jdbcTemplate.queryForList(sqlStr);
    }

}
