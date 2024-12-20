import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExercicioCoresHtml {
    public static void main(String[] args) throws Exception{

        String arqName = "Exercicio.html";
        BufferedWriter writer = new BufferedWriter(new FileWriter(arqName));

        String header = "<html><head><title>Tabela de Cores HTML</title>\n" + //
                        "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></head>\n" + //
                        "<body><p>&nbsp;</p><h2 align=\"center\">Tabela de Cores HTML</h2>\n" + //
                        "<table width=\"400\" align=\"center\" border=\"1\">\n" + //
                        "<tbody><tr><th width=\"200\" align=\"center\">Cor</th>\n" + //
                        "<th width=\"200\" align=\"center\">Código Hexadecimal</th></tr>";

        String tbRow = "<tr>" + //
                        "    <td bgcolor=\"#000000\">\n" + //
                        "    </td><td align=\"center\">#000000</td>\n" + //
                        "</tr>";


        String footer = "</tbody></table>\n" + //
                        "</body></html>";


        writer.write(header);
        
        String code = "000000";
        String R = "0", G = "0", B = "0";
        int i = 0, j = 0, k = 0;
        for(i = 0; i < 16; i++){
            for(j = 0; j < 16; j ++){
                for(k = 0; k < 16; k++){
                    R = test(i);
                    G = test(j);
                    B = test(k);
        
                    code = R + "0" + G + "0" + B + "0";
                    tbRow = "<tr>" + //
                    "    <td bgcolor=\"#"+code+"\">\n" + //
                    "    </td><td align=\"center\">#"+code+"</td>\n" + //
                    "</tr>";
        
                    writer.write(tbRow);
                    writer.newLine();
                }
            }
        }

        writer.write(footer);
        writer.close();
    }

    public static String test(int k){
        String a = "";
        a = k +"";
        if(k == 10) a = "A";
        if(k == 11) a = "B";
        if(k == 12) a = "C";
        if(k == 13) a = "D";
        if(k == 14) a = "E";
        if(k == 15) a = "F";
        return a;
    }
}