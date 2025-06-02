package Supernatural.Interface.Monster;

import Supernatural.Interface.Strikeable;
import Supernatural.Supernatural;

public abstract class Monster extends Supernatural implements Strikeable {
    protected MonsterType type;

    public Monster(MonsterType type) {
        this.type = type;
    }


}