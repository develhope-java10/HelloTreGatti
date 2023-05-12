package co.devlhope.HelloTreGatti;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.HashMap;
import java.util.Map;

@Component
public class ResponseStatusStatisticsCollector implements HandlerInterceptor {
	Map<Integer, Integer> countStatus = new HashMap<>();
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		int methods = response.getStatus();
		int count = countStatus.getOrDefault(methods, 0);
		countStatus.put(methods, count + 1);
		System.out.println(countStatus);
		return true;
	}
}
