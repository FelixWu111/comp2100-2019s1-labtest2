import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnimalJson {

	final static String FILE_NAME = "animals.json";
	static ArrayList<Animal> data;
	
	   public static class Animal {
	       String name;
	       String breed;
	       int age;
	       public Animal(String name, String breed, int age) {
	           this.name = name;
	           this.breed = breed;
	           this.age = age;
	       }
	       @Override
	       public String toString() {
	           return name + " is a " + age + " year old " + breed;
	       }
	   }
	   
	
	static ArrayList<Animal> load(String jsonFileName) {
		
		ArrayList<Animal> animals=new ArrayList<>();
		try {
			// TODO: load the JSON file and return a list of Animals


			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return animals;
	}

	public static void main(String[] args) {
		data = load(FILE_NAME);
		for (Animal a : data) System.out.println(a);
	}
}
