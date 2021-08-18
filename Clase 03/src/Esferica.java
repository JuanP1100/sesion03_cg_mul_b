public class Esferica {
    
        private double r;
        private double ang;
        private double fi;
        
    //* Constructors
        
        public Esferica(){
            
        }

    public Esferica(double radio, double angulo, double fi) {
        this.r = r;
        this.ang = ang;
        this.fi = fi;

    }

    //* getters and setters
    
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getAng() {
        return ang;
    }

    public void setAng(double ang) {
        this.ang = ang;
    }

    public double getFi() {
        return fi;
    }

    public void setFi(double fi) {
        this.fi = fi;
    }

    //* metodo cartesiana_esferica

    public Esferica cartesiana_esferica (double x, double y, double z){
            
            double radio = Math.sqrt(x*x + y*y + z*z);
            double angulo = Math.atan(y/x);
            double fi = Math.atan((Math.sqrt(x*x + y*y))/z);
            return new Esferica (r, ang, fi);
        }
        
        public Esferica cartesiana_esferica (Cartesiana s)
    {
        return new Esferica(s.getX1(), s.getY1(), s.getZ1());
    }
  
 }