package _p106_Persona;

public class Apoyo extends Persona {
    private String Escolaridad;
    private double Paga;

    public Apoyo() {}
    public Apoyo(Persona persona, String escolaridad, double paga) {
        super(persona.Nombre, persona.Direccion);
        Escolaridad = escolaridad;
        Paga = paga;
    }

    public String getEscolaridad() {
        return Escolaridad;
    }
    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }
    public double getPaga() {
        return Paga;
    }
    public void setPaga(double paga) {
        Paga = paga;
    }
    @Override
    public String toString() {
        return "Apoyo [" + super.toString() + ", Escolaridad=" + Escolaridad + ", Paga=" + Paga + "]";
    }
}