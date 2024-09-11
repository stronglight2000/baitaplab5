package lab5;

import lab5.data.Data;
import lab5.entities.Pet;
import lab5.entities.PetType;
import lab5.service.PetService;

import java.util.Scanner;

import static lab5.data.Data.initializeData;

public class Main {
    public static void main(String[] args) {
        initializeData();
        Scanner scanner = new Scanner(System.in);
        PetService petService = new PetService();
        petService.match(scanner);

    }
}
