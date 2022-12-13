import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        
        //sc.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();
        
        // String s1= "kartik";
        // String s2= "kartik";
        
        String s3 = s1 + s2;

        for(int i=0; i<s3.length(); i++){
            System.out.println(s3.charAt(i));
        }

        if(s1 == s2){
            System.out.println("Both string are equal");
        }
        else{
            System.out.println("not equal");
        }

        sc.close();
        sc2.close();
    }
}
