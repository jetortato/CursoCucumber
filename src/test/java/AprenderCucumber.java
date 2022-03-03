import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class AprenderCucumber {

  @Dado("^que criei o arquivo corretamente$")
    public void queCrieiOArquivoCorretamente() throws Throwable{
    System.out.println("qulquer coisaa");
  }
    @Quando("^executá-lo$")
    public void executá_lo()throws Throwable {

    }
    @Entao("^a especificação deve finalizar com sucesso$")
    public void aEspecificaçãoDeveFinalizarComSucesso()throws Throwable {

    }
    private int contador = 0;
  @Dado("^que o valor do contador é (\\d+)$")
  public void queOValorDoContadorÉ(int arg1) throws Throwable {
      contador = arg1;
  }

  @Quando("^eu incrementar em (\\d+)$")
  public void euIncrementarEm(int arg1) throws Throwable {
    contador = contador +arg1;
  }

  @Entao("^o valor do contador será (\\d+)$")
  public void oValorDoContadorSerá(int arg1) throws Throwable {
    System.out.println(arg1);
    System.out.println(contador);
    System.out.println(arg1 == contador);

  }

}
