package br.com.dio.FirstStepsSpring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

// Component -> Componentes que serão capturados 
// (acesso a codigo fonte)
@Component
public class ConversorJson {
    
    @Autowired
    private Gson gson;

    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
