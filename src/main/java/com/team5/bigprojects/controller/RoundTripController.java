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

@Controller
public class RoundTripController {
    /**
     *
     * @param dDate
     * @param dCity
     * @param aCity
     * @description 往返查询
     * @return
     */
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
/*
    @GetMapping("/round-trip-leave")
    @ResponseBody
    public List<Map<String, Object>> get_roundtrip_leave_info(@RequestParam(value = "dDate1")String dDate1,
                                                             @RequestParam(value = "dCity")String dCity,
                                                             @RequestParam(value = "aCity")String aCity) {

        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate1+"AND dCity ="+dCity+"AND aCity = "+aCity+"ORDER BY price";
        return jdbcTemplate1.queryForList(sqlStr);
    }
    @GetMapping("/round-trip-back")
    @ResponseBody
    public List<Map<String, Object>> get_roundtrip_back_info(@RequestParam(value = "dDate2")String dDate2,
                                                             @RequestParam(value = "dCity")String aCity,
                                                             @RequestParam(value = "aCity")String dCity) {

        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate2 +"AND dCity ="+dCity+"AND aCity = "+aCity+"ORDER BY price";

        return jdbcTemplate1.queryForList(sqlStr);
    }*/
}
