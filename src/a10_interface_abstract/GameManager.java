package a10_interface_abstract;

public class GameManager {
    public static void main(String[] args) {
        Monster slime = new Monster(3, 8, 30, "슬라임");
        Monster orc = new Monster(5, 12, 40, "오크");

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
