package a10_interface_abstract;

public class Hellhound extends FireMonster implements Healable {

    public Hellhound(int name, String hp, int attack, int defense, int fireSkillDamage) {
        super(hp, attack, defense, fireSkillDamage, name);
    }
    
    Monster hellhound = new Monster(90, 28, 10, 25, "헬하운드");

    // Healable 인터페이스의 규칙에 따라 heal() 메서드를 구현
    @Override
    public  void heal() {
        // 최대 체력의 20%를 회복함
    }
}
