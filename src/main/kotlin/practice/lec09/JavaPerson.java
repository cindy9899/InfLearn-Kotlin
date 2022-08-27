package practice.lec09;

public class JavaPerson {
    private final String name; //초기화를 해야한다.
    private int age;

    public JavaPerson(String name, int age) { //생성자
        if(this.age<=0){
            throw new IllegalArgumentException(String.format("나이는 %s일 수 없다.", this.age));
        }
        this.name=name;
        this.age=age;

    }

    public String getName() { //getter
        return name;
    }
    public int getAge() { //getter
        return age;
    }
    
    public void setAge(int age) { //setter
        this.age=age;
    }


}
