public class Person {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private float pay;
    private int age;

    public Person(String fio, String position, String email, String phone, float pay, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("ФИО: "+this.fio);
        System.out.println("Должность: "+this.position);
        System.out.println("Емаил: "+this.email);
        System.out.println("Телефон: "+this.phone);
        System.out.println("Зарплата: "+this.pay);
        System.out.println("Возраст: "+this.age);
    }
}

