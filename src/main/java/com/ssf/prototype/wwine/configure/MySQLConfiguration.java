package com.ssf.prototype.wwine.configure;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration

@PropertySource("classpath:/application.properties")
//com.example.demo.dao 는 DB를 다룰 Mapper 입니다
@MapperScan(value = { "com.ssf.prototype.wwine.dao" })

public class MySQLConfiguration {
    @Autowired
    private ApplicationContext applicationContext;

    //히카리라는 DB 커넥션 풀 라이브러리를 사용해요
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig hikariConfig() {
        return new HikariConfig();
    }

    //Database 기본 설정은 이제 히카리가 관리합니다
    @Bean
    public DataSource dataSorce() throws Exception {
        DataSource dataSource = new HikariDataSource(hikariConfig());
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        //SQL을 정리해둔곳은 src/main/resource/mapper 밑에 디렉토리 하나이상 더 있을수도있는데
        //아무쪼록 이름이 Mapper로 끝나는 xml파일에 쿼리가 있으니 앞으로 DAO가 쿼리 요청하면 여길 뒤져요
        sessionFactory.setMapperLocations(applicationContext.getResources("classpath:mapper/**/*Mapper.xml"));
        sessionFactory.setConfiguration(mybatisConfig());
        return sessionFactory.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    /**
     * application.properties 내 mybatis 설정 값 가져 옴
     *
     * @return org.apache.ibatis.session.Configuration
     */
    @Bean
    @ConfigurationProperties(prefix = "mybatis.configuration")
    public org.apache.ibatis.session.Configuration mybatisConfig() {
        return new org.apache.ibatis.session.Configuration();
    }

}
