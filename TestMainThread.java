package pkg1;
class Mythread extends Thread{
    public Mythread(String name){
        super(name);
        start();
    }
public void run(){
    for(int i=1;i<=5;i++){
        System.out.println("child Thread: "+i);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Child thread interrupted");
        }
    }
}
}
public class TestMainThread {
    public static void main(String[] args) {
        Mythread mythread=new Mythread("childThread");
        for(int i=0;i<=5;i++){
            System.out.println("Main Thread"+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Main thread interrupted: ");
            }
        }
    }
}
