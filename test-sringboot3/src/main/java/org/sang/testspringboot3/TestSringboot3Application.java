package org.sang.testspringboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
public class TestSringboot3Application {

    public static void main(String[] args) {
        SpringApplication.run(TestSringboot3Application.class, args);
    }

//	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
//	String index(){
//		return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book PinYin is "+bookBean.getPrice();
//	}
}


