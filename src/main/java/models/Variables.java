package models;

public class Variables {
    String a;
    String b;
    int result;

    public String getA(){
        return a;
    }

    public void setA(String a){
        this.a = a;
    }

    public String getB(){
        return b;
    }

    public void setB(String b){
        this.b = b;
    }

    public int getResult(){
        return result;
    }

    public void setResult(int result){
        this.result = result;
    }

    @Override
    public String toString(){
        return "{result = " + result + "}";
    }
}
