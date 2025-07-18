package a10_interface_abstract;

import java.util.ArrayList;
import java.util.List;

public class Troll extends NormalMonster implements Healable {
    public Troll(int name, int hp, int attack, String defense) {
        super(name, hp, attack, defense);
    }

    Monster troll = new Monster(6, 18, 120, "트롤");

    // Healable 인터페이스의 규칙에 따라 heal() 메서드를 구현
    @Override
    public void heal() {
        // 최대 체력의 10%를 회복함

    }
}
