package com.dam.U1EX05_GCG;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

@SpringBootApplication
public class U1Ex05GcgApplication {

	public static void main(String[] args) {
		SpringApplication.run(U1Ex05GcgApplication.class, args);

		GsonBuilder gsonBuilder = new GsonBuilder().serializeNulls().setPrettyPrinting();
		Gson gsonEscritura = gsonBuilder.create();
		Gson gsonLectura = new Gson();

		mostrarJsonPorConsola(gsonLectura);

	}

	/*1. Se tendrán que crear las clases necesarias para transformar los datos del archivo json 
	en objetos JAVA. Una vez transformados los datos, se tendrá que imprimir por consola los 
	diferentes nombres de los hoteles.*/
	public static void mostrarJsonPorConsola(Gson gson) {
		try {
			Empresa empresa = gson.fromJson(new FileReader("src/main/resources/hotels.json"), Empresa.class);
			for (Hotel hotel : empresa.getHotel()) {
				System.out.println(hotel.getNombre());
			}
		} catch (Exception e) {

			System.err.println("No se ha podido leer el json");
		}
	}

	/*2. Se tendrá que disponer de una funcionalidad llamada AltaNouHotel() que inserte 
	un nuevo hotel y actualice el documento hoteles.json. La funcionalidad tendría que 
	controlar si el hotel ya existe y en este caso no tendría que insertarlo.*/
	public static String altaNouHotel(Gson gson, Hotel hotel) {
		String resAddHotel = null;
		Empresa hotelCompany = null;

		try {
			hotelCompany = gson.fromJson(new FileReader("src/main/resources/hotels.json"), Empresa.class);
			Hotel[] hoteles = hotelCompany.getHotel();
			Hotel[] listaHotelesFinales = appendHoteles(hotel, hoteles);
			hotelCompany.setHotel(listaHotelesFinales);
			resAddHotel = gson.toJson(hotelCompany);
		} catch (JsonSyntaxException eJSyntax) {
			System.err.println(eJSyntax+"\n"+"Error eJSyntax at altaNouHotel ");
		} catch (JsonIOException eJIO) {
			System.err.println(eJIO+"\n"+"Error eJIO at altaNouHotel ");
		} catch (FileNotFoundException eFileNotFoundException) {
			System.err.println(eFileNotFoundException+"\n"+"Error eFileNotFoundException");
		} catch (Exception e) {
			System.err.println(e+"\n"+"Error e at altaNouHotel ");
		}
		return resAddHotel;
	}

	private static Hotel[] appendHoteles(Hotel newHotel, Hotel[] hoteles) {
		Hotel[] newHotelsArr = null;

		try {
			ArrayList<Hotel> hotelRes = new ArrayList<Hotel>(Arrays.asList(hoteles));
			String hotelName = newHotel.getNombre();
			boolean itAlreadyExist = false;
			for (Hotel hotel2 : hoteles) {
				String htName = hotel2.getNombre();
				if (hotelName.equals(htName)) {
					itAlreadyExist = true;
					break;
				}
			}
			if (!itAlreadyExist) {
				hotelRes.add(newHotel);
			}

			newHotelsArr = new Hotel[hotelRes.size()];
			newHotelsArr = hotelRes.toArray(newHotelsArr);
		} catch (Exception e) {
			System.err.println(e+"\n"+"Error at appendHotel ");
		}

		return newHotelsArr;
	}

	/*3. Debido a una reciente política de renovaciones de hoteles, todos los hoteles de la empresa que tengan 4 estrelles 
	adquirirán una estrella más. Realizar la funcionalidad necesaria que haga este cambio y actualice el documento hoteles.json.*/
	public static void upgradeHotelsFourStarsToFiveStars(String jsonPath, Gson gson){
		try {
			
		} catch (Exception e) {
			System.err.println("Ha habido un error en la modificacion de 4 a 5 estrellas");
		}
	}

	public void reader(String path) throws IOException {
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
	}

	
	/*4. El grupo hostelero adquirirá a una empresa que es encuentra en concurso de acreedors, la información de los hoteles incluidos 
	en el archivo JSON llamado hoteles_nuevos.json, por lo tanto, el objetivo es integrar estos nuevos hoteles al archivo original hotels.json.*/
	
	
	/*5. Mencionar las ventajas y desventajas, entre los tecnologías GSON y JACKSON vistes en clase para el procesamiento de archivos JSON. (2 puntos) */


}
