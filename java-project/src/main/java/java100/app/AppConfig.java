//: ## ver 49
//: - Servlet 기술을 도입하여 서블릿 컨테이너에서 실행시킨다.
//: - 학습목표
//:   - 웹 애플리케이션을 만들고 배포하고 실행하는 기본 과정을 이해한다.
//:   
package java100.app;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

@Configuration
@ComponentScan("java100.app")
public class AppConfig {

	@Bean
	DataSource getDataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/studydb");
		ds.setUsername("study");
		ds.setPassword("1111");
		return ds;
	}

}
