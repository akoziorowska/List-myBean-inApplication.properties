package com.example.prop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;

@SpringBootApplication
public class PropApplication {

	public static void main(String[] args) {
		System.out.println("olaola1");
//		SpringApplication.run(PropApplication.class, args);


		ApplicationContext context = SpringApplication.run(PropApplication.class, args);
		ReadProperties readProperties = context.getBean(ReadProperties.class);
		readProperties.printProperties();

		MyProperties myProperties = context.getBean(MyProperties.class);
		System.out.println("z main email = "+myProperties.getEmail());

		KafkaProperties kafkaProperties = context.getBean(KafkaProperties.class);
		System.out.println("kafka topics="+kafkaProperties.getTopic1()+kafkaProperties.getTopic2()+kafkaProperties.getTopic3()+kafkaProperties.getTopics());

		System.out.println("kafka topicHandler="+kafkaProperties.getTopics().get(2).getTopic()+kafkaProperties.getTopics().get(2).getHandler());


	}
}
