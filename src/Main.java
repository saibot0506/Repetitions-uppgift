import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> LoggFilen = readLogfile();
        System.out.println(LoggFilen.get(0));
    }


    private static ArrayList<String> readLogfile() {

        FileReader fr = null;
        ArrayList<String>  meddelande = new ArrayList<>();
        String m2;
        try {
            fr = new FileReader("ideaold.log");
            BufferedReader inFil = new BufferedReader(fr);
            //meddelande += inFil.readLine();
            m2 = inFil.readLine();
            while (m2 != null) {
                // add into instead
                meddelande.add(m2);
                // read next line
                m2 = inFil.readLine();
            }

            inFil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meddelande;

    }

}