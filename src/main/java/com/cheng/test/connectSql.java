package com.cheng.test;

import com.cheng.model.Image;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class connectSql {
    //private Image
    public static void main(String[] args) throws IOException{
        //mybatis的配置文件
        String resource = "applicationContext.xml";

        //使用类加载mybatis的配置文件
       // List<Image> images =
        InputStream is = connectSql.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用mybaties提供的resources类加载mybatis的配置文件
        SqlSession session = sessionFactory.openSession();
        //SqlSessionFactory session = sessionFactory.openSession();
        String statement = "com.cheng.mapping.ImageMapper.selectImages";
        //构建
        Image images = session.selectOne(statement , 1 );
        System.out.print(images.toString());

    }
}
