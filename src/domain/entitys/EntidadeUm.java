package domain.entitys;

import java.util.Optional;

import domain.entitysub.ParteA;

public record EntidadeUm (String nome, String sobrenome, ParteA parteA
// , String computado
) {

  // public EntidadeUm {
  //   this(computado: nome + " "+ sobrenome);
  // }

  private static EntidadeUm prepareInstance(String nome, String sobrenome, ParteA parteA) {
    var newEntity = new EntidadeUm(nome, sobrenome, parteA);
    return newEntity;
  }

  public static EntidadeUm instance(EntidadeUm e) {
    var newEntity = EntidadeUm.prepareInstance(e.nome(), e.sobrenome(), e.parteA());
    return newEntity;
  }

  // public String nomeCompleto() {
  //   var formula = nome + " "+ sobrenome;
  //   return formula;
  // }

}

/*
   * CONTEM :
   * composicao: contem composicao de outro objeto, para ter campo de obj aninhado.
   * autoIntancia : contem metodo estatico que o instancia, para evitar propagacao de muitos new pelo codigo - quem precisar usar esta classe nao precisa instancia-la.
  */
