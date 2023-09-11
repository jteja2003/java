import java.util.*;

public class Password {
    public static void main(String[] args) {
        int s;
        Scanner x=new Scanner(System.in);
        while(true){
        System.out.println("enter 1 to generate the password or enter 0 :");
        int c=x.nextInt();
        if(c!=0)
        {
           
        System.out.println("enter the size of the password");
        s =x.nextInt();
        String randompass=" ";
        for(int i=0;i<s;i++)
        {
            randompass+=randomChar();
        }
       System.out.println(randompass);

    }
    else{
        System.out.println("THANKYOU");
        break;
    }
        }
x.close();
}
    public static char randomChar() {
        //0-9 int =10 ,26 captial alph =26,26 small alpha=26,10+26+26=62;
        int rand= (int)(Math.random()*62);
        if(rand<=9)
        {
            int ch=rand+48;
            return (char)(ch);

        }
        else if(rand<=35)
        {
            int ch=rand+55;
            return (char)(ch);
        }
        else 
        {
            int ch=rand+61;
            return (char)(ch);
        }
    }

}
