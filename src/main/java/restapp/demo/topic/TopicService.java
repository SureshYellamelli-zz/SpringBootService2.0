package restapp.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= Arrays.asList(
				new Topic("spring", "Spring framework", "Spring MVC"),
				new Topic("nodejs", "nodejs framework", "Nodejs framework"),
				new Topic("angular", "Angular ", "Angular framework"));

	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	
}
