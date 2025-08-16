import java.io.*;
public class BRreadfile {
    public static void main(String[] args) throws IOException{
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin = new FileInputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\codes\\22BCP091 java\\harsh");
            fout = new FileOutputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\codes\\22BCP091 java\\new.txt");
        }
        catch(Exception e){
            System.out.println(e);
            return;
        }
        do{
            i = fin.read();
            System.out.print((char)i);
            fout.write((char)i);
        }
        while(i!=-1);
        fin.close();
        fout.close();
    }
}
