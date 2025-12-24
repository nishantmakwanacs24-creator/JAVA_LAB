import java.util.*;
class Student{
    public static int credits(int score){
        int points;
        if (score>90){
            points=10;
        }
        else if(score>=80){
            points=9;
        }
        else if(score>=70){
            points=8;
        }
        else if(score>=60){
            points=7;
        }
        else if(score>=50){
            points=6;
        }
        else{
            points=0;
        }
        return points;
    }
    //main fn
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int credsum=0;
        int pointsum=0;
        float sgpa;
        System.out.println("enter name and usn");
        String name=sc.nextLine();
        String usn=sc.nextLine();
        System.out.println("enter no of subjects");
        int a=sc.nextInt();
        int cred[]=new int[a];
        int marks[]=new int[a];
        int i=0;
        int j=1;
        for (i=0;i<a;i++)
        {
            System.out.println("enter sub"+j+"credits");
            cred[i]=sc.nextInt();
            credsum+=cred[i];
            System.out.println("enter marks obtained");
            marks[i]=sc.nextInt();
            pointsum+=credits(marks[i])*cred[i];
            j++;
        }
        sgpa=pointsum/credsum;
        System.out.println("sgpa="+sgpa);
    }
}