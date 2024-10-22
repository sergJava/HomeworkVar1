public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog= "+ dog + ", cat= " +cat +", paper= " +paper);
        System.out.println("________________________________");

        System.out.println("Task 2");
        dog += 4;
        cat+=4;
        paper+=4;
        System.out.println("dog= "+ dog + ", cat= " +cat +", paper= " +paper);
        System.out.println("_______________________________");

        System.out.println("Task 3");
        dog-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.println("dog= "+ dog + ", cat= " +cat +", paper= " +paper);
        System.out.println("________________________________");

        System.out.println("Task 4");
        var friend = 19;
        System.out.println("friend = " +friend);
        friend +=2;
        System.out.println("friend + 2 = " +friend);
        friend/=7;
        System.out.println("friend / 7 = " +friend);
        System.out.println("________________________________");

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println("frog = "+frog);
        frog*=10;
        System.out.println("frog *10 = "+frog);
        frog/=3.5;
        System.out.println("frog /3.5 = "+frog);
        frog+=4;
        System.out.println("frog +4 = " +frog);
        System.out.println("________________________________");

        System.out.println("Task 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1+boxer2;
        var weightDifferent = boxer2-boxer1;
        System.out.println("общая масса боксеров " + totalWeight);
        System.out.println("разница в весе между боксерами " + weightDifferent);
        System.out.println("________________________________");

        System.out.println("Task 7");
        var remains = boxer2%boxer1;
        System.out.println("остаток от деления = " +remains);
        System.out.println("________________________________");

        System.out.println("Task 7");
        var numberOfEmployees = 640/8;
        System.out.println("Всего работников в компании - "+ numberOfEmployees + " человек.");
        var numberOfEmployees2 = numberOfEmployees + 94;
        var hoursOfWork2 = numberOfEmployees2 * 8;
        System.out.println("Если в компании работает " + numberOfEmployees2 +
                " человек, то всего " + hoursOfWork2 +
                " часов работы может быть поделено между сотрудниками");
        System.out.println("________________________________");
    }
}