package kaya.examples.builder;

/**
 * @Author ibrahim
 * @create 3.10.2020 21:33
 */
public  class HeroBuilder {
    private final Proffesion proffesion;
    private final String name;
    private Gender gender;
    private HairType hairType;
    private Armor armor;
    private Weapon weapon;

    public HeroBuilder(Proffesion profession, String name) {
        if (profession == null || name == null) {
            throw new IllegalArgumentException("profession and name can not be null");
        }
        this.proffesion = profession;
        this.name = name;
    }

    public HeroBuilder withHairType(HairType hairType) {
        this.hairType = hairType;
        System.out.println(" hair type... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public HeroBuilder withArmor(Armor armor) {
        this.armor = armor;
        System.out.println(" armor setup... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public HeroBuilder withWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(" weapon setup... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public HeroBuilder withGender(Gender gender) {
        this.gender = gender;
        System.out.println(" gender sets... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public Hero build() {
        return new Hero(this);
    }

    public Proffesion getProffesion() {
        return proffesion;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public HairType getHairType() {
        return hairType;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
