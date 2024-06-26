package processor.entity;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "audit")
public class Audit {
	
	
	@Id
	public String id;
	public String user;
	public String dateandtime;
	public String service;
	public String event;
	
	public Audit() {
		super();
		
	}

	public Audit(String id, String user, String dateandtime, String service, String event) {
		super();
		this.id = id;
		this.user = user;
		this.dateandtime = dateandtime;
		this.service = service;
		this.event = event;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(String dateandtime) {
		this.dateandtime = dateandtime;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "Audit [id=" + id + ", user=" + user + ", dateandtime=" + dateandtime + ", service=" + service
				+ ", event=" + event + "]";
	}
	
	
	

}
