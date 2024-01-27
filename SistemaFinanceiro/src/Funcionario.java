

/**
 *
 * @author barba
 */

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
 
public class Funcionario {
    private int idFuncionario;
    private String nomeFuncionario;
    private Date nascimentoFuncionario;
    private String setorFuncionario;
    private String cargoFuncionario;
    private String enderecoFuncionario;
    private int numDependentes;
    private String numIdentFiscal;
    private Date admissaoFuncionario;

    
    public static void main(String[] args) {
        

    // Construtor
    public Funcionario ( int idFuncionario, String nomeFuncionario, Date nascimentoFuncionario,
                       String setorFuncionario, String cargoFuncionario, String enderecoFuncionario,
                       int numDependentes, String numIdentFiscal, Date admissaoFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.nascimentoFuncionario = nascimentoFuncionario;
        this.setorFuncionario = setorFuncionario;
        this.cargoFuncionario = cargoFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.numDependentes = numDependentes;
        this.numIdentFiscal = numIdentFiscal;
        this.admissaoFuncionario = admissaoFuncionario;
    }

    // Getters e Setters

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Date getNascimentoFuncionario() {
        return nascimentoFuncionario;
    }

    public void setNascimentoFuncionario(Date nascimentoFuncionario) {
        this.nascimentoFuncionario = nascimentoFuncionario;
    }

    public String getSetorFuncionario() {
        return setorFuncionario;
    }

    public void setSetorFuncionario(String setorFuncionario) {
        this.setorFuncionario = setorFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public String getNumIdentFiscal() {
        return numIdentFiscal;
    }

    public void setNumIdentFiscal(String numIdentFiscal) {
        this.numIdentFiscal = numIdentFiscal;
    }

    public Date getAdmissaoFuncionario() {
        return admissaoFuncionario;
    }

    public void setAdmissaoFuncionario(Date admissaoFuncionario) {
        this.admissaoFuncionario = admissaoFuncionario;
    }

    // Lista para armazenar pagamentos associados a um funcionário
    private final List<Pagamento> pagamentos = new ArrayList<>();

    // Método para cadastrar um pagamento
    public void cadastrarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    // Método para editar um pagamento
    public void editarPagamento(Date dataPagamento, Pagamento novoPagamento) {
        // Implementar lógica para encontrar e substituir o pagamento na lista
    }

    // Método para excluir um pagamento
    public void excluirPagamento(Date dataPagamento) {
        // Implementar lógica para encontrar e remover o pagamento na lista
    }

    // Método para consultar pagamentos
    public List<Pagamento> consultarPagamentos() {
        return pagamentos;
    }
    
}
