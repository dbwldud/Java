package a10_interface_abstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    public static void main(String[] args) {
//        Monster slime = new Monster(3, 8, 30, "슬라임");
//        Monster orc = new Monster(5, 12, 40, "오크");
//        Monster goblin = new Monster(4, 12, 50, "고블린");
//        Monster skeleton = new Monster(10, 14, 60, "스켈레톤");
//        Monster troll = new Monster(6, 18, 120, "트롤");
//        Monster golem = new Monster(25, 20, 100, "골렘");
//        Monster wyvern = new Monster(15, 25, 150, "와이번");
//        Monster lich = new Monster(12, 35, 130, "리치");
//        Monster chimera = new Monster(20, 30, 200, "키메라");
//        Monster dragon = new Monster(30, 40, 300, "드래곤");

        List<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Monster(3, 8, 30, "슬라임"));
        monsters.add(new Monster(5, 12, 40, "오크"));
        monsters.add(new Monster(4, 12, 50, "고블린"));
        monsters.add(new Monster(10, 14, 60, "스켈레톤"));
        monsters.add(new Monster(6, 18, 120, "트롤"));
        monsters.add(new Monster(25, 20, 100, "골렘"));
        monsters.add(new Monster(15, 25, 150, "와이번"));
        monsters.add(new Monster(12, 35, 130, "리치"));
        monsters.add(new Monster(20, 30, 200, "키메라"));
        monsters.add(new Monster(30, 40, 300, "드래곤"));

        for (int i = 0; i <= 9; i++) {
            System.out.println(i + " : " + monsters.get(i).getName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 몬스터 : ");
        Monster first = monsters.get(scanner.nextInt());
        System.out.println("두번째 몬스터 : ");
        Monster second = monsters.get(scanner.nextInt());

        int turn = 1;

        while (first.getHp() > 0 && second.getHp() > 0) {
            System.out.println("n==== 턴 " + turn + " ====");

            int damageToSlime = Math.max(0, second.getAttack() - first.getDefense(18));
            first.setHp(Math.max(first.getHp() - damageToSlime, 0));
            System.out.println(second.getName() + "이(가) " + first.getName() + "을(를) 공격! 피해: " + damageToSlime + ", 남은 HP: " + first.getHp());

            // 만약에 슬라임이 이미 hp가 없으면 오크를 공격할 수 없어야 함
            if (first.getHp() <= 0)
                break;

            int damageToOrc = Math.max(0, first.getAttack() - second.getDefense(18));
            second.setHp(Math.max(second.getHp() - damageToOrc, 0));
            System.out.println(first.getName() + "이(가) " + second.getName() + "을(를) 공격! 피해: " + damageToOrc + ", 남은 HP: " + second.getHp());

            turn++;

            try {
                // 1000 밀리초 = 1초 동안 실행을 멈춥니다.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // sleep 도중 방해를 받았을 때 처리할 코드를 여기에 작성할 수 있습니다.
                // 지금은 비워두어도 괜찮습니다.
                e.printStackTrace();
            }
        }

        System.out.println();
        System.out.println("최종승자는 : ");
        if (second.getHp() > 0)
            second.info();
        else first.info();

        // Math.random()은 0.0 이상 1.0 미만의 실수를 반환합니다.
        // 따라서 if (Math.random() < 0.2) 코드는 20% 확률로 true가 됩니다.

        if (Math.random() < 0.2) {
            // 20% 확률로 실행될 코드
        }
    }
}
