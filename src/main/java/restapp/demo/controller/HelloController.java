package restapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restapp.demo.topic.Topic;
import restapp.demo.topic.TopicService;

@RestController
public class HelloController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/hello")
	public String sayHello() {

		return "Welcome to Spring !!!";

	}

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

}