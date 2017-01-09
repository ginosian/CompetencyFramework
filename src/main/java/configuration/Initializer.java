package configuration;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by Martha on 1/6/2017.
 */
@Configuration
public class Initializer  implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        System.err.println("------------------------------------");
        sc.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
        sc.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
    }
}
