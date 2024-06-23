package file;
import java.util.*;
import java.io.*;

public class outputstream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String a = sc.nextLine();

        try {
            File f = new File("D:\\file handling\\input.txt");
            FileWriter fw = new FileWriter(f);

            if (a.equals("caps")) {
                for (int i = 0; i < st.length(); i++) {
                    char b = st.charAt(i);
                    if (b >= 'A' && b <= 'Z') {
                        fw.write(b);
                    }
                }
            } else if (a.equals("small")) {
                for (int i = 0; i < st.length(); i++) {
                    char c = st.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        fw.write(c);
                    }
                }
            }else if(a.equals("number")) {
            	for(int i=0;i<st.length();i++) {
            		char s=st.charAt(i);
            		if(s>='0'&&s<='9') {
            			fw.write(s);
            		}
            	}
            }else if(a.equals("special")) {
            	for(int i=0;i<st.length();i++) {
            		char d=st.charAt(i);
            		if(!(d >= 'A' && d <= 'Z'||d >= 'a' && d <= 'z'||d >='0'&& d <='9')) {
            			fw.write(d);
            		}
            	}
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
