package profilespoc.spring;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ContextInitializer implements
		ApplicationContextInitializer<ConfigurableApplicationContext> {

	private Logger logger = LoggerFactory.getLogger(getClass());

	public void initialize(ConfigurableApplicationContext ctx) {
		logger.info("INITIALIZING SPRING CONTEXT");
		if (StringUtils.equals(ctx.getEnvironment().getProperty("envTarget"),
				"mock"))
			ctx.getEnvironment().setActiveProfiles("N");
		else
			ctx.getEnvironment().setActiveProfiles("default");
	}

}
