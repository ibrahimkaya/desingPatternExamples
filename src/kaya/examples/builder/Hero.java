package kaya.examples.builder;

/**
 * @Author ibrahim
 * @create 3.10.2020 20:58
 */
public final class Hero {
    private final Proffesion proffesion;
    private final String name;
    private Gender gender;
    private HairType hairType;
    private final Armor armor;
    private final Weapon weapon;

    public Hero(HeroBuilder heroBuilder){
        this.proffesion = heroBuilder.getProffesion();
        this.name= heroBuilder.getName();
        this.gender = heroBuilder.getGender();
        this.hairType = heroBuilder.getHairType();
        this.armor = heroBuilder.getArmor();
        this.weapon = heroBuilder.getWeapon();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "proffesion=" + proffesion +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", hairType=" + hairType +
                ", armor=" + armor +
                ", weapon=" + weapon +
                '}';
    }


}
