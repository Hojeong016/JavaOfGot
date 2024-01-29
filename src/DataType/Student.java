package DataType;

public class Student {
    public static void main(String[] args) {
        StudentDTO student1 = new StudentDTO();
        StudentDTO student2 = new StudentDTO("호정");
        StudentDTO student3 = new StudentDTO("희진","010-9999-9999");
        StudentDTO student4 = new StudentDTO("호뚜","010-9999-9999","skskfl@naud,dfa");
    //어떻게 보면 다 DTO의 객체들이지만 서로 다른 속성값을 가지고 있다,
        StudentDTO[] students = {student1,student2,student3,student4};
        //향상된 for문
        for( StudentDTO s : students){
            //타입 맞추기
            System.out.println("이름 : " + s.name + "전화번호 : "+s.phone + "이메일 : "+ s.email);
        }

    }
}
