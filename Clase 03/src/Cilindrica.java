public class Cilindrica {
        private double radio;
        private double angulo;
        private double z;  
        /* crear
        2 formas del constructor: 1 sin parametros 
        y otra con parametros,
        metodos sobrecargados para convertir de 
        cilindrica a esferica
        esferica a cilindrica
        */     
        
    //* Constructors 
    public Cilindrica(double radio, double angulo) {
        this.radio = radio;
        this.angulo = angulo;
    }
    
    public Cilindrica()
    {
        
    }
    
    //* Getters and setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }   
    
    //* metodo cartesiana_cilindrica
    
    public Cilindrica cartesiana_cilindrica (double x, double y){
            
            double radio = Math.sqrt(x*x + y*y);
            double angulo = Math.atan(y/x);
            return new Cilindrica (radio, angulo);
        }
        
        public Cilindrica cartesiana_cilindrica (Cartesiana s)
    {
        return new Cilindrica(s.getX(), s.getY());
    }
        
}