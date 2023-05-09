import java.time.*;

public class Contato {

  private String nome, email, dataNascimento, telefone;

  Contato (String nome, String email, String telefone, String dataNascimento) {
    setNome(nome);
    setEmail(email);
    setDataNascimento(dataNascimento);
    setTelefone(telefone);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void imprimirContato() {
    System.out.println("Contato:");
    System.out.println("  Nome: " + getNome());
    System.out.println("  E-mail: " + getEmail());
    System.out.println("  Telefone: " + getTelefone());
    System.out.println("  Data de Nascimento: " + getDataNascimento());
    System.out.println("  Idade: " + calcularIdade());
  }

  public int calcularIdade() {
    String[] data = dataNascimento.split("/");
    int[] dataArray = new int[data.length];

    for (int i = 0; i < data.length; i++) {
      dataArray[i] = Integer.parseInt(data[i]);
    }
    
    int idade = Period.between(LocalDate.of(dataArray[2], dataArray[1], dataArray[0]), LocalDate.now()).getYears();

    return idade;
  }
}