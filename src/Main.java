public class Main { public static void main(String[] args) {
    System.out.println("Домашняя работа №2");
    System.out.println("Задача 1");
    var dog=8.0;
    var cat=3.6;
    var paper=763789;
    System.out.println("dog="+dog+"; cat="+cat+"; paper="+paper);

    System.out.println("Задача 2");
    dog=dog+4;
    cat=cat+4;
    paper=paper+4;
    System.out.println("dog="+dog+"; cat="+cat+"; paper="+paper);

    System.out.println("Задача 3");
    dog=dog-3.5;
    cat=cat-1.6;
    paper=paper-7639;
    System.out.println("dog="+dog+"; cat="+cat+"; paper="+paper);

    System.out.println("Задача 4");
    var friend=19;
    System.out.println("friend="+friend);
    friend=friend+2;
    System.out.println("friend="+friend);
    friend=friend/7;
    System.out.println("friend="+friend);

    System.out.println("Задача 5");
    var frog=3.5;
    System.out.println("frog="+frog);
    frog=frog*10;
    System.out.println("frog="+frog);
    frog=frog/3.5;
    System.out.println("frog="+frog);
    frog=frog+4;
    System.out.println("frog="+frog);

    System.out.println("Задача 6");
    var firstBoxer=78.2;
    var secondBoxer=82.7;
    System.out.println("Масса одного боксёра - "+firstBoxer+"кг.");
    System.out.println("Масса второго боксёра - "+secondBoxer+"кг.");
    var totalWeight=firstBoxer+secondBoxer;
    System.out.println("Общая масса боксёров - "+totalWeight+"кг.");
    var differenceWeight=secondBoxer-firstBoxer;
    System.out.println("Разница между массами боксёров - "+differenceWeight+"кг.");

    System.out.println("Задача 7");
    var a=864531;
    var b=48654;
    var g=a%b;
    System.out.println(a+" % "+b+" = "+g);

    System.out.println("Задача 8");
    var workTime=640;
    var workTimeOneWorker=8;
    var workers=workTime/workTimeOneWorker;
    System.out.println("Всего работников в компании - "+workers+" человек");
    workers=workers+94;
    workTime=workers*workTimeOneWorker;
    System.out.println("Если в компании работает "+workers+" человек, то всего "+workTime+" часов работы может быть поделено между сотрудниками");
}
}