package Exc_Throwable_lang;

import java.io.*;

public class Try_with_resources {
    public static void main(String[] args) throws IOException {


        try (BufferedReader br = new BufferedReader(
                new FileReader("sample.txt"));
        PrintWriter pw = new PrintWriter("output.txt"))
        {
            String s = br.readLine();
            pw.print("test");

        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("Finallyyy....!");

        }
    }
}
