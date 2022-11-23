package org.example.structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class BulletRegister {
    private Map<BulletType, Bullet> bulletsRegsiter = new HashMap<>();

    public void registerBullet(BulletType bulletType, Bullet bullet){
        bulletsRegsiter.put(bulletType, bullet);
    }

    public Bullet getBullet(BulletType bulletType){
        return bulletsRegsiter.get(bulletType);
    }

}
