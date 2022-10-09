package semana1.exercicios1.m2s01ex2;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String diaFormat;
    private String mesFormat;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() { return dia; }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String exibirData() {
        if (getDia()<10){
            diaFormat = "0"+dia;
        }else{
            diaFormat = ""+dia;
        }
        if (getMes()<10){
            mesFormat = "0"+mes;
        }else{
            mesFormat = ""+mes;
        }
        return diaFormat + "/" + mesFormat + "/" + this.getAno();
    }
}