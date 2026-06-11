package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;


public class prueba {


        public static void main(String[] args) throws IOException {

            //configuracion url
            String url =  "https://v6.exchangerate-api.com/v6/035a59fa61757caf8da3925c/latest/USD";

            // conectando con la api
            // creando el cliente
            HttpClient client = HttpClient.newHttpClient();

            // creacion de la peticion (request)
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            //enviar la petición y recibir la respuestay

            // Crea un objeto Java (La clase Persona es solo un ejemplo genérico)
//            Persona persona = new Persona("Juan", 30);
//
//            // Crea una instancia de Gson
//            Gson gson = new Gson();
//
//            // Serializa el objeto Java en JSON
//            String json = gson.toJson(persona);
//
//            // Imprime el JSON
//            System.out.println(json);
//
//            // Deserializa el JSON en un objeto Java
//            Persona personaDeserializada = gson.fromJson(json, Persona.class);
//
//            // Imprime el objeto Java deserializado
//            System.out.println(personaDeserializada.getNombre());



            // mensages sobre la cominicacion de la api
//            "invalid-key"cuando su clave API no es válida.
//                    "inactive-account"si su dirección de correo electrónico
//            no fue confirmada.
//                    "quota-reached"cuando su cuenta haya alcanzado el
//            número de solicitudes permitidas por su plan.

        }
    }


