package lab5.service;

import lab5.data.Data;
import lab5.entities.Pet;
import lab5.entities.PetType;
import lab5.entities.Type;

import java.util.Random;
import java.util.Scanner;

public class PetService {
    public void match(Scanner scanner) {
        String choice;
        do {
            System.out.println("Mời bạn nhập thông tin Pet của mình");
            System.out.println("Mời bạn nhập tên:");
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập tuổi");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập giống");
            String species = scanner.nextLine();
            System.out.println("Mời bạn nhập giới tinh:");
            String sex = scanner.nextLine();
            System.out.println("Mời bạn nhập Type của thú cưng (DOG/CAT)");
            PetType type = PetType.valueOf(scanner.nextLine());
            boolean isValidPet = false;
            for (Pet pet : Data.pets) {
                if (pet.getTYPE() == type && !sex.equalsIgnoreCase(pet.getSex())) {
                    Data.petArrayList.add(pet);
                    isValidPet = true;
                }
            }
            if (isValidPet) {
                Random rand = new Random();
                Pet random = Data.petArrayList.get(rand.nextInt(Data.petArrayList.size()));
                System.out.println("Thú cưng có thể phù hợp để ghép đôi");
                System.out.println(random);
            } else {
                System.out.println("Không tìm thấy thú cưng phù hợp");
            }

            System.out.println("Bạn có muốn tìm chú pet khác không (Y/N)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));


    }

}

