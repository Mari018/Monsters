package Supernatural.Interface;

import Supernatural.Interface.Monster.Monster;
import Supernatural.Supernatural;

public interface Strikeable {
    public void damageGiven (Supernatural defender);
    public boolean isDead ();
}