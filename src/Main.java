
import Shapes.*;
import com.sun.xml.internal.ws.addressing.model.ActionNotSupportedException;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String[] Input = new String[20];
        ArrayList<pGroup> Group = new ArrayList<>();
        //ArrayList<ArrayList<pShape>> Group = new ArrayList<>();
        int maxPriority = 0;

        while (true) {
            input = sc.nextLine();
            if (input.equalsIgnoreCase("end")) break;
            Input = input.split(" |\\,|\\;");
        }
    }
}
