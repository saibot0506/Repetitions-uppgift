import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    ArrayList<String> LoggFilen = readLogfile();

    private ArrayList<String> readLogfile() {

        FileReader fr = null;
        ArrayList<String>  meddelande;
        String m2;
        try {
            fr = new FileReader("ideaold.log");
            BufferedReader inFil = new BufferedReader(fr);
            //meddelande += inFil.readLine();
            m2 = inFil.readLine();
            while (m2 != null) {
                // read next line
                // add into instead



                m2 = inFil.readLine();
            }

            inFil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meddelande;

    }

}