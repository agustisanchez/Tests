package profilespoc;

import org.springframework.context.annotation.Profile;

@org.springframework.stereotype.Service
@Profile("default")
public class ServiceM implements Service {

}
