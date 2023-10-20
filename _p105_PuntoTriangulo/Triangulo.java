package _p105_PuntoTriangulo;

public class Triangulo {
    Punto V1, V2, V3;    


    Triangulo(){}
    Triangulo(Punto v1, Punto v2, Punto v3){
        this.V1 = v1; this.V2 = v2; this.V3 = v3;
    }


    public Punto getV1() {
        return V1;
    }
    public void setV1(Punto v1) {
        V1 = v1;
    }
    public Punto getV2() {
        return V2;
    }
    public void setV2(Punto v2) {
        V2 = v2;
    }
    public Punto getV3() {
        return V3;
    }
    public void setV3(Punto v3) {
        V3 = v3;
    }
    public double getPerimetro(){
        double Perimetro = V1.getDistancia(V2) + V1.getDistancia(V3) + V2.getDistancia(V3);
        return Perimetro;
    }
    public String getTipo(){
        if(V1.getDistancia(V2) == V1.getDistancia(V3) && V2.getDistancia(V3) == V1.getDistancia(V2)){
            return "Equilatero";

        }
        else{
            if (V1.getDistancia(V2) == V1.getDistancia(V3) || V2.getDistancia(V3) == V1.getDistancia(V2) || V2.getDistancia(V3) == V1.getDistancia(V3)){
                return "Isoceles";
            }
            else{return "Escaleno";}
        }
    }
    public String toString(){
        return String.format("[" + "V1=" + V1.toString() + ", V2="+ V2.toString() + ", V3=" + V3.toString() + "]");
    }
}