import java.util.Random;
public class PasswordGenarator {
    public static void main(String[] args){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String integer="0123456789";
        String all=upper+lower+integer;
        int r1;
        String s1="";
        Random rand1=new Random();
        r1=rand1.nextInt(25);
        s1=upper.substring(r1,r1+1);
        r1=rand1.nextInt(25);
        s1=s1+lower.substring(r1,r1+1);
        r1=rand1.nextInt(9);
        s1=s1+integer.substring(r1,r1+1);
        for(int i=0;i<5;i++){
            r1=rand1.nextInt(61);
            s1=s1+all.substring(r1,r1+1);
        }
        System.out.println(s1);
    }
}