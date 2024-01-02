import java.sql.SQLOutput;

public class profie {
    String name;
    int age;
    public static void main(String [] args){
        profie profile = new profie();
        profile.setName("Min");
        profile.setAge(20);

        profile.printName();
        profile.printAge();
    }

    public void printName(){
        System.out.println("My name is"+ name);
    }
    public void printAge(){
        System.out.println("My age"+age);
    }
    public void setName(String str){
        name=str;
    }

    public int setAge(int val){
        return age = val;
    }
}

//1. static 다른 메소드에 static 값을 주었을 때 인스턴스 변수 부분에 에러가 발생/ static을 사용하지 않고
//메인 메소드로 호출하면 에러가 발생... 다른 메소드에 static 값을 사용하지 않고도 메인 메소드로 호출할 수 있으려면??
/*static을 사용하지 않고 메소드를 호출하려면, 클래스의 인스턴스를 생성하고 그 인스턴스를 통해 메소드를 호출해야 합니다.
객체는 클래스의 인스턴스로 생성되어야만 메소드나 속성을 사용할 수 있습니다. 메소드나 속성은 클래스에 정의되어 있지만, 실제 데이터를 담고 있는 것은 객체입니다.
따라서 프로필 클래스의 경우, 프로필 프로필 = new 프로필(); 코드를 통해 프로필 클래스의 새로운 객체를 생성하고, 이 객체를 통해 메소드를 호출하거나 속성에 접근할 수 있습니다.
객체를 새로 생성함으로써 클래스의 인스턴스가 만들어지고, 그 인스턴스에는 해당 클래스의 모든 특성과 동작이 포함되게 됩니다.
객체를 생성하는 것은 각각의 인스턴스에 대한 독립적인 메모리 공간을 할당하며, 이를 통해 각 객체는 서로 영향을 미치지 않고 독립적으로 작동할 수 있습니다. 객체를 생성하지 않으면 클래스의 정의만 존재하게 되어 실제 데이터나 동작을 처리할 인스턴스가 없게 됩니다.
그럼 프로필이라는 생성자가 이름, 나이의 값을 초기화 해주는 역할을 하는거야?
네, 맞습니다. 일반적으로 클래스에 정의된 생성자(Constructor)는 해당 클래스의 인스턴스를 초기화하는 역할을 합니다. 생성자는 객체가 생성될 때 자동으로 호출되며, 필요한 초기화 작업을 수행합니다.
프로필 클래스의 경우, 생성자가 명시적으로 정의되어 있지 않습니다. 그러나 자바에서는 기본 생성자가 클래스에 명시되지 않았을 경우에도 컴파일러가 자동으로 기본 생성자를 추가해줍니다. 기본 생성자는 매개변수가 없고, 아무 동작도 수행하지 않는 형태입니다.
따라서 프로필 클래스의 객체가 생성될 때, 생성자가 호출되어 인스턴스 변수인 이름과 나이를 초기화할 수 있습니다. 하지만 명시적으로 생성자를 추가한다면 객체가 생성될 때 더 정확한 초기화를 수행할 수 있습니다. 아래는 명시적인 생성자를 추가한 예시입니다:
명시적으로 작성해보기!!!!!
 */
//static 메소드 안에서는 왜 인스턴스 변수를 사용할 수 없어?
/*static 메소드는 클래스 수준에서 호출되는 메소드이며, 특정 인스턴스에 종속되지 않습니다. 따라서 static 메소드 내부에서는 인스턴스 변수에 직접 접근할 수 없습니다.
인스턴스 변수는 객체의 상태를 나타내기 때문에, 해당 인스턴스가 생성되어야 비로소 의미가 있습니다.
반면에 static 메소드는 객체의 상태에 의존하지 않고 클래스 자체에 속한 동작이나 데이터를 다루기 때문에, 인스턴스 변수에 직접 접근할 수 없는 제약이 있습니다.
 */
