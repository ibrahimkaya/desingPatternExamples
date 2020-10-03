package kaya.examples.builder;

public class Main {

    public static void main(String[] args) {
	    Hero myHero = new HeroBuilder(Proffesion.MESMER, "ufuk")
                .withHairType(HairType.WAVY)
                .withArmor(new Armor(100,250))
                .withWeapon(Weapon.SWORD)
                .withGender(Gender.MALE)
                .build();

        System.out.print(myHero.toString());
    }
}
