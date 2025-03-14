class MilitarAeronautica extends Militar implements Carreira {
    private int anosNaPatente;
    private int horasDeVoo;
    
    public MilitarAeronautica(int matricula, String patente, int anosNaPatente, int horasDeVoo) {
        super(matricula, patente);
        this.anosNaPatente = anosNaPatente;
        this.horasDeVoo = horasDeVoo;
    }
    
    public int getAnosNaPatente() {
        return anosNaPatente;
    }
    
    public void setAnosNaPatente(int anosNaPatente) {
        this.anosNaPatente = anosNaPatente;
    }
    
    public int getHorasDeVoo() {
        return horasDeVoo;
    }
    
    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }
    
    @Override
    public boolean podeProgredir() {
        return anosNaPatente > 2 && horasDeVoo > 100;
    }
}
