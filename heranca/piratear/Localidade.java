package piratear;
import java.util.List;
import java.util.ArrayList;

public class Localidade {
    
    private String pais;
    private float latitude, longitude;
    private List<SerMistico> seres = new ArrayList<SerMistico>();


    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public float getLatitude() {
        return latitude;
    }
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    public float getLongitude() {
        return longitude;
    }
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    public List<SerMistico> getSeres() {
        return seres;
    }
    public void setSeres(List<SerMistico> seres) {
        this.seres = seres;
    }

    

}
