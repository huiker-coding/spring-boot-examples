package com.example.mybatisdemo.core;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.example.mybatisdemo.dao.master"}, sqlSessionFactoryRef = "SqlSessionFactory01")
public class MybatisDBConfigMaster {

    @Bean(name = "DataSource01")
    @ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "SqlSessionFactory01")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("DataSource01") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "TransactionManager01")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("DataSource01") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "SqlSessionTemplate01")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("SqlSessionFactory01") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
