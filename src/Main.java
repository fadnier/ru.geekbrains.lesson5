public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Канунникова Наталья Филипповна", "Инженер", "kannnf@mailbox.com", "892313523", 30000, 30);
        persArray[1] = new Person("Монаков Клавдий Гордеевич", "Сантехник", "manakkg@mailbox.com", "892315234", 50000, 35);
        persArray[2] = new Person("Шишкина Элеонора Мефодиевна", "Секретарь", "shishem@mailbox.com", "892313453", 40000, 60);
        persArray[3] = new Person("Петухова Мария Степановна", "Оператор", "petms@mailbox.com", "892318786", 20000, 50);
        persArray[4] = new Person("Толмачёв Юлиан Елисеевич", "Директор", "tolmyue@mailbox.com", "8923126784", 80000, 40);

        getOld(persArray);
    }

    public static void getOld(Person[] pesonal) {
        for (int i = 0; i < pesonal.length; i++) {
            if(pesonal[i].getAge() > 40) {
                pesonal[i].info();
            }
        }
    }
}
