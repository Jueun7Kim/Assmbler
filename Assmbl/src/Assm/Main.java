package Assm;

import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static Map<String, String> registers = new HashMap<>();
    public static int ZF = 0;
    public static int CF = 0;
    public static int i = 0;
    public static ArrayList<String> stack = new ArrayList<>();
    

    	
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Parser Ps = new Parser();
        String assmline;
        
        
        while(true) {
            i++;
            System.out.print("line " + i + " >");
            assmline = Sc.nextLine();
            Ps.assmparser(assmline);
        }
    }
}
