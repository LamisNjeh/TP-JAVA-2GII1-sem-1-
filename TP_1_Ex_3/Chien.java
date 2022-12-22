public class Chien extends Animal implements Crie{
    public Chien(){}
    public boolean isCrie(){
        return true ;
    }
    @Override
    public String getCrie() {
        String c="BawBaw ! " ;
        return c  ;
    }
}
