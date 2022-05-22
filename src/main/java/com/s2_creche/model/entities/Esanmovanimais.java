package com.s2_creche.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Esanmovanimais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer cdmovanimais;
    private Integer cdmovanimais2;
    private String fltipo;
    private String fltipovenda;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmovimentacao;
    private Integer qtanimais;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double peso;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnascimento;
    private Integer cdrelacionado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    private String flpalm;
    private Double valor;
    private String nubaia;
    private Integer cdlote2;
    private Integer cdcargaanimal;
    private Integer qtanimaisposabate;
    private String flacertomaternidadeagriness;
    private String observacao;

//    @JoinColumn(name = "CDENTIDADE", referencedColumnName = "CDENTIDADE")
//    @ManyToOne
//    private Eanentidade cdentidade;
//    @JoinColumn(name = "CDNOTA", referencedColumnName = "CDNOTA")
//    @ManyToOne
//    private Eannota cdnota;
    @JoinColumn(name = "CDCAUSA", referencedColumnName = "CDCAUSA")
    @ManyToOne
    private Esancausa cdcausa;
//    @JoinColumn(name = "CDGRANJA", referencedColumnName = "CDEMPRESA")
//    @ManyToOne
//    private Esanempresa cdgranja;
//    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
//    @ManyToOne
//    private Esanempresa cdempresa;
    @JoinColumn(name = "CDFASE", referencedColumnName = "CDFASE")
    @ManyToOne
    private Esanfase cdfase;
//    @JoinColumn(name = "CDFUNCIONARIO", referencedColumnName = "CDFUNCIONARIO")
//    @ManyToOne
//    private Esanfuncionario cdfuncionario;
//    @JoinColumn(name = "CDLOTE", referencedColumnName = "CDLOTE")
//    @ManyToOne
    private Integer cdlote;
    @JoinColumn(name = "CDSALALOTE", referencedColumnName = "CDSALA")
    @ManyToOne
    private Esansala cdsalalote;
    @JoinColumn(name = "CDSALALOTE2", referencedColumnName = "CDSALA")
    @ManyToOne
    private Esansala cdsalalote2;

}
