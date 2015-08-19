package com.ireland.travel.domain;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import lombok.Data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Entity
@Table(name = "purchaseitem")
public class PurchaseItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

	@Version
    @Column(name = "version")
	
    private Integer version;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar orderDate;

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonIgnore
    private Product product;

    @NotNull
    private int quantity;

    @ManyToOne
    @JsonIgnore
    private Purchase purchase;


	@JsonIgnore
	public Integer getVersion() {
        return this.version;
    }

	public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
	
	@JsonIgnore
	public Product getProduct() {
        return this.product;
    }

	@JsonIgnore
	public Purchase getPurchase() {
        return this.purchase;
    }

}
