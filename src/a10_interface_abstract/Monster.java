package a10_interface_abstract;

import java.lang.reflect.Parameter;

public class Monster  {
    int attack(Monster target) {
        return 0;
    }

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

    public Monster(Parameter name, Parameter hp, Parameter attack, Parameter defense, Parameter fireSkillDamage) {
    }

    public Monster(String 이프리트, int i, int i1, int i2, int i3) {
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

    public int getDefense(int i) {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void info() {

        System.out.println("이름=" + this.name + " hp=" + this.hp + " maxhp=" + this.maxhp + " attack=" + this.attack + " defense=" + this.defense);
    }
}
