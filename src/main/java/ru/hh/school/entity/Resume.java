package ru.hh.school.entity;

import javax.persistence.*;

@Entity
public class Resume {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
  @SequenceGenerator(name = "sequence_generator", sequenceName = "resume_id_seq")
  private Integer id;

  private String description;

  public Resume() {}

  public Resume(String description) {
    this.description = description;
  }

}
