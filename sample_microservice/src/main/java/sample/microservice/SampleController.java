package sample.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;

import com.datastax.driver.core.*;

@RestController
@EnableEurekaClient
@Configuration
@EnableAutoConfiguration
public class SampleController {
	
	@Value("${property1}")
	  String prop;
	
	@RequestMapping("/")
	public String helloWorld() {
		
		Cluster cluster;
		Session session;
		
		//cqlsh commands entered into cassandra
		/*CREATE KEYSPACE mykeyspace WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };
		USE mykeyspace;
		CREATE TABLE users (user_id int PRIMARY KEY, fname text, lname text);
		INSERT INTO users (user_id,  fname, lname) VALUES (1745, 'john', 'smith');
		INSERT INTO users (user_id,  fname, lname) VALUES (1744, 'john', 'doe');
		INSERT INTO users (user_id,  fname, lname) VALUES (1746, 'john', 'smith'); */
		
		/*cluster = Cluster.builder().addContactPoint("172.17.0.2").build();
		//lets see what happens when we commit
		session = cluster.connect("mykeyspace");
		
		ResultSet results = session.execute("select * from users");
		
		StringBuilder resultString = new StringBuilder();
		
		for (Row row : results) {
			resultString.append(row.getString("fname") + " " + row.getString("lname"));
		}*/
		
		
		//return new String(resultString + " .... value of property1: " + prop);
		return new String("value of property1: " + prop);
	}

}
