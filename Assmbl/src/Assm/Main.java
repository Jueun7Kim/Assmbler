package Assm;

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
        MainGUI cmd = new MainGUI();
        
        cmd.start();
    }
}