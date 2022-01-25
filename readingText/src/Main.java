import com.sun.source.tree.BreakTree;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> sentences = new ArrayList<>();
        String wholeText = "";
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            wholeText = wholeText + line;
        }
        br.close();
        int track = 0;
        for (int i = 0; i < wholeText.length() - 3; i++) {
            if (wholeText.charAt(i) == '.'){
                if (!wholeText.substring(i - 1, i + 3).equals("e.g.") && !wholeText.substring(i - 3, i + 1).equals("e.g.")){
                    sentences.add(wholeText.substring(track,i+1));
                    track = i + 1;
                }
            }
        }
        sentences.add(wholeText.substring(track, wholeText.length()));

        for(String s : sentences){
            System.out.println(s);
        }
        FileWriter fw = new FileWriter("out.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String s : sentences){
            bw.write(s + "\r");

        }
        bw.close();

        findWord("language",sentences);
    }

    public static void findWord(String word, ArrayList<String> sentences){
        for (int i = 0; i < sentences.size(); i++) {
            String[] words = sentences.get(i).split(" ");
            for (int j = 0; j < words.length; j++) {
                if (word.equals(words[j])) {
                    System.out.println("Sentences Location: " + j);
                    System.out.println("Word Location within the sentence: " + i);
                }
            }
        }
    }
}





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
//
// thanks alec