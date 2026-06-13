package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collection;
import java.util.Map;

class gson_variables{

    public String base_code;
    public Map<String , Double>conversion_rates;                            /*   DATO IMPORTANTE ES QUE LAS CLASES LAS PONGAS
                                                                                                                            FUERA DE LA CLASE MADRE PARA QUE SEA MÁS COMPRENCIBLES
                                                                                                                            Y CLARO QUE TENGA MÁS SENTIDO Y LOGICA  */

}
public class prueba {


        public static void main(String[] args) throws IOException, InterruptedException {

            //configuracion url
            String url =  "https://v6.exchangerate-api.com/v6/035a59fa61757caf8da3925c/latest/EUR";

            // conectando con la api
            // creando el cliente
            HttpClient client = HttpClient.newHttpClient();

            // creacion de la peticion (request)
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            //enviar la petición y recibir la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String jsonResponse = response.body();



            Gson gson = new Gson();
            gson_variables datos =   gson.fromJson(jsonResponse , gson_variables.class);


            String monedaBase = datos.base_code;
            String monedaDestino = "USD";                                   // ESO HAY QUE ESTAR CAMBIANDO MANUALMENTE Y ESO NO ES EFICIENTE
            double cotizacion = datos.conversion_rates.get("USD");
            Collection<Double> cotizacion1 = datos.conversion_rates.values();




            System.out.println(monedaBase);
            System.out.println(monedaDestino);
            System.out.println(cotizacion);
            System.out.println(cotizacion1);



            //System.out.println(jsonResponse);    //Muestra el gson completo como materia prima

//
//            // Deserializa el JSON en un objeto Java
//            Persona personaDeserializada = gson.fromJson(json, Persona.class);
//
//            // Imprime el objeto Java deserializado
//            System.out.println(personaDeserializada.getNombre());




        }
    }






/*mensages sobre la cominicacion de la api
//            "invalid-key"cuando su clave API no es válida.
//                    "inactíve-account"si su dirección de correo electrónico
//            no fue confirmada.
//                    "quota-reached"cuando su cuenta haya alcanzado el
         número de solicitudes permitidas por su plan.*/
