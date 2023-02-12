import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
    Scanner scanning = new Scanner(System.in);
    private int block;
    private int damage;
    private int healty;
    private int money;
    private String Weapon;
    private String charName;
    private String playerName;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    Inventory inventory = new Inventory(false,false,false,this.getWeapon(),"",3,5);
    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public void selectChar() {
        Character[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Please select the Character");
        for (Character character : charList) {
            System.out.println("Character's name🪪  :" + character.getName() + ", Damage🗡️ :" + character.getDamage() + ", Health💖 :" + character.getHealty() + ",Money💵 :" + character.getMoney() + " Weapon🗡: " + character.getWeapon());
        }
        System.out.println("Please Choose a valid Character");
        int input = scanning.nextInt();
        switch (input) {
            case 1:
                System.out.println("Samurai Choosed");
                gameChar(new Samurai());
                break;
            case 2:
                System.out.println("Archer Choosed");
                gameChar(new Archer());
                break;
            case 3:
                System.out.println("Knight Choosed");
                gameChar(new Knight());
                break;
            default:
                System.out.println("Random Character is Choosing");
                Random random = new Random();
                int rd = random.nextInt(3);
                switch (rd) {
                    case 1:
                        System.out.println("Samurai Choosed");
                        gameChar(new Samurai());
                        break;
                    case 2:
                        System.out.println("Archer Choosed");
                        gameChar(new Archer());
                        break;
                    case 3:
                        System.out.println("Knight Choosed");
                        gameChar(new Knight());
                        break;
                }

        }

    }

    public void gameChar(Character character) {
        this.setDamage(character.getDamage());
        this.setHealty(character.getHealty());
        this.setMoney(character.getMoney());
        this.setCharName(character.getName());
        this.setBlock(character.getBlock());
        this.setWeapon(character.getWeapon());
    }

    public boolean weaponChoose(Weapons weapons) {
        this.setDamage(getDamage() + weapons.getDamage());
        this.setMoney(getMoney() - weapons.getMoney());
        this.setWeapon(weapons.getWeaponName());
        return false;
    }
    public boolean Weapons(Weapons weapons) {
        this.setDamage(getDamage() + weapons.getDamage());
        this.setWeapon(weapons.getWeaponName());
        return false;
    }
    public void Armors(Armors armors) {
        this.setBlock(armors.getBlock());
    }

    public void printPlayerInfo() {
        System.out.println(getPlayerName() + "'s infos");
        System.out.println("Money💵: " + getMoney() + "\n" + "Damage🗡️: " + getDamage() + "\n" + "Block🛡️:" + getBlock() + "\n" + "Health💖: " + getHealty() + "\n" + "Weapon⚔: " + getWeapon());
    }

    public void armorChoose(Armors armors) {

        this.setMoney(getMoney() - armors.getMoney());
        this.setBlock(armors.getBlock());
        System.out.println("Your money amount💵:" + this.getMoney());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
