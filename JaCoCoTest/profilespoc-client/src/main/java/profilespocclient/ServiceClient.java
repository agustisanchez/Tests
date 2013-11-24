package profilespocclient;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import profilespoc.Service;

@org.springframework.stereotype.Service
public class ServiceClient {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private Service service;

	@Value("${prop}")
	private String prop;

	@PostConstruct
	public void init() {
		logger.info("Client with service implementation {} and prop {}.",
				service.getClass(), prop);
	}
}
