
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escrever {

    String nome;

    public Escrever(String nome ){
        this.nome = nome;
    }

    public void fileWrite(long[][] tempo){

        try {
            File f = new File("tempos/"+nome+"_tempos.csv");
            FileWriter fw = new FileWriter(f);
            for(int i = 0; i< 50; i++){
                fw.write(tempo[0][i]+","+tempo[1][i]+","+tempo[2][i]+","+tempo[3][i]+","+tempo[4][i]+","+"\n");

            }

            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
