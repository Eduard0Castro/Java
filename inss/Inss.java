package inss;

public class Inss{
    private String matricula, nome;
    private int horas;
    private float salario_base, salario_hora, sal_total, imposto_total, imp_renda;
    private float desc_inss = 0.09f;
    private float imposto_rendav = 0.15f;

    public Inss (String name, String matricula, float salario_hora, int horas){

        this.nome = name;
        this.matricula = matricula;
        this.salario_hora = salario_hora;
        this.salario_base = 40*salario_hora;
        this.horas = horas;
        this.calculos_totais();

    }

    private void calculos_totais(){
        this.sal_total = this.salario_hora*this.horas + this.salario_base;
        this.imp_renda = this.imposto_rendav*(this.salario_base - this.salario_base*this.desc_inss);
        this.imposto_total = this.desc_inss*this.salario_base + this.imp_renda;
        
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome + "\nMatricula: " + this.matricula + 
                            "\nSalario base: " + this.salario_base + "\nSalario total: " + 
                            this.sal_total +  "\nImposto de renda: " + this.imp_renda
                            + "\nImposto total: " + this.imposto_total);
    }


}