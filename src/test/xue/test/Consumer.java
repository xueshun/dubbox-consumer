package test.xue.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xue.entity.Sample;
import xue.service.SampleService;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"dubbo-consumer.xml"});
		context.start();
		
		SampleService sampleService = (SampleService) context.getBean("sampleService");
		
		String hello = sampleService.sayHello("tom");
		System.out.println(hello);
		
		Sample sample = sampleService.getSample();
		System.out.println(sample.getName());
		System.out.println(sample.getAge());
		System.out.println(sample.getMap().get("zhangsan"));
	}
}
