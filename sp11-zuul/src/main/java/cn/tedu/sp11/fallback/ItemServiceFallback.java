package cn.tedu.sp11.fallback;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

public class ItemServiceFallback implements FallbackProvider {
//用来返回一个服务ID,来确定
	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		// TODO Auto-generated method stub
		return response();
	}
	private ClientHttpResponse response() {
		return new ClientHttpResponse() {

			@Override
			public InputStream getBody() throws IOException {
			
				return null;
			}

			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders hp=new HttpHeaders();
				hp.setContentType(MediaType.APPLICATION_JSON);
				return hp;
			}

			@Override
			public HttpStatus getStatusCode() throws IOException {
				
				return HttpStatus.OK;
			}

			@Override
			public int getRawStatusCode() throws IOException {
				
				return HttpStatus.OK.value();
				
			}

			@Override
			public String getStatusText() throws IOException {
				
				return HttpStatus.OK.getReasonPhrase();
			}

			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			};
		
	};
	}
}




