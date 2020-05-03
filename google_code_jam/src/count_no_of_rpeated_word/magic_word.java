package count_no_of_rpeated_word;

import java.io.*;
import java.util.Scanner;
class magic_word
{
public static void main(String[] args)
{
	Scanner kb=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s=kb.nextLine();
        int counter=0;
        for(int i=0;i<s.length()-1;i++)
            {
                char a=s.charAt(i);
                char b=s.charAt(i+1);
                int x=(int)a;
                int y=(int)b;
                if(y==x+1)
                    {
                        System.out.println("Magic word!");
                        counter++;
                        break;
                    }
                }
                if(counter==0)
                    {
                        System.out.println("Not a Magic word");
                    }
                }
            }