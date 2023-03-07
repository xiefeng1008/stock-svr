package org.utopia.stock.svr.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@Table(name="dzjy")
public class Dzjy implements Serializable {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "date")
    private String date;

    @Column(name = "code")
    private String code;



}