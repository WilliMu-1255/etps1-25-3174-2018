package sv.edu.utec.recicleview;

public class Modelo {
    private String NoombPeli;
    private String GeneroPeli;
    private String DirecPeli;
    private String AnioPeli;
    private String ImgPeli;
    private String duraPeli;
    private String fechPeli;
    private double clasificar;


    public String getNoombPeli() {
        return NoombPeli;
    }

    public void setNoombPeli(String noombPeli) {
        NoombPeli = noombPeli;
    }

    public String getGeneroPeli() {
        return GeneroPeli;
    }

    public void setGeneroPeli(String generoPeli) {
        GeneroPeli = generoPeli;
    }

    public String getDirecPeli() {
        return DirecPeli;
    }

    public void setDirecPeli(String direcPeli) {
        DirecPeli = direcPeli;
    }

    public String getAnioPeli() {
        return AnioPeli;
    }

    public void setAnioPeli(String anioPeli) {
        AnioPeli = anioPeli;
    }

    public String getImgPeli() {
        return ImgPeli;
    }

    public void setImgPeli(String imgPeli) {
        ImgPeli = imgPeli;
    }

    public String getDuraPeli() {
        return duraPeli;
    }

    public void setDuraPeli(String duraPeli) {
        this.duraPeli = duraPeli;
    }

    public String getFechPeli() {
        return fechPeli;
    }

    public void setFechPeli(String fechPeli) {
        this.fechPeli = fechPeli;
    }

    public double getClasificar() {
        return clasificar;
    }

    public void setClasificar(double clasificar) {
        this.clasificar = clasificar;
    }
}
