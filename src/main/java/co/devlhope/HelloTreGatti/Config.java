package co.devlhope.HelloTreGatti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class Config implements WebMvcConfigurer {
    @Autowired
    RequestMethodStatisticsCollector requestMethodStatisticsCollector;
    @Autowired
    ResponseStatusStatisticsCollector responseStatusStatisticsCollector;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestMethodStatisticsCollector);
        registry.addInterceptor(responseStatusStatisticsCollector);
    }
}
