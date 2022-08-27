package practice.lec13;

public class JavaHouse {
    private String address;
    private LivingRoom livingRoom;

    public JavaHouse(String address){
        this.address=address;
        this.livingRoom=new LivingRoom(10);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public class LivingRoom { //중첩 클래스 - 내부 클래스
        //public class static LivingRoom으로 정의되면 바깥 클래스와 연결될 수 없다.
        private double area;

        public LivingRoom(double area){
            this.area=area;
        }

        public String getAddress() {
            return JavaHouse.this.address;
        }
    }
}
