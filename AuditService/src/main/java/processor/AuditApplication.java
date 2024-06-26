package processor;

import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import processor.handler.AuditEventReceiver;

@SpringBootApplication
public class AuditApplication {
	
	private static final Logger logger = LogManager.getLogger(AuditApplication.class);

	public static void main(String[] args) {
		
		
		
		Properties properties = new Properties(); 
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9091"); 
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer"); 
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer"); 
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "audit-record-created-event"); 
//        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest"); 
		SpringApplication.run(AuditApplication.class, args);

	}

}
