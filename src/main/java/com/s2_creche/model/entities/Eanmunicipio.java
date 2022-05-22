/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s2_creche.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
public class Eanmunicipio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer cdmunicipio;
    private String nmmunicipio;
    private String ceppadrao;
    private String ddd;
    private String flintegradora;
    @JoinColumn(name = "CDUF", referencedColumnName = "CDUF")
    @ManyToOne
    private Eanuf cduf;

}
