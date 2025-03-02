public class Main{
    public static void main(String[] args){
        for(int i=100;i<1000;i++)
        if(isprime(i))
        {
            System.out.print(i+ " ");
        }
    }
    public static boolean isprime(int i){
        int c=0;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            c++;
        }
        return c==0;
    }
}
