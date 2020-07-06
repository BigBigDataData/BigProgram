package com.team5.bigprojects.controller;

import com.team5.bigprojects.bean.BasicQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
/**
 * @author
 * 单程查询
 */
/*
@Controller
public class TestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/Query")
    @ResponseBody
    public List<Map<String, Object>> get_atotall_info(@RequestParam(value = "dDate")String dDate,
                                                      @RequestParam(value = "dCity")String dCity,
                                                      @RequestParam(value = "aCity")String aCity) {
        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate +" AND dCity ="+dCity+" AND aCity = "+ aCity +" ORDER BY price";
        System.out.println(sqlStr);

        return jdbcTemplate.queryForList(sqlStr);


    }
}
*/
@Controller
public class TestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/round-trip-leave")
    @ResponseBody
    public List<Map<String, Object>> get_roundtrip_leave_info(@Valid BasicQuery query, BindingResult bindingResult) {
        List<Map<String, Object>> listMaps = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        if(bindingResult.hasErrors()){
            List<ObjectError> objectErrors = bindingResult.getAllErrors();
            System.out.println(objectErrors.toString());
            for(ObjectError objectError: objectErrors){
                System.out.println("objectError = " + objectError.getObjectName());
                //map1.put("resultName",objectError.getObjectName());
                System.out.println("objectError = " + objectError.getDefaultMessage());
                map1.put("resultMessage",objectError.getDefaultMessage());
                System.out.println("objectError = " + objectError.getCode());
                //map1.put("resultCode",objectError.getCode());
                System.out.println("objectError = " + objectError.getArguments());
                //map1.put("resultArguments",objectError.getArguments());
                String str = objectError.getDefaultMessage();
                //listMaps.add(map1)
            }
            return null;
        }
        String sqlStr = "SELECT * FROM plane_log where dDate = "+query.getdDate() +"AND dCity ="+query.getdCity()+"AND aCity = "+ query.getaCity() +"ORDER BY price";
        return jdbcTemplate.queryForList(sqlStr);
    }

    @GetMapping("/round-trip-back")
    @ResponseBody
    public List<Map<String, Object>> get_roundtrip_back_info(@Valid BasicQuery query, BindingResult bindingResult) {
        List<Map<String, Object>> listMaps = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        if(bindingResult.hasErrors()){
            List<ObjectError> objectErrors = bindingResult.getAllErrors();
            System.out.println(objectErrors.toString());
            for(ObjectError objectError: objectErrors){
                System.out.println("objectError = " + objectError.getObjectName());
                //map1.put("resultName",objectError.getObjectName());
                System.out.println("objectError = " + objectError.getDefaultMessage());
                map1.put("resultMessage",objectError.getDefaultMessage());
                System.out.println("objectError = " + objectError.getCode());
                //map1.put("resultCode",objectError.getCode());
                System.out.println("objectError = " + objectError.getArguments());
                //map1.put("resultArguments",objectError.getArguments());
                String str = objectError.getDefaultMessage();
                //listMaps.add(map1)
            }
            return null;
        }
        String sqlStr = "SELECT * FROM plane_log where dDate = "+query.getdDate() +"AND dCity ="+query.getdCity()+"AND aCity = "+ query.getaCity() +"ORDER BY price";
        return jdbcTemplate.queryForList(sqlStr);
    }
}