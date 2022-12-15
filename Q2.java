package Assignment2;

public class Q2 {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};  
        
        int k = 3; // 5 1 2 3 4 -- 4 5 1 2 3 -- 3 4 5 1 2
        
        while(k!=0){
            int temp = arr[4];
            
            for(int i=4;i>=1;i--){
                arr[i] = arr[i-1];
            }
        
            arr[0] = temp;
            k--;
        }
        
        for(int i=0; i<5; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}

