package com.sa.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * 104.198.144.56
 * PaymentResource controller
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/payment")
public class SentimentController {

    @PostMapping("/print-me")
    public String printMe() {
        return "Hello World";
    }

    private final Logger log = LoggerFactory.getLogger(SentimentController.class);
        
    /**
    * POST bank1
    */
    
//    @PostMapping("/bank-2")
//    public String bank1(@RequestBody Map<String,String> payload) {
//        String card = payload.get("card");
//        if(card.equalsIgnoreCase("CC"))
//        {
//                String url = "http://edition.cnn.com/politics";
//                HttpHeaders headers = new HttpHeaders();
//                headers.setContentType(MediaType.APPLICATION_JSON);
//                //headers.set("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik5VSTFNRVpHT1RreE5VRXpOalZDTUVSR1FqRkRPVUZDUmtOQk1qUXpOekV4TlVaQlFrWTVPUSJ9.eyJpc3MiOiJodHRwczovL2Rldi05cWxidXBuMy5hdXRoMC5jb20vIiwic3ViIjoiWjlSVmg0Y2NBdTFWUkFFR2pHQlNJZExPeWs1OHQ0cGJAY2xpZW50cyIsImF1ZCI6Imh0dHBzOi8vc2VudGltZW50LWFuYWx5c2lzLmlvIiwiaWF0IjoxNTc4NDY0OTg2LCJleHAiOjE1Nzg1NTEzODYsImF6cCI6Ilo5UlZoNGNjQXUxVlJBRUdqR0JTSWRMT3lrNTh0NHBiIiwiZ3R5IjoiY2xpZW50LWNyZWRlbnRpYWxzIn0.t-9qCL9BppUGeqZpRGp8K5pmFj47huQbbvL9z6xRGc91lZdbufsmu_0Hhn69zkzGGVXv-MS8lPRZQSnLi63UPOdOPNGhT6rUMOgAZhtcJ5PSce3gT5zr6tTeKjeyg9OgNK6B59HLyu8K_xIg8BjR_bcB6xEDtjmLYBx9zA0fiYep6zL4v0e8GKLt6AGhls2Fe7n0sxPc2BMZpdCPFtgNSHrpnXE7OzYxqMq-myeKltEQyWK8tDFPikKPPNnnnwOm2PIUahJuB3chkAl5bNqzTR2VYt9R_qi6YM8RQpJMISikwNWwt_mycBSk0v5yTDMtXPk_eqDkJB0qdNOn7CfGCw");
//                Map<String,String> map=new HashMap<String, String>();
//                map.put("status","accept");
//                HttpEntity<Map<String, String>> request = new HttpEntity<>(map, headers);
//                RestTemplate restTemplate=new RestTemplate();
//                ResponseEntity<String> response = restTemplate.postForEntity(url, request , String.class);
//                return "Response from network: ("+response.getBody() + ")";
//        }
//        return "Not a valid card";
//    }
//}

    @PostMapping("/bank-1")
    public String bank1(@RequestBody Map<String,String> payload) {
        String card = payload.get("card");
        if(card.equalsIgnoreCase("CC"))
        {
                String url = "http://104.198.70.81/api/payment/print-me";
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                headers.set("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik5VSTFNRVpHT1RreE5VRXpOalZDTUVSR1FqRkRPVUZDUmtOQk1qUXpOekV4TlVaQlFrWTVPUSJ9.eyJpc3MiOiJodHRwczovL2Rldi05cWxidXBuMy5hdXRoMC5jb20vIiwic3ViIjoiWjlSVmg0Y2NBdTFWUkFFR2pHQlNJZExPeWs1OHQ0cGJAY2xpZW50cyIsImF1ZCI6Imh0dHBzOi8vc2VudGltZW50LWFuYWx5c2lzLmlvIiwiaWF0IjoxNTc4NDY0OTg2LCJleHAiOjE1Nzg1NTEzODYsImF6cCI6Ilo5UlZoNGNjQXUxVlJBRUdqR0JTSWRMT3lrNTh0NHBiIiwiZ3R5IjoiY2xpZW50LWNyZWRlbnRpYWxzIn0.t-9qCL9BppUGeqZpRGp8K5pmFj47huQbbvL9z6xRGc91lZdbufsmu_0Hhn69zkzGGVXv-MS8lPRZQSnLi63UPOdOPNGhT6rUMOgAZhtcJ5PSce3gT5zr6tTeKjeyg9OgNK6B59HLyu8K_xIg8BjR_bcB6xEDtjmLYBx9zA0fiYep6zL4v0e8GKLt6AGhls2Fe7n0sxPc2BMZpdCPFtgNSHrpnXE7OzYxqMq-myeKltEQyWK8tDFPikKPPNnnnwOm2PIUahJuB3chkAl5bNqzTR2VYt9R_qi6YM8RQpJMISikwNWwt_mycBSk0v5yTDMtXPk_eqDkJB0qdNOn7CfGCw");
                Map<String,String> map=new HashMap<String, String>();
                map.put("status","accept");
                HttpEntity<Map<String, String>> request = new HttpEntity<>(map, headers);
                RestTemplate restTemplate=new RestTemplate();
                ResponseEntity<String> response = restTemplate.postForEntity(url, request , String.class);
                return "Response from network: ("+response.getBody() + ")";
        }
        return "Not a valid card";
    }
}
