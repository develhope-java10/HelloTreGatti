package co.devlhope.HelloTreGatti;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.HashMap;
import java.util.Map;

@Component
public class RequestMethodStatisticsCollector implements HandlerInterceptor {
    Map<String, Integer> countRequests = new HashMap<>();
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String methods = request.getMethod();
        int count = countRequests.getOrDefault(methods, 0);
        countRequests.put(methods, count + 1);
        System.out.println(countRequests);
        return true;
    }
}
