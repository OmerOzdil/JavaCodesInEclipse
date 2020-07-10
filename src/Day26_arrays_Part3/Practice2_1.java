package Day26_arrays_Part3;

import java.util.Scanner;

public class Practice2_1 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length()>=5 && word.length()%2!=0){
            System.out.println(word.substring((word.length()/2)-1,(word.length()/2)+2));
        } else{
            System.out.println("invalid");
        }

    }
}

