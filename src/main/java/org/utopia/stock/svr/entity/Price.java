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
@Table(name="price")
public class Price implements Serializable {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "date")
    private String date;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "start_price")
    private Double startPrice;
    @Column(name = "end_price")
    private Double endPrice;
    @Column(name = "h_price")
    private Double hPrice;
    @Column(name = "l_price")
    private Double lPrice;
    @Column(name = "change_rate")
    private Double changeRate;
    @Column(name = "turnover_rate")
    private Double turnoverRate;
    @Column(name = "qrr")
    private Double qrr;

}