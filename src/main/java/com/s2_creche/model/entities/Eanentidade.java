/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s2_creche.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Juliano
 */
@Entity

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Eanentidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer cdentidade;
    private String fltipopessoa;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtcadastro;
    private String nmentidade;
    private String nmfantasia;
    private String documento;
    private String endereco;
    private String bairro;
    private String complemento;
    private String cep;
    private String caixapostal;
    private String fonecomercial;
    private String foneresidencial;
    private String fonecelular;
    private String fax;
    private String email;
    private String homepage;
    @Lob
    private String observacao;
    private String cgccpf;
    private String inscestadual;
    private String cdprocedencia;
    private String flsituacao;
    private String flintegradora;
    private Integer cdgranjaintegradora;
    private String guid;

}
