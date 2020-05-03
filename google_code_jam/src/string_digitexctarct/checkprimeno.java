package string_digitexctarct;

public class checkprimeno {
	
	
	public static void someCode(){


        String s="a15df5hgjyu1frdsff6vgyu7bnjh9asd3";


        int length=s.length();


        char ch;int n;


        for(int i=0;i<length;i++){


                ch=s.charAt(i);


                if(Character.isDigit(ch)){


                        n=Character.getNumericValue(ch);


                        System.out.println("the number is "+n+" and it is "+checkPrime(n));


                }


                


        }


        


}





public static String checkPrime(int n){
	
        if(n==1||n==2||n==3)
        {
        	return "Prime";
        	}


        for(int i=2;i<n;i++)
        {


                if(n%i==0)


                        return "Not Prime";


        }


        return "Prime";


}
public static void main(String[] args) {
	someCode();
}

}
