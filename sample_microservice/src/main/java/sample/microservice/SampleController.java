package sample.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.datastax.driver.core.*;

@RestController
public class SampleController {
	
	@RequestMapping("/")
	public String helloWorld() {
		
		Cluster cluster;
		Session session;
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		//lets see what happens when we commit
		session = cluster.connect("mykeyspace");
		
		ResultSet results = session.execute("select * from users");
		
		StringBuilder resultString = new StringBuilder();
		
		for (Row row : results) {
			resultString.append(row.getString("fname") + " " + row.getString("lname"));
		}
		
		
		return new String(resultString);
	}

}
