package practice.lec10;

public class JavaPenguin extends JavaAnimal implements JavaSwimable, JavaFlyable{
    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount=2;
    }

    @Override
    public void move(){
        System.out.println("뒤뚱뒤뚱 펭귄");
    }

    @Override
    public int getLegCount() {
        return super.legCount+this.wingCount;
    }

    @Override
    public void act(){
        JavaSwimable.super.act();
        JavaFlyable.super.act();
    }
}
