package com.example.helloWorld.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.example.helloWorld.demo.models.pokemon;

import java.util.Arrays;
import java.util.List;

@RestController
public class GreetingController {

    @GetMapping(value ="/callingPokemon")
    private String callingPokemon() {
        String uri = "http://localhost:8080/hi";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    //localhost:8080/fetchingPokemon/whateverPokemonNameHere
    @RequestMapping(method = RequestMethod.GET, path = "/fetchingPokemon/{pokemonName}")
    public String fetchingPokemon(@PathVariable String pokemonName){

        String url = "https://pokeapi.co/api/v2/pokemon/"+pokemonName;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        pokemon newPokemon = new pokemon(pokemonName, response.toString());

        return newPokemon.toString();
    }
}
