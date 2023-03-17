package com.example.practica1Spring;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ServicioInstalaciones {

    RestTemplate restTemplate = new RestTemplate();

    public InstalacionesQuote[] getInstalacionesQuote(){
        InstalacionesQuote[] instalacionesQuote = restTemplate.getForObject(
                "https://analisi.transparenciacatalunya.cat/resource/nw5s-4ixa.json", InstalacionesQuote[].class);
        return instalacionesQuote;
    }


}
