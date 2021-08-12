/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaidem.11
 */
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
        
    public Cilindrica(double radio, double angulo, double z) {
        this.radio = radio;
        this.angulo = angulo;
        this.z = z;
    }
    
    public Cilindrica()
    {
        
    }
    
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public Cilindrica esferica_cilindrica(double x, double y){
        Cilindrica obj = new Cilindrica();
        x = radio * Math.cos(angulo);
        y = radio * Math.sin(angulo);
        z = z;
        return obj;
    }
    
    
    class Esferica{
        private double radio;
        private double angulo;
        private double z;

        public Esferica(double radio, double angulo, double z) {
            this.radio = radio;
            this.angulo = angulo;
            this.z = z;
        }
        
        public Esferica(){
            
        }

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

        public double getZ() {
            return z;
        }

        public void setZ(double z) {
            this.z = z;
        }
        
        public Esferica cilindrica_esferica(double x, double y){
        Cilindrica obj = new Cilindrica();
        x = radio * Math.cos(angulo);
        y = radio * Math.sin(angulo);
        z = z;
        return new Esferica(x, y, z);
    }
    }
}
    
    