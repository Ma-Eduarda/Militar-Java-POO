abstract class Militar {
    protected int matricula;
    protected String patente;
    
    public Militar(int matricula, String patente) {
        this.matricula = matricula;
        this.patente = patente;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getPatente() {
        return patente;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public abstract boolean podeProgredir();
    
    public void promover() {
        System.out.println("Militar " + matricula + " promovido!");
    }
}
