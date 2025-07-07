package a10_interface_abstract;

import a8_modifier.Modifier1.pack1.A;

public class Monster {

    private String name;
    private int hp;
    private int maxhp;
    private int attack;
    private int defense;

    public Monster(int defense, int attack, int hp, String name) {
        this.defense = defense;
        this.attack = attack;
        this.hp = hp;
        this.maxhp = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void info() {

        System.out.println("이름=" + this.name + " hp=" + this.hp + " maxhp=" + this.maxhp + " attack=" + this.attack + " defense=" + this.defense);
    }
}
