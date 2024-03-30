package domain.usecases.controllers.testers;

import domain.entitys.EntidadeUm;
import domain.entitysub.ParteA;
import domain.usecases.controllers.CreateEntidadeUmController;

public class  CreateEntidadeUmTesterDebug  {
  public static void main(String[] args)  {

    // TESTAR CONTROLLER - obs: ENTRADA DE DADOS VIA HARDCODE - PODERIA SER VIA SERVIDOR DE API
    var requestEntidadeUm = new EntidadeUm("nome_1", "sobrenome_1", new ParteA(10.11, 11.12));
    var createController = new CreateEntidadeUmController();
    var created = createController.execute(requestEntidadeUm);

    // PRINTS
    System.out.println(created);
    // System.out.println(created.nomeCompleto());
  }

}