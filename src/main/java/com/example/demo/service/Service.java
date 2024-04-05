package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class Service {
    public String preverTempo(){
        String dadosMetereologicos = "";
        String apiURL = "https://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=12b3e1a01ec62614cd4a9ac2c939f981";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            System.out.println("Código de status: " + responseEntity.getStatusCode() );
            dadosMetereologicos = responseEntity.getBody();
            System.out.println(dadosMetereologicos);
        }else{
            dadosMetereologicos = "Falha ao obter dados metereológicos. Código de status: " + responseEntity.getStatusCode();
        }
        return dadosMetereologicos;
    }
}
