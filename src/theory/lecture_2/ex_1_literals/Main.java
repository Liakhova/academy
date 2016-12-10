package theory.lecture_2.ex_1_literals;

public class Main {
    private int x1 = 15;

    public static void main(String[] args) {
        //целочисленные литералы в 10х 8х 16х, 2x системах счисления
        int x1 = 35;
        int x2 = 071;
        int x3 = 0x345;
        int x4 = 0b101001;

        Example.test();

        // для больших чисел
        long y1 = 0xfffffffffL;
        long y2 = 1_000_000_000_000_000L;

        //1 байт, 2 в 8 степени значений
        byte z1 = 120;
        //2 бита, 2 в 16 степени значений
        short z2 = 180;
        //4 бита, 2 в 32 степени значений
        int z3 = 2_000_000_000;
        //8 битов, 2 в 64 степени значений
        long z4 = 1_222_212_121_000_000_000L;

//        System.out.println(1 / 0);

        //дробные числа, или с плавающей точкой
        float x = 5.123123f;
        double y = 5.123123;
        double z = 5.12312E-5;


//        System.out.println(1.0 / 0);
//        System.out.println(0f / 0);


        //В арифметических выражениях автоматически выполняются расширяющие преобразования типа
        // byte -> short -> int -> long -> float -> double


//        int xx = (1 + 2) / 2;
//        System.out.println(xx);


//        double xy = (1 + 2) / 2;
//        System.out.println(xy);


//        int i = 129;
//        byte b = (byte) i;
//        System.out.println(b);


//        byte bb = 1;
//        bb = bb + 127;
//        bb = -bb;

//        boolean bln1 = true;
//        boolean bln2 = false;
//        bln1 = !bln2;

        //символьные литералы - отводится 2 байта памяти, но диапазон значений начинается с 0
        char c1 = 'a';
        char c2 = '\u0001';
        char c3 = '\r'; //переход к началу
        char c4 = '\n'; //новая строка
        char c5 = '\t'; //табуляция

        System.out.println(c1 + 1);


        String s1 = "111";
        String s2 = new String("111");

//        Переменная базового типа, объявленная как член класса, хранит нулевое значение, соответствующее своему типу.
//        Если переменная объявлена как локальная переменная в методе, то перед использованием она обязательно должна
//        быть проинициализирована, так как она не инициализируется по умолчанию нулем.
//        Область действия и время жизни такой переменной ограничена блоком { },в котором она объявлена.
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }
}

