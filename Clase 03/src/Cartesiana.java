public class Cartesiana {
    
    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //* metodo cilindrica_cartesiana
    
    public Cartesiana cilindrica_cartesiana(double radio, double angulo)
    {
        Cartesiana obj = new Cartesiana();
        x = radio*Math.cos(angulo);
        y = radio*Math.sin(angulo);
        return obj;
    } 
    
     public Cartesiana cilindrica_cartesiana(Cilindrica a)
    {
        return cilindrica_cartesiana(a.getRadio(), a.getAngulo());
    }
     
    //* metodo esferica_cartesiana
    
    private double x1, y1, z1;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getZ1() {
        return z1;
    }

    public void setZ1(double z1) {
        this.z1 = z1;
    }
    
    //* metodo
    
    public Cartesiana esferica_cartesiana(double r, double ang, double fi)
    {
        Cartesiana obj = new Cartesiana();
        x1 = r*Math.sin(fi)*Math.cos(ang);
        y1 = r*Math.sin(fi)*Math.sin(ang);
        z1 = r*Math.cos(fi);
        return obj;
    } 
    
    public Cartesiana esferica_cartesiana(Esferica d)
    {
        return esferica_cartesiana(d.getAng(), d.getFi(), d.getR());
    }
}