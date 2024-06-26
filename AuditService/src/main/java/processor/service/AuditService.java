package processor.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import audit.AuditEvent;
import processor.entity.Audit;
import processor.handler.AuditEventReceiver;
import processor.repository.AuditRepository;

@Service
public class AuditService {
	
	
	@Autowired
	private AuditRepository auditRepository;
	
	private Audit audit;
	
	private static final Logger logger = LogManager.getLogger(AuditService.class);

	public void save(AuditEvent auditEvent) {
		
		
		audit= new Audit(auditEvent.getId(),auditEvent.getUser(),auditEvent.getDateandtime(),auditEvent.getService(),auditEvent.getEvent());
		
		auditRepository.save(audit);
		
		logger.info("Auidit event inserted in DB: " + audit);
		
		
	}
	

}
