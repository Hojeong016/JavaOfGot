package DataType;

public class StudentDTO {
    //DTO : Data Transfer Object (데이터 전달 객체)
    //속성들을 보다 쉽게 전달하기 위해 만든다.

    //StudentDTO의 속성인 인스턴스 변수 선언
    public String name;
    public String phone;
    public String email;

    //기본 생성자(보통 생성자는 인스턴스변수를 선언한고 난 후 메소드 전에 위치 시킨다.
    //아무 속성도 받지 않음
    public StudentDTO() {
    }
    //다양한 매개변수를 지닌 생성자 생성

    //name
    public StudentDTO(String name) {
        this.name = name;
    }

    //name, phone
    public StudentDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    //ALL
    public StudentDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

}



//get, set 메소드 추가해보기
//

