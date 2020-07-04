package com.team5.bigprojects.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;

/**
 * @author lenovo
 */
public class SparkExample {
    public static void main(String[] args){
        //1、创建spark的配置
        SparkConf sparkConf = new SparkConf().setMaster("local").setAppName("SparkExample");
        //2、根据配置生成spark的上下文
        JavaSparkContext ctx = new JavaSparkContext(sparkConf);
        //1、创建rdd(3种方法)
        JavaRDD<Integer> rdd = ctx.parallelize(Arrays.asList(1,2,3,4,5));
        //2、转化rdd,
        JavaRDD<Integer>result = rdd.map(x->x*2);
        //3、求值
        result.foreach(x->System.out.println(x));
        //1、关闭spark的上下文
        ctx.close();

    }
}
