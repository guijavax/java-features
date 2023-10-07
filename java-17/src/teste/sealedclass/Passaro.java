package teste.sealedclass;

/**
 * @Author: Guilherme
 * @Desc: Essa é a classe selada no permits eu declaro quem pode implementar ou herdar
 */
public sealed interface Passaro permits Canario{

 void teste();
}

/**
 * @Author: Guilherme
 * @Desc: Essa classe filha é obrigada a ser final
 */
 final class Canario implements Passaro {

  @Override
  public void teste() {
   System.out.println("teste");
  }
}


/**
 * @Author: Guilherme
 * @Desc: Essa classe não poder implementar passáro pois não está permitida na lista, pois morcego não é passáro
 */
final class Morcego implements Passaro {
 @Override
 public void teste() {

 }
}