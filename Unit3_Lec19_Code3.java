import java.util.Scanner;

abstract class GameCharacter {

    abstract void attack(int value);
    abstract void defend(int value);
}

class Warrior extends GameCharacter {

    void attack(int strength) {
        System.out.println("Attack: Powerful sword slash dealing " + (strength * 3) + " damage!");
    }

    void defend(int strength) {
        System.out.println("Defend: Raises shield, defence boosted by " + strength + "!");
    }
}

class Wizard extends GameCharacter {

    void attack(int power) {
        System.out.println("Attack: Casts spell causing " + (power * 2) + " magical damage!");
    }

    void defend(int power) {
        System.out.println("Defend: Magic barrier, defence boosted by " + power + "!");
    }
}

class Unit3_Lec19_Code3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        int attributeValue = scanner.nextInt();

        GameCharacter character;

        if (choice == 1) {
            character = new Warrior();
        } else if (choice == 2) {
            character = new Wizard();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println((choice == 1 ? "Warrior" : "Wizard") + " Actions:");

        character.attack(attributeValue);
        character.defend(attributeValue);

        scanner.close();
    }
}