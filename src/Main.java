public class Main {
    public static void main (String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();

    }
    public static void Task1 () {
        // Задание 1
        int age = 17;
        if (age == 18) {
            System.out.println("Поздравляю с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил");
        }
    }
    public static void Task2 () {
        int age = 25;
        if (age >= 7 && age <= 17) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age <= 23) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");

        }
    }
    public static void Task3 () {
        int places = 102;
        int people = 67;
        int seatPlaces = 60;
        if (seatPlaces > people) {
            System.out.println("Есть сидячее место в вагоне");
        }
        if (seatPlaces < people && people <= places) {
            System.out.println("Остались стоячие места");
        }
        if (people > places) {
            System.out.println("Вагон полностью забит");

        }
    }
    public static void Task4 () {
        int age = 17;
        if (age == 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил");
        }
    }
    public static void Task5 () {
        int age = 25;
        if (age >= 7 && age <= 17) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age <= 23) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }

    public static void Task6 () {
        int places = 102;
        int people = 120;
        int seatPlaces = 60;
        if (seatPlaces > people) {
            System.out.println("Есть сидячее место в вагоне");
        } else if (seatPlaces < people && people <= places) {
            System.out.println("Остались стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }
    public static void Task7 () {
        int age = 8;
        String text1 = "в детский сад";
        String text2 = "в школу";
        String text3 = "в университет";
        String text4 = "на работу";
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить " + text1);
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить " + text2);
        } else if (age > 18 && age <=24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить " + text3);
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить " + text4);
            
        }

    }
    public static void Task8 () {
        int age = 15;
        if (age >= 0 && age <= 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (age > 5 && age <= 14) {
            System.out.println("Кататься можно только в сопровождении взрослого");
        } else {
            System.out.println("Можно кататься без сопровождения взрослого");
        }
    }
    public static void Task9 () {
        int one = 1;
        int two = 18;
        int three = -6;
        if (one > two && one > three) {
            System.out.println("Число one - большее");
        } else if (two > one && two > three) {
            System.out.println("Число two - большее");
        } else {
            System.out.println("Число three - большее");
        }

    }
}