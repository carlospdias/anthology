package com.cpdias.metalhead.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class AppConfig {
    
    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        
        config.setJdbcUrl( "jdbc:postgresql://localhost:15432/CONTACT_DB" );
        config.setDriverClassName("org.postgresql.Driver");
        config.setUsername( "contact" );
        config.setPassword( "contact" );
        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
       
        return new HikariDataSource( config );   
       
    }
    //https://www.pexels.com/pt-br/procurar/videos/engra%C3%A7ado/
    @Bean
    public SqlSessionFactory sqlSessionFactory() {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        sessionFactory.setFailFast(true);

        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = sessionFactory.getObject();
        } catch (Exception e) {
            System.err.println("Error creating sqlSessionFactory : " +  e);
        }
        return sqlSessionFactory;
    }
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
   
    @Bean
    public SqlSession sqlSession(SqlSessionFactory sqlfactory) {
        return new SqlSessionTemplate(sqlfactory);
    }
}
