enum Weapon{};

abstract class Droid {

    private double health;
    private double attack;
    private double luck;
    private String specialty;
    private String[] upgraded_weapon;
    private int isAlive;

    Droid();

    abstract void Attack();

    abstract void Special_Attack();

    abstract void Choose_Weapon();

    abstract void Celebration();




}
