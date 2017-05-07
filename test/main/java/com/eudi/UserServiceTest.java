package com.eudi;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @since 1.0
 */
public class UserServiceTest {
	private ApplicationContext context;
	private static final String ENGINE_LOG4J_CONFIG = "conf/log4j.xml";

	private UserService userService;

	@Before
	public void initialize() {
		DOMConfigurator.configure(ENGINE_LOG4J_CONFIG);
		context = new ClassPathXmlApplicationContext("conf/beans/beans-*.xml");
		userService = (UserService) context.getBean("remoteService");
	}

	@Test
	public void getUser() {
		User user = userService.getUser("zlex");
		System.out.println("用户的信息如下");
		System.out.println("用户名:" + user.getUsername());
		System.out.println("生日:" + user.getBirthday());
		System.out.println("年龄:" + user.getAge());
	}
}
