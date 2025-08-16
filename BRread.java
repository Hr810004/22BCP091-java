import java.io.*;

class BRread{
    public static void main(String[] args) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters or q to quit:");
        do{
            c=(char)br.read();
        }
        while(c!='q');
    }
}