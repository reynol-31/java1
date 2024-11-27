package pkg1;
class MyRunnable implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(500);
            System.out.println("Thread"+Thread.currentThread().getId()+"running");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
public class TestThreads {
    public static void main(String[] args) {
        MyRunnable mr1=new MyRunnable();
        Thread thread1=new Thread(mr1);
        Thread thread2=new Thread(mr1);
        Thread thread3=new Thread(mr1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
