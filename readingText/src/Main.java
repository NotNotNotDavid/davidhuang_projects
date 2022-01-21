import javax.crypto.AEADBadTagException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
////        byte[] data = new byte[10];
////        System.out.println("type in one key");
////        System.in.read(data);
////        for (byte b : data) {
////            System.out.println("Byte: " + b + "\tChar: " + (char) b);
////        }
//        FileInputStream in;
//        FileOutputStream out;
//        in = new FileInputStream("in.txt");
//        out = new FileOutputStream("out.txt");
//        int c;
//        while (( c = in.read()) != -1){
//            out.write(c);
//        }
//        String addToFile = "\rAdding another line";
//        byte[] adding = addToFile.getBytes();
//        for (byte b : adding){
//            out.write(b);
//        }

        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            System.out.println("Just Read: " + line);
            lines.add(line);
        }
        br.close();
        for(String s : lines){
            System.out.println(s);
        }
        FileWriter fw = new FileWriter("out.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Writing to OUT file from IN file");
        for (String s : lines){
            bw.write(s + "\r");

        }
        bw.close();
    }
}
