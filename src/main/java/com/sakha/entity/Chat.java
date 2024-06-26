package com.sakha.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Chat {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long chatId;

  private Long userId;

  @Column(columnDefinition = "longtext")
  private String message;

  @Column(columnDefinition = "longtext")
  private String sakhaResponse;

  private Date chatDate;
  private Boolean liked;
  private Boolean disliked;
}
