package associacao.agregacao.examples.empresa;
import java.util.List;
import java.util.ArrayList;

public class Empresa {
    private String razao, cnpj;
    private List<Departamento> departamentos = new ArrayList<Departamento>();

    public String getRazao(){
        return this.razao;
    }

    public void setRazao(String razao){
        this.razao = razao;
    }

    public String getCnpj(String cnpj){
        return this.cnpj;
    }

    public void setCnpjg(String cnpj){
        this.cnpj = cnpj;
    }

    public List<Departamento> getDepartamento(){
        return this.departamentos;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }



}
