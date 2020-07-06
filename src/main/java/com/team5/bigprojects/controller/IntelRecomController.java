package com.team5.bigprojects.controller;

import com.team5.bigprojects.bean.BasicQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class IntelRecomController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     *
     * @param query
     * @param bindingResult
     * @return
     * 存在问题 sql查询
     */
    @GetMapping("/Intel-Recom")
    @ResponseBody
    public List<Map<String, Object>> get_intelRecom_info(@Valid BasicQuery query, BindingResult bindingResult) {
        List<Map<String, Object>> listMaps = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        if(bindingResult.hasErrors()){
            List<ObjectError> objectErrors = bindingResult.getAllErrors();
            System.out.println(objectErrors.toString());
            for(ObjectError objectError: objectErrors){
                System.out.println("objectError = " + objectError.getObjectName());
                map1.put("resultName",objectError.getObjectName());
                System.out.println("objectError = " + objectError.getDefaultMessage());
                map1.put("resultMessage",objectError.getDefaultMessage());
                System.out.println("objectError = " + objectError.getCode());
                map1.put("resultCode",objectError.getCode());
                System.out.println("objectError = " + objectError.getArguments());
                map1.put("resultArguments",objectError.getArguments());
                String str = objectError.getDefaultMessage();
                listMaps.add(map1);
            }
            return null;
        }
        String sqlStr = "SELECT * FROM plane_log WHERE dDate = \"+query.getdDate() +\"AND dCity =\"+query.getdCity()+\"AND aCity = "+ query.getaCity() + "AS a LEFT JOIN dws_plane_score b ON a.flightNo=b.flightNo";
        return jdbcTemplate.queryForList(sqlStr);
    }

}
