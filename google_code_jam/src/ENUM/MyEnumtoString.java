package ENUM;

public class MyEnumtoString {
	 
    enum Fruit {
        GRAPE{
            public String toString(){
                return "A grape is a non-climacteric fruit.";
            }
        }, 
        APPLE{
            public String toString(){
                return "The apple is the pomaceous fruit.";
            }
        }, 
        MANGO{
            public String toString(){
                return "The mango is a fleshy stone fruit.";
            }
        }, 
        LEMON{
            public String toString(){
                return "Lemons are slow growing varieties of citrus.";
            }
        } 
    }
     
    public static void main(String a[]){
        System.out.println(Fruit.GRAPE);
        System.out.println(Fruit.APPLE);
        System.out.println(Fruit.MANGO);
    }
}