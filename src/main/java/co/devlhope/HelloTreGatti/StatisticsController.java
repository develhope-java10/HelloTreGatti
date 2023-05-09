package co.devlhope.HelloTreGatti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/stats")
public class StatisticsController {
    @Autowired
    RequestMethodStatisticsCollector requestMethodStatisticsCollector;
    @GetMapping("/count")
    public Map<String, Integer> countRequests(){
        return requestMethodStatisticsCollector.countRequests;
    }
}
