import java.io.*;
import java.util.ArrayList;
public class AnimalBespoke {
	   final static String FILE_NAME = "animals.bespoke";
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
	   static ArrayList<Animal> load(String fileName) {
		   ArrayList<Animal> animals=new ArrayList<>();
	  
	        try {
                //TODO: load the bespoke file and return a list of Animals

	            } catch (IOException e) { e.printStackTrace(); }
	       return animals;
	       }

	   public static void main(String[] args) {
	       data = load(FILE_NAME);
	       for (Animal a : data) System.out.println(a);
	   }

}
