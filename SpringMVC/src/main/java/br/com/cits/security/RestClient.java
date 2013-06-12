package br.com.cits.security;

import javax.annotation.PostConstruct;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {

    
    private final RestTemplate template;
    private final DefaultHttpClient httpClient;

    @Autowired
    public RestClient(RestTemplate template,
                      DefaultHttpClient httpClient) {
        this.template = template;
        this.httpClient = httpClient;
    }

    @PostConstruct
    public void init() {
        setCredentials("admin", "123456");
    }

    /**
     * Gets rest template.
     */
    public RestTemplate getRestTemplate() {
        return template;
    }

    /**
     * Creates URL based on the URI passed in.
     */
    public String createUrl(String uri) {
        StringBuilder sb = new StringBuilder();

        sb.append("http://gpd-server-cbmnpwr4xq.elasticbeanstalk.com/");
        sb.append("");
        sb.append(uri);
        
        
        return sb.toString();
    }
    
    /**
     * Set default credentials on HTTP client.
     */
    public void setCredentials(String userName, String password) {
        UsernamePasswordCredentials creds = 
                new UsernamePasswordCredentials("admin", "123456");
        AuthScope authScope = new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT, AuthScope.ANY_REALM);
        
        httpClient.getCredentialsProvider().setCredentials(authScope, creds);
    }


}
