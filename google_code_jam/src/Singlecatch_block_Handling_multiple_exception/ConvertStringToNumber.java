package Singlecatch_block_Handling_multiple_exception;

public class ConvertStringToNumber {
    public static void main(String[] args) {
        try {
        	
            // intentional error
            String s = "FOOBAR";
            int i = Integer.parseInt(s);
            // this line of code will never be reached
            System.out.println("int value = " + i);
        }
        catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

}