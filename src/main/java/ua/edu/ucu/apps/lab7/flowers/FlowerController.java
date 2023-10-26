package ua.edu.ucu.apps.lab7.flowers;

import java.util.List;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Retry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
	@GetMapping("/list/")
	public List<Flower> hello() {
		return List.of(new Flower(45, 0.8, FlowerColor.RED, FlowerType.ROSE));
	}
}
