package lab5.data;

import lab5.entities.Pet;
import lab5.entities.PetType;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Pet> pets = new ArrayList<>();
    public static ArrayList<Pet> petArrayList = new ArrayList<>();

    public static void initializeData() {
        Pet pet = new Pet("Alex", "Corgie", 3, "Male", "Naughty", PetType.DOG, "hehe");
        Pet pet1 = new Pet("Fox", "Chihuahua", 4, "FeMale", "Cute", PetType.DOG, "hehe");
        Pet pet2 = new Pet("Honey", "Poodlee", 2, "Male", "Cute", PetType.DOG, "hehe");
        Pet pet3 = new Pet("Alan", "Alaska", 2, "FeMale", "Smart", PetType.DOG, "hehe");
        Pet pet4 = new Pet("Wong", "Siamese", 1, "Male", "Adorable", PetType.CAT, "hehe");
                /*Pet pet5 =  new Pet("Orange","Scottish Fold",2,"FeMale","Cute", PetType.CAT,"hehe");
        Pet pet6 =  new Pet("Sugar","Sphynx",3,"Male","Ha ha ha", PetType.CAT,"hehe");*/
        Data.pets.add(pet);
        Data.pets.add(pet1);
        Data.pets.add(pet2);
        Data.pets.add(pet3);
        Data.pets.add(pet4);
        /*Data.pets.add(pet5);
        Data.pets.add(pet6);*/
    }

}
