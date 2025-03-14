class MilitarMarinha extends Militar implements Carreira {
    private boolean consertouAviao;
    
    public MilitarMarinha(int matricula, String patente, boolean consertouAviao) {
        super(matricula, patente);
        this.consertouAviao = consertouAviao;
    }
    
    public boolean isConsertouAviao() {
        return consertouAviao;
    }
    
    public void setConsertouAviao(boolean consertouAviao) {
        this.consertouAviao = consertouAviao;
    }
    
    @Override
    public boolean podeProgredir() {
        return consertouAviao;
    }
}