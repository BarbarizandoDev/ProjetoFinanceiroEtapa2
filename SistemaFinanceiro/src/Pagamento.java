
/**
 *
 * @author barba
 */

import java.util.Date;
import java.util.List;

public class Pagamento {
    private Date dataPagamento;
    private double salarioBase;
    private double horasTrabalhadas;
    private double valorHorasExtras;
    private double valorFalta;
    private double valorTransporte;
    private double valorAlimentacao;
    private double outrosDescontos;
    private double valorTotal;

    // Construtor
    public Pagamento(Date dataPagamento, double salarioBase, double horasTrabalhadas,
                     double valorHorasExtras, double valorFalta, double valorTransporte,
                     double valorAlimentacao, double outrosDescontos, double valorTotal) {
        this.dataPagamento = dataPagamento;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHorasExtras = valorHorasExtras;
        this.valorFalta = valorFalta;
        this.valorTransporte = valorTransporte;
        this.valorAlimentacao = valorAlimentacao;
        this.outrosDescontos = outrosDescontos;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(double valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public double getValorFalta() {
        return valorFalta;
    }

    public void setValorFalta(double valorFalta) {
        this.valorFalta = valorFalta;
    }

    public double getValorTransporte() {
        return valorTransporte;
    }

    public void setValorTransporte(double valorTransporte) {
        this.valorTransporte = valorTransporte;
    }

    public double getValorAlimentacao() {
        return valorAlimentacao;
    }

    public void setValorAlimentacao(double valorAlimentacao) {
        this.valorAlimentacao = valorAlimentacao;
    }

    public double getOutrosDescontos() {
        return outrosDescontos;
    }

    public void setOutrosDescontos(double outrosDescontos) {
        this.outrosDescontos = outrosDescontos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Métodos para cadastrar, editar, excluir e consultar pagamentos
    public static void cadastrarPagamento(Funcionario funcionario, Pagamento pagamento) {
        funcionario.cadastrarPagamento(pagamento);
    }

    public static void editarPagamento(Funcionario funcionario, Date dataPagamento, Pagamento novoPagamento) {
        funcionario.editarPagamento(dataPagamento, novoPagamento);
    }

    public static void excluirPagamento(Funcionario funcionario, Date dataPagamento) {
        funcionario.excluirPagamento(dataPagamento);
    }

    public static List<Pagamento> consultarPagamentos(Funcionario funcionario) {
        return funcionario.consultarPagamentos();
    }
}
