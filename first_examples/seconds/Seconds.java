package first_examples.seconds;

public class Seconds {
    private int hours, minutes, seconds, value;

    public Seconds(int seconds){
        this.value = seconds;
        this.convert();
    }

    public int getHours(){
        return this.hours;
    }
    
    public int getMinutes(){
        return this.minutes;
    }
    
    public int getSeconds(){
        return this.seconds;
    }

    private void convert(){
        if (this.value >= 3600 ){
            this.hours = this.value/3600;
            int resto = this.value%3600;
            if(resto >= 60){
                this.minutes = resto/60;
                this.seconds = resto%60;
            }

            else    
                this.seconds = resto;
        }

        else if (this.value >= 60){
            this.hours = 0;
            this.minutes = this.value/60;
            this.seconds = this.value%60;
        }

        else{
            this.hours = 0;
            this.minutes = 0;
            this.seconds = this.value;
        }
    }

    public void imprimir(){
        System.out.println(this.hours + " horas " + this.minutes + " minutos " 
                            + this.seconds + " segundos ");
    }


}
