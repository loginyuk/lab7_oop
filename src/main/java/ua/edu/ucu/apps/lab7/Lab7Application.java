package ua.edu.ucu.apps.lab7;

import java.util.List;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Retry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import ua.edu.ucu.apps.lab7.flowers.Flower;
import ua.edu.ucu.apps.lab7.flowers.FlowerColor;
import ua.edu.ucu.apps.lab7.flowers.FlowerType;

@SpringBootApplication
@RestController
public class Lab7Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
	}
}
