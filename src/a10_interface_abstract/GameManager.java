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
        Monster slime = monsters.get(scanner.nextInt());
        System.out.println("두번째 몬스터 : ");
        Monster orc = monsters.get(scanner.nextInt());
        System.out.println("세번째 몬스터 : ");
        Monster goblin = monsters.get(scanner.nextInt());
        System.out.println("네번째 몬스터 : ");
        Monster skeleton = monsters.get(scanner.nextInt());
        System.out.println("다섯번째 몬스터 : ");
        Monster troll = monsters.get(scanner.nextInt());
        System.out.println("여섯번째 몬스터 : ");
        Monster golem = monsters.get(scanner.nextInt());
        System.out.println("일곱번째 몬스터 : ");
        Monster wyvern = monsters.get(scanner.nextInt());
        System.out.println("여덟번째 몬스터 : ");
        Monster lich = monsters.get(scanner.nextInt());
        System.out.println("아홉번째 몬스터 : ");
        Monster chimera = monsters.get(scanner.nextInt());
        System.out.println("열번째 몬스터 : ");
        Monster dragon = monsters.get(scanner.nextInt());

        int turn = 1;

        while (slime.getHp() > 0 && orc.getHp() > 0) {
            System.out.println("n==== 턴 " + turn + " ====");

            int damageToSlime = Math.max(0, orc.getAttack() - slime.getDefense());
            slime.setHp(Math.max(slime.getHp() - damageToSlime, 0));
            System.out.println(orc.getName() + "이(가) " + slime.getName() + "을(를) 공격! 피해: " + damageToSlime + ", 남은 HP: " + slime.getHp());

            // 만약에 슬라임이 이미 hp가 없으면 오크를 공격할 수 없어야 함
            if (slime.getHp() <= 0)
                break;

            int damageToOrc = Math.max(0, slime.getAttack() - orc.getDefense());
            orc.setHp(Math.max(orc.getHp() - damageToOrc, 0));
            System.out.println(slime.getName() + "이(가) " + orc.getName() + "을(를) 공격! 피해: " + damageToOrc + ", 남은 HP: " + orc.getHp());

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
        if (orc.getHp() > 0)
            orc.info();
        else slime.info();
    }
}
