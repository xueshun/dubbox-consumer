package test.xue.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xue.entity.Simple;
import xue.service.SimpleService;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"dubbo-consumer.xml"});
		context.start();
		
		SimpleService simpleService = (SimpleService) context.getBean("simpleService");
		
		String hello = simpleService.sayHello("tom");
		System.out.println(hello);
		
		Simple simple = simpleService.getSimple();
		System.out.println(simple.getName());
		System.out.println(simple.getAge());
		System.out.println(simple.getMap().get("zhangsan"));
	}
}
