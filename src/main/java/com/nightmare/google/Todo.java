package com.nightmare.google;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Todo  {

    @Id
    @Column(name="s_no")
    private Long Id;
    private String task;
    private String cr_time;
    private String due_time;


}
