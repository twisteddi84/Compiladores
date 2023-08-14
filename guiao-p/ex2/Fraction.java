public class Fraction{
    private int num,denominador;
    
    
    public Fraction(int num, int denominador){
        this.num = num;
        this.denominador = denominador;
        if(denominador<0){
            this.num = -num;
            this.denominador = -denominador;
        }
    }

    public Fraction(int num){
        this.num = num;
        this.denominador = 1;
    }

    public Fraction(String completo){
        if(completo.contains("/")){
            String[] parts = completo.split("/");
            int num = Integer.parseInt(parts[0]);
            int denominador = Integer.parseInt(parts[1]);
            this.num = num;
            this.denominador = denominador;            
        }else{
            this.num = Integer.parseInt(completo);
            this.denominador = 1;
        }
    }

    public int num(){
        return num;
    }

    public int denominador(){
        return denominador;
    }

    @Override
    public String toString() {
        return ""+num+(denominador == 1 ? "" : "/"+denominador);
    }

    public Fraction reduce(Fraction frac){
        int num = frac.num();
        int denominador = frac.denominador();
        int mdc = mdc(num, denominador);
        Fraction red = new Fraction(num/mdc,denominador/mdc);
        return red;
    }

    private int mdc(int a, int b){
        if(b == 0){
            return a;
        }else{
            return mdc(b,a%b);
        }
    }
}