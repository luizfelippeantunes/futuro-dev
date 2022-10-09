package semana4.aula1.empresa.models;

public class FuncionarioHorista extends Funcionario {
    private double custoHora;
    private double horasTrabalhadas;

    @Override
    public double calculaSalario() {
        return this.custoHora * this.horasTrabalhadas;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Custo/Hora: R$ " + this.custoHora +
                ". Horas trabalhadas: " + this.horasTrabalhadas + " horas.";
    }

    public double getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(double custoHora) {
        this.custoHora = custoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
