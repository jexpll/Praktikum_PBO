package com.Latihan;

// player
class Player{
    String name;
    double health;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health =  health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name );
        System.out.println("Health : " + this.health + " Hp");
        this.weapon.display();
        this.armor.display();
    }
}

// weapon
class Weapon{
    double attackPower;
    String name;
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    void display(){
        System.out.println("Weapon : " + this.name + " , power : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;

    Armor(String name,double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    void display(){
        System.out.println("Armor : " + this.name + " , power : " + this.defencePower);
    }
}


public class Main {
    static void main(String[] args) {
        // Membuat object player
        Player player1 = new Player("ucyup",100);
        Player player2 = new Player("Jokowi", 100);

        // Membuat object weapon
        Weapon pedang = new Weapon("Pedang",15);
        Weapon ketapel = new Weapon("Ketapel", 1);

        // Membuat object armor
        Armor bajuBesi = new Armor("Baju Compang Camping",10);
        Armor bajuEmas = new Armor("Baju Emas", 100);

        // Equip player
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // Player player2
        player2.equipWeapon(ketapel);
        player2.equipArmor(bajuEmas);
        player2.display();
    }
}
