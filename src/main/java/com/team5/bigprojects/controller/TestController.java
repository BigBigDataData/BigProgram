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
/*
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

        String sqlStr = "SELECT a.*,b.score,b.timelag FROM plane_log AS a LEFT JOIN dws_plane_score AS b ON a.flightNo = b.flightNo AND a.supplier = b.supplier AND a.dDate = b.dDate WHERE a.dDate ="+query.getdDate()+"AND a.dCity =" +query.getdCity()+ "AND a.aCity =" +query.getaCity()+ "ORDER BY b.score";

       // String sqlStr = "SELECT a.*,b.score,b.timeLag FROM plane_log AS a LEFT JOIN dws_plane_score AS b ON a.flightNo = b.flightNo AND a.supplier = b.supplier AND a.dDate = b.dDate
        //String sqlStr = "SELECT * FROM plane_log where dDate = "+query.getdDate() +"AND dCity ="+query.getdCity()+"AND aCity = "+ query.getaCity() +"ORDER BY price";
        //WHERE a.dDate =" +query.getdDate+ "AND a.dCity =" +query.getdCity+ "AND a.aCity =" +query.getaCity+ "ORDER BY b.score";
        return jdbcTemplate.queryForList(sqlStr);
    }

 */
}