package com.team5.bigprojects.controller;

import com.team5.bigprojects.bean.BasicQuery;
import com.team5.bigprojects.bean.WhenFlightDayQuery;
import com.team5.bigprojects.bean.WhenFlightQuery;
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
public class WhenFlightController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     *
     * @param query
     * @param bindingResult
     * @return 何时飞 返回每月最低价
     */
    @GetMapping("/when-flight-month")
    @ResponseBody
    public List<Map<String, Object>> get_whenFlight_month_info(@Valid WhenFlightQuery query, BindingResult bindingResult) {
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
        String sqlStr = "SELECT price,month FROM plane_lowest_month WHERE dCity =" + query.getdCity()+ "AND aCity =" +query.getaCity()+ "ORDER BY month";
        return jdbcTemplate.queryForList(sqlStr);
    }

    /**
     *
     * @param query
     * @param bindingResult
     * @return 返回当月每天最低价
     */

    @GetMapping("/when-flight-day-leave")
    @ResponseBody
    public List<Map<String, Object>> get_whenFlight_day_info(@Valid WhenFlightDayQuery query, BindingResult bindingResult) {
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
        String sqlStr = "SELECT price,dDate FROM plane_log_lowest_day WHERE" +query.getMonth()+ "AND dCity =" + query.getdCity()+ "AND aCity =" +query.getaCity()+ "ORDER BY dDate";

        return jdbcTemplate.queryForList(sqlStr);
    }


    @GetMapping("/when-flight-day-back")
    @ResponseBody
    public List<Map<String, Object>> get_whenFlight_day_back_info(@Valid WhenFlightDayQuery query, BindingResult bindingResult) {
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
        String sqlStr = "SELECT price,dDate FROM plane_log_lowest_day WHERE" +query.getMonth()+ "AND dCity =" + query.getdCity()+ "AND aCity =" +query.getaCity()+ "ORDER BY dDate";
        return jdbcTemplate.queryForList(sqlStr);
    }

}
