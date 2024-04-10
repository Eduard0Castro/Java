package first_examples.conversion;

public class Conversion {
    private float number;
    private float conversion;

    public Conversion(float value){
        this.number = value;
    }
    
    public float conversionFunction(String unidade_base, String unidade_destino){

        if (unidade_base == "mm"){
            switch (unidade_destino) {
                case "cm":
                    conversion = this.number/10;
                    break;

                case "m":
                    conversion = this.number/1000;
                    break;

                case "km":
                    conversion = this.number/100000;
                    break;

                case "inch":
                    conversion = (this.number/10)*2.54f;
                    break;

                case "foot":
                    conversion = (this.number/10)*30.48f;
                    break;

                case "mile":
                    conversion = (this.number/1000)*1.91f;

                default:
                    System.out.println("Unidade de destino inválida");
                    break;
            }
        }

        else if (unidade_base == "cm"){
            switch (unidade_destino) {
                case "mm":
                    conversion = this.number*10;
                    break;

                case "m":
                    conversion = this.number/100;
                    break;

                case "km":
                    conversion = this.number/10000;
                    break;

                case "inch":
                    conversion = (this.number)*2.54f;
                    break;

                case "foot":
                    conversion = (this.number)*30.48f;
                    break;

                case "mile":
                    conversion = (this.number)*1.91f;

                default:
                    System.out.println("Unidade de destino inválida");
                    break;
            }
        }

        else if (unidade_base == "m"){
            switch (unidade_destino) {
                case "mm":
                conversion = this.number*1000;
                break;

                case "cm":
                    conversion = this.number*100;
                    break;

                case "km":
                    conversion = this.number/1000;
                    break;

                case "inch":
                    conversion = (this.number*100)*2.54f;
                    break;

                case "foot":
                    conversion = (this.number*100)*30.48f;
                    break;

                case "mile":
                    conversion = (this.number*100)*1.91f;

                default:
                    System.out.println("Unidade de destino inválida");
                    break;
            }
        }

        else{
            throw new IllegalArgumentException("Unidade de medida invalida: "+ unidade_base);
        }

        return conversion;
    }

    public float getOriginalNumber(){
        return this.number;
    }
}
