package cn.tedu.sp11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootTest
class Sp11ZuulApplicationTests {

	@Test
	void contextLoads() {
	}

}
