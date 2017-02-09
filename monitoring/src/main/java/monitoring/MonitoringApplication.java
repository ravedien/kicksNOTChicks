package monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/*Hystrix Dashboard usage
Usage will be on edge service
pattern: host:port/hystrix.stream
ex: http://localhost:8080/hystrix.stream
*/

@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class MonitoringApplication {
	public static void main(String[] args) {
		SpringApplication.run(MonitoringApplication.class, args);
	}
}
