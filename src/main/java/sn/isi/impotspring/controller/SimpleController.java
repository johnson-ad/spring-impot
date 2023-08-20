package sn.isi.impotspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class SimpleController {

    /*
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

    @RequestMapping(value="/login")
    @GetMapping
    public Map<String, Object> currentUser(OAuth2AuthenticationToken OAuth2AuthenticationToken  ){
        return OAuth2AuthenticationToken.getPrincipal().getAttributes();
    }  */
}
