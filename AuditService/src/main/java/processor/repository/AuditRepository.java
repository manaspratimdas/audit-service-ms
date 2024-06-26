package processor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import processor.entity.Audit;



@Repository
public interface AuditRepository extends MongoRepository<Audit,String>{
	
	

}
