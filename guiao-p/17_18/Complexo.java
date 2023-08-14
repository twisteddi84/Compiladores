public class Complexo{
    private int real;
    private int imag;

    public Complexo(int real, int imag){
        this.real = real;
        this.imag = imag;
    }


    public int real(){
        return real;
    }

    public int imag(){
        return imag;
    }

    @Override
    public String toString() {
        if(this.imag==0){
            return "" + this.real;
        }else if(this.imag<0){
            return "" + this.real + "-" + this.imag + "i";
        }else{
            return "" + this.real + "+" + this.imag + "i";
        }
    }
}