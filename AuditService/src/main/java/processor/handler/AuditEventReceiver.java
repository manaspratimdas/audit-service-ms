package processor.handler;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.stereotype.Component;

import audit.AuditEvent; 

@Component
public class AuditEventReceiver {
	
	@Autowired
	private KafkaListenerEndpointRegistry registry;
	
	@KafkaListener(topics = "audit-created-event", groupId = "audit-record-created-event")
	public void handler(AuditEvent auditEvent) throws ParseException {

		System.out.println("Auidit event received : " + auditEvent);
	}

}
