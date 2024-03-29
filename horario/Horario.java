package horario;

public class Horario{
    public String week[][] = new String [10][6];
    public String dia, hora;

    public Horario(){

        week[0][0] = "--         ";
        for (int l = 1; l < 6; l++){
            dia = String.format("%sa feira  ", l+1);
            week[0][l] = dia;
        }

        for (int c = 1; c < 10; c++){
            hora = String.format("%so horario", c);
            week [c][0] = hora;
        
        }

        for (int k = 1; k < 10; k++){
            for (int h = 1; h < 6; h++){
                week[k][h] = "    --    ";
            }
        }
    }

    public void insert(int dia, int horario, String disciplina){
        week[horario][dia-1] = disciplina;
    }

    public void imprime(){
        for (int l = 0; l < 10; l++){
            for (int j = 0; j < 6; j++){
                System.out.print(week[l][j]);
            }
            System.out.println();
        }
    }
     
}