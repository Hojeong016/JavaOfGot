package src;

public class ProfilePrint {
    byte age;
    private String name;
    boolean isMarried;


    public void setAge(byte age){
        this.age = age;
    }
    public byte getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setMarried(boolean flag) {
        isMarried = flag;
    }

    public boolean isMarried() {
        return isMarried;
    }
}
class Main {
    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        profile.setAge((byte) 23); //23은 기본적으로 int 타입 따라서 (byte)로 형변환을 해주어야함.
        profile.setName("채호정");
        profile.setMarried(false);

        System.out.println("이름:"+ profile.getName());
        System.out.println("나이:"+ profile.getAge());
        System.out.println("결혼 여부:"+ profile.isMarried());
        //첫 시도 : 모든 값이 기본 값으로 출력됨.
        //원인 : 매개 변수 == 인스턴스 변수명 자기 자신을 나타내는 예약어를 사용해 주지 않았음 (this)
    }
}