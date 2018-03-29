package six;

public class threadTest {
    int i = 0;

    public int getI() {
        return i;
    }

    public threadTest setI(int i) {
        this.i =i;
        return new threadTest();
    }
    public threadTest(){
        this.i =i;
    }

    public static void main(String[] args) {
        threadTest t= new threadTest();
        t.setI(1);
        t.setI(2);
        t.setI(3);
        t.setI(4);
        t.setI(5);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t.i);
                for (int a =5; a<10000;a++){
                    if(a>9990)System.out.println("aaaaaa");
                }
                System.out.println(t.i);
            }}).start();
        for (int a =5; a<1000000000;a++){
            t.setI(a);
        }
    }
}
