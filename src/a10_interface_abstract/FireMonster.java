package a10_interface_abstract;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class FireMonster extends Monster {
    Parameter fireSkillDamage;
    Parameter name;
    Parameter hp;
    Parameter attack;
    Parameter defense;

    @Override
    public int attack(Monster target) {
        // 이제 attack 메서드는 먼저 기본 공격을 항상 수행하고 피해량을 계산합니다.
        // 그다음 35% 확률로 스킬이 발동됩니다.
        // 스킬이 발동되면 기존에 계산된 damage에 스킬 피해량을 누적하여 더해줍니다.
        // 따라서 스킬은 이제 공격을 대체하는 것이 아닌, 강력한 '추가타' 개념이 됩니다.
        // 최종 계산된 피해량을 반환합니다.
        int damage = Math.max(this.getAttack() -
                target.getDefense(), 0);
        if (Math.random() < 0.35) {
            System.out.println("화염공격 !!");
            damage += fireSkillDamage;
        }
        return damage;
    }

    public FireMonster(Parameter name, Parameter hp,
                       Parameter attack, Parameter defense, Parameter fireSkillDamage) {
        super(name, hp, attack, defense, fireSkillDamage);
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.fireSkillDamage = fireSkillDamage;

        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Monster("이프리트", 140, 22, 18, 35));
        monsters.add(new Monster("헬하운드", 90, 28, 10, 25));
        monsters.add(new Monster("파이어 골렘", 180, 25, 22, 20));
    }
}
