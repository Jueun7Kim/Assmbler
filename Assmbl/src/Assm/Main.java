package Assm;

import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static Map<String, String> registers = new HashMap<>();
    public static ArrayList<String> stack = new ArrayList<>();
    public static int ZF = 0;
    public static int CF = 0;
    public static int i = 0;
    

    	
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Parser Ps = new Parser();
        String assmline;
        
        System.out.println("_start:");
        while(true) {
        	System.out.print("    ");
            assmline = Sc.nextLine();
            Ps.assmparser(assmline);
        }
    }
}