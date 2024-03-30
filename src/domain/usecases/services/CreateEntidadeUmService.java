package domain.usecases.services;

import domain.entitys.EntidadeUm;

public class CreateEntidadeUmService {

  public CreateEntidadeUmService() {}

  public EntidadeUm perform(EntidadeUm e) {
    var newEntity = EntidadeUm.instance(e);
    return newEntity;
  }
  
}
