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

@Entity

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Esansala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer cdsala;
    private Integer nusala;
    private String nmsala;
    private Integer nubaias;
    private String guid;
    @JoinColumn(name = "CDEMPRESA", referencedColumnName = "CDEMPRESA")
    @ManyToOne
    private Esanempresa cdempresa;
    @JoinColumn(name = "CDFASE", referencedColumnName = "CDFASE")
    @ManyToOne
    private Esanfase cdfase;

}
