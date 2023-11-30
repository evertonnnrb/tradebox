package com.tradebox.config;

import com.tradebox.model.entities.User;
import com.tradebox.model.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class JwtTokenEnhancer implements TokenEnhancer {

    private final UserRepository userRepository;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken,
                                     OAuth2Authentication oAuth2Authentication) {
        User user = userRepository.findByEmail(oAuth2Authentication.getName());
        Map<String, Object> map = new HashMap<>();
        map.put("name", user.getName());
        map.put("userId", user.getId());
        DefaultOAuth2AccessToken token = (DefaultOAuth2AccessToken) oAuth2AccessToken;
        token.setAdditionalInformation(map);
        return token;
    }
}
