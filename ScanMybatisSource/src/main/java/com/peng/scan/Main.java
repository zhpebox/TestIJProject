package com.peng.scan;

import example.TblModuleMapper;
import model.TblModule;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
//            List<TblModule> list = session.selectList("example.TblModuleMapper.selectL");
            int result = session.delete("example.TblModuleMapper.deleteT",50);
            session.selectOne("example.TblModuleMapper.selectT", 48);

            System.out.println("xxx");
            TblModuleMapper mapper = session.getMapper(TblModuleMapper.class);
            TblModule x = mapper.selectT(47);
            System.out.println(x.toString());
            System.out.println("Hello你好");
        } finally {
            session.commit();
            session.close();
        }

    }
}
