package com.s2_creche.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Esanempresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer cdempresa;
    private String nmempresa;
    private String flsps;
    private String flreproducao;
    private String flprecreche;
    private String flcreche;
    private String flrecria;
    private String flterminacao;
    private String flid1;
    private String flid2;
    private String flpesomatriz;
    private String flespessuratoucinhomatriz;
    private String flnome1;
    private String flnome2;
    private String flnome3;
    private String flnome4;
    private String flcalendario;
    private String flhospital;
    private Integer flnumontas;
    private Integer flnuintervalomontas;
    private String flfunchora;
    private String flcoberturalactacao;
    private String flsemana1ano;
    private String fllocalizacaomatrizes;
    private String flpesoleitoesparto;
    private String flpesoleitoesdesmame;
    private String fldigitacaomatriz;
    private String flvendevacinamedicamento;
    private String flmaternidade;
    private String flscorecorporalmatriz;
    private String fllotedesmsemana;
    private String fllotedesmtipo;
    private String fllotedesmano;
    private String flvendematerial;
    private String flcontrolematernidade;
    private String flparticiparanking;
    private String flproducaoracaopeloconsumo;
    private String flconsumoracaopelacompra;
    private String flconsumovacinapelacompra;
    private String flconsumomaterialpelacompra;
    private String flleitoesbaixaviabilidade;
    private String flbloqueioproducaoracao;
    private Integer fliniciosemana;
    private Character fltipificacaocarcaca;
    private Character fltipocalculoconsumoracao;
    private String fllocalizacao;
    private String nmproprietario;
    private String nmresponsaveltecnico;
    private String nmcrmv;
    private String nmorgaoestadual;
    private String nmgeoreferenciamento;
    private Integer cdmunicipio;
    private Integer flresponsavelboletim;
    private String nmresponsaveltecnicooutro;
    private String flpermitirvalorcompramaiornf;
    private Integer nudiasbanda;
    @Temporal(TemporalType.DATE)
    private Date dabasebanda;
    private Character flutilizaenquetebrf;
    private String guid;
    @Basic(optional = false)
    private String flutilizaexportsaidaplantel;
    private Character flutilizaexportadorbrfmtech;

}
