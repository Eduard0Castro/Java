package estoque;

public class Estoque{

    private float custo1, custo2, custo3, venda;
    private int quant1 = 0, quant2 = 0, quant3 = 0;

    public Estoque(){

        custo1 = 34.90f;
        custo2 = 56.80f;
        custo3 = 44.99f;

        for (int i = 0; i < 50; i++){
            quant1++;
        }        
        
        for (int i = 0; i < 25; i++){
            quant2++;
        }        
        
        for (int i = 0; i < 25; i++){
            quant3++;
        }
    }

    public void comprar(String codigo, int quant){
        switch (codigo){

            case "1":
                if (quant <= quant1){
                    System.out.println(String.format("%d de %s vendidos", quant, codigo));
                    quant1 -= quant;
                    this.venda += this.custo1*quant;
                }

                else
                    System.out.println("Quantidade insuficiente do produto requerido");

                break;

            case "2":

                if (quant <= quant2){
                    System.out.println(String.format("%d de %s vendidos", quant, codigo));
                    quant2 -= quant;
                    this.venda += this.custo2*quant;
                }

                else
                    System.out.println("Quantidade insuficiente do produto requerido");

                break;

            case "3":
                if (quant <= quant3){
                    System.out.println(String.format("%d de %s vendidos", quant, codigo));
                    quant3 -= quant;
                    this.venda += this.custo3*quant;
                }

                else
                    System.out.println("Quantidade insuficiente do produto requerido");

                break;

            default:
                System.out.println("Codigo do produto inexistente");
                break;
                    
        }

    }

    public void finalizar(){
        System.out.println(String.format("Total da compra: %.2f", this.venda));
    }

}