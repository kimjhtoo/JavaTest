public class MethodExample2 {

    String name;
    int age;
    String hobby;

////    public MethodExample2 (String _name , int _age , String _hobby) { //매개변수를 받을준비
//        this.name = _name; // this 는 해당 클래스에 선언된 전역변수들을 의미
//        this.age = _age;
//        this.hobby = _hobby;

    public MethodExample2(String name, int age, String hobby) { // Alt + Insert 다음에 생성자를 누르면 전역변수를 쉽게 선언하는것이 가능하다.
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }


    public String getName() { // Alt + Insert 다음에 getter 및 setter 클릭
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

