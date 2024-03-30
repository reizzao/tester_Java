package domain.usecases.controllers;

import domain.entitys.EntidadeUm;
import domain.usecases.services.CreateEntidadeUmService;

public class CreateEntidadeUmController {

  public CreateEntidadeUmController() {}

  public EntidadeUm execute(EntidadeUm e) {
    var service = new CreateEntidadeUmService();
    var create = service.perform(e);
    return create;
  }
}
