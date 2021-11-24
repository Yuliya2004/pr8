package rtu.mirea.gibo01.pr8;

public class Main {
    Pet pet = new Pet("Рыжик");
    Pet pet1 = new Pet(23,"Дуня");
    Pet pet2 = new Pet();
        System.out.println(pet.getType());
        System.out.println(pet1.getType());
        System.out.println(pet2.getName());

    Cat cat1 = new Cat(12,"Мино");
        System.out.println(cat1.getType() + " " + cat1.getName() + " " + cat1.meow());
}

