public class TestThrow{
    static void checkNum(int num){
        if(num<1){
           throw new ArithmeticException("\n number is negative");
        }
        
        else{
            System.out.println("Square is:" +" " + num*num);
        }
    }



    public static void main(String[] args) {
		
	    TestThrow.checkNum(-3);
	    System.out.println("REST OF THE CODE ......");
		
    }
}

