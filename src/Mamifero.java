public class Mamifero {
    public void setPossuiPelos(boolean possuiPelos) {
        this.possuiPelos = possuiPelos;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public boolean getPossuiPelos() {
        return possuiPelos;
    }

    public String getPorte() {
        return porte;
    }

    private boolean possuiPelos;

    private String porte;
}
