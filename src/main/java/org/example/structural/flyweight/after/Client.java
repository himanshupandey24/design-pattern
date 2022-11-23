package org.example.structural.flyweight.after;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        BulletRegister bulletRegister = new BulletRegister();

        Bullet fiveMMBullet = new Bullet();
        fiveMMBullet.setBulletType(BulletType.FIVE_MM);
        bulletRegister.registerBullet(BulletType.FIVE_MM, fiveMMBullet);

        Bullet sevenMMBullet = new Bullet();
        sevenMMBullet.setBulletType(BulletType.SEVEN_MM);
        bulletRegister.registerBullet(BulletType.SEVEN_MM, fiveMMBullet);

        List<FlyingBullet> flyingBulletList = new ArrayList<>();

        for (int i = 0; i < 200000; ++i) {
            System.out.println("Something");
            FlyingBullet flyingBullet = new FlyingBullet();
            flyingBullet.setSpeed(120.);
            // .....
            flyingBullet.setBullet(bulletRegister.getBullet(BulletType.FIVE_MM));
            flyingBulletList.add(flyingBullet);
        }
    }
}
