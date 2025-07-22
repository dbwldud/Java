package a10_interface_abstract;

import java.lang.reflect.Parameter;

public class NormalMonster<M> extends Monster {
    public NormalMonster(String 이프리트, int i, int i1, int i2, int i3) {
        super(이프리트, i, i1, i2, i3);
    }

    public NormalMonster(Parameter name, Parameter hp, Parameter attack, Parameter defense, Parameter fireSkillDamage) {
        super(name, hp, attack, defense, fireSkillDamage);
    }

    public NormalMonster(int defense, int attack, int hp, String name) {
        super(defense, attack, hp, name);
    }

    public int attack(Monster target) {
        // ## 로직 설명
        // 20%의 확률로 치명타가 발동하는지 확인합니다.
        // 치명타가 터지면, 공격력 * 2를 하여 피해량을 두 배로 만들고
        // 상대의 방어도를 무시합니다. 특별한 메시지를 출력합니다.
        // 치명타가 터지지 않으면, 기본계산 피해량(공격력 - 상대방어력)만 반환됩니다.
            int damage = 0;
            if (Math.random() < 0.20) {
                System.out.println("치명타공격!! 방어도무시");
                damage = this.attack(getattack(28)) * 2;
            }else {
                damage = Math.max(this.attack(getattack(22)) -
                        target.getDefense(18), 0);
            }
        return damage;
    }

    private Monster getattack(int i) {

        return null;
    }
}
