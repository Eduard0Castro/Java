package championship;

public class FootballLeague{

    private String localTeam, foreignTeam, vencedor, perdedor, marcGols, sofreGols;
    private int localGols = 0, foreignGols = 0;
    private int vit1 = 0, vit2 = 0, empates = 0, d1 = 0, d2 = 0;

    public FootballLeague(String localTeam, String foreignTeam){
        
        this.localTeam = localTeam;
        this.foreignTeam = foreignTeam;
    }

    public void cadastrarPartida(int foreignGols, int localGols){
        this.localGols += localGols;
        this.foreignGols += foreignGols;

        if (foreignGols > localGols){
            vit2++;
            d1++;
        }
        else if (foreignGols < localGols){
            vit1++;
            d2++;
        }
        else 
            empates++;

    }

    public void estatiscas(){
        this.vencedor = this.analise(vit1, vit2);
        this.marcGols = this.analise(localGols, foreignGols);
        this.perdedor = this.analise(d1, d2);
        this.sofreGols = this.analise(foreignGols, localGols);

        System.out.println(String.format("Maior vencedor: %s \nGols marcados: %s"+
                                         "\nPerdedor: %s \nGols sofridos: %s" + 
                                         "\nEmpates: %d", 
                                         this.vencedor, this.marcGols, this.perdedor, this.sofreGols, this.empates));


    }

    private String analise(int value1, int value2){
        String result = "";
        if(value1 > value2)
            result = this.localTeam;

        else if(value1 < value2)
            result = this.foreignTeam;

        else 
            result = "Empate";

        return result;
    }
    
}