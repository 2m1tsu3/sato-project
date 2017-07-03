package com.sato.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement
@MapperScan("com.sato.mapper")
public class AppConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
      SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
      sqlSessionFactory.setDataSource(dataSource());
      //sqlSessionFactory.setConfigLocation(new ClassPathResource("/mybatis-config.xml"));
      return (SqlSessionFactory) sqlSessionFactory.getObject();
    }
    
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(org.sqlite.JDBC.class.getName());
        dataSource.setUrl("jdbc:sqlite:sato.sqlite3");
        return dataSource;
    }
    
    @Bean
    public PlatformTransactionManager transactionManager() {
      return new DataSourceTransactionManager(dataSource());
    }
    
//    @SuppressWarnings("resource")
//	@Bean
//    public MasterMapper masterMapper() throws Exception {
//      SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
//      return sessionTemplate.getMapper(MasterMapper.class);
//    }
}
