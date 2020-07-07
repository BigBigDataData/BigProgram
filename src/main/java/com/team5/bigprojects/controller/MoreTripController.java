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
public class MoreTripController {
    /**
     *
     * @param dDate
     * @param dCity
     * @param aCity
     * @description 多程查询
     * @return
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping("/more-trip-first")
    @ResponseBody
    public List<Map<String, Object>> get_moretrip_first_info(@Valid BasicQuery query, BindingResult bindingResult) {
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
        //String sqlStr = "SELECT * FROM plane_log where dDate = "+query.getdDate() +"AND dCity ="+query.getdCity()+"AND aCity = "+ query.getaCity() +"ORDER BY price";
        String sqlStr = "SELECT a.*,b.score,b.timelag FROM plane_log AS a LEFT JOIN dws_plane_score AS b ON a.flightNo = b.flightNo AND a.supplier = b.supplier AND a.dDate = b.dDate WHERE a.dDate ="+query.getdDate()+"AND a.dCity =" +query.getdCity()+ "AND a.aCity =" +query.getaCity()+ "ORDER BY b.score";
        return jdbcTemplate.queryForList(sqlStr);
    }

    @GetMapping("/more-trip-second")
    @ResponseBody
    public List<Map<String, Object>> get_moretrip_second_info(@Valid BasicQuery query, BindingResult bindingResult) {
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
        //String sqlStr = "SELECT * FROM plane_log where dDate = "+query.getdDate() +"AND dCity ="+query.getdCity()+"AND aCity = "+ query.getaCity() +"ORDER BY price";
        String sqlStr = "SELECT a.*,b.score,b.timelag FROM plane_log AS a LEFT JOIN dws_plane_score AS b ON a.flightNo = b.flightNo AND a.supplier = b.supplier AND a.dDate = b.dDate WHERE a.dDate ="+query.getdDate()+"AND a.dCity =" +query.getdCity()+ "AND a.aCity =" +query.getaCity()+ "ORDER BY b.score";
        return jdbcTemplate.queryForList(sqlStr);
    }

    @GetMapping("/more-trip-third")
    @ResponseBody
    public List<Map<String, Object>> get_moretrip_third_info(@Valid BasicQuery query, BindingResult bindingResult) {
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
        //String sqlStr = "SELECT * FROM plane_log where dDate = "+query.getdDate() +"AND dCity ="+query.getdCity()+"AND aCity = "+ query.getaCity() +"ORDER BY price";
        String sqlStr = "SELECT a.*,b.score,b.timelag FROM plane_log AS a LEFT JOIN dws_plane_score AS b ON a.flightNo = b.flightNo AND a.supplier = b.supplier AND a.dDate = b.dDate WHERE a.dDate ="+query.getdDate()+"AND a.dCity =" +query.getdCity()+ "AND a.aCity =" +query.getaCity()+ "ORDER BY b.score";
        return jdbcTemplate.queryForList(sqlStr);
    }

    /*
    @GetMapping("/more-trp-first")
    @ResponseBody
    public List<Map<String, Object>> get_moreTrip_first_info(@RequestParam(value = "dDate1")String dDate1,
                                                              @RequestParam(value = "dCity1")String dCity,
                                                              @RequestParam(value = "aCity1")String aCity) {

        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate1+"AND dCity ="+dCity+"AND aCity = "+aCity+"ORDER BY price";
        return jdbcTemplate1.queryForList(sqlStr);
    }
    @GetMapping("/more-trp-second")
    @ResponseBody
    public List<Map<String, Object>> get_roundTrip_second_info(@RequestParam(value = "dDate2")String dDate2,
                                                             @RequestParam(value = "dCity")String dCity2,
                                                             @RequestParam(value = "aCity")String aCity2) {

        String sqlStr = "SELECT * FROM plane_log where dDate = "+dDate2 +"AND dCity ="+dCity2+"AND aCity = "+aCity2+"ORDER BY price";

        return jdbcTemplate1.queryForList(sqlStr);
    }*/
}
