package connectis.vdbhn.server;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@RestController
@EnableResourceServer
public class Oauth2ServerVdbhnApplication   extends WebMvcConfigurerAdapter {

	
	
	public static void main(String[] args) {
		SpringApplication.run(Oauth2ServerVdbhnApplication.class, args);
	}
	
	@Configuration
	@EnableAuthorizationServer
	protected static class OAuth2Config extends AuthorizationServerConfigurerAdapter {
		@Autowired
		private AuthenticationManager authenticationManager;

		@Override
		public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
			endpoints.authenticationManager(authenticationManager);
		}

		@Override
		public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
			clients.inMemory().withClient("VDH-SEV")
						.secret("d-L5oNUf,u+;k>2`FC7HiC,_e8p?pE'z-yWvN2HHpeLdU')AO/H5l=nw(!xSnN")
					.authorizedGrantTypes("authorization_code", "refresh_token", "password")
					.accessTokenValiditySeconds(18000)
				      .scopes("read", "write","openid")
			;
		}
	}

	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}

}
