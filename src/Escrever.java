
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escrever {

    String nome;

    public Escrever(String nome ){
        this.nome = nome;
    }

    public void fileWrite(long[] tempo, int tamanho){

        try {
            File f = new File("tempos/"+nome+"_"+tamanho+"Elementos.txt");
            FileWriter fw = new FileWriter(f);
            for(int i = 0; i< tempo.length; i++){
                fw.write(tempo[i]+"\n");

            }

            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
