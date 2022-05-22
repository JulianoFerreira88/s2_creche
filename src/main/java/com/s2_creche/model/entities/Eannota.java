package com.s2_creche.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Eannota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer cdnota;
    private String nunota;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnota;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vltotalnota;
    private String obs;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    private String fltiponota;
    private String fltipopagamento;
    private Double vltotalatual;
    private String serie;
    private String filial;
    private String guid;
    @JoinColumn(name = "CDENTIDADE", referencedColumnName = "CDENTIDADE")
    @ManyToOne
    private Eanentidade cdentidade;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;

}
