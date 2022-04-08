import java.util.List;

public class Main {

    //Producer можно достать сам класс и всех родителей.
    public static void someMethod (List<? extends Class3> list) {
        Class4 class4 = list.get(0);
        Class2 class2 = list.get(1);
        //можно положить null
        list.add(null);
    }
    //Consumer можно положить сам класс и наследников
    public static void someMethod2 (List<? super Class3> list) {
        list.add(new Class4());
        list.add(new Class2());
        //вернет Object
        Object object = list.get(0);
    }


}


class Class1{
}
class Class2 extends Class1{
}
class Class3 extends Class2{
}
class Class4 extends Class3{
}
