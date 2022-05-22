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
public class Esancausa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer cdcausa;
    private String flmatriz;
    private String flreprodutor;
    private String flleitao;
    private String flterminado;
    private String flleitaolactante;
    private String flintegradora;
    private String fldescarteproblemareprodutivo;
    private String nmcausa;
    private String flmarra;
    private String fltipo;
    private Character flsituacao;
    private String guid;
    @JoinColumn(name = "CDBDPORCCAUSALEITAO", referencedColumnName = "CDBDPORCCAUSALEITAO")
    @ManyToOne
    private Ecusbdporccausaleitao cdbdporccausaleitao;
    @JoinColumn(name = "CDBDPORCCAUSAREPROD", referencedColumnName = "CDBDPORCCAUSAREPROD")
    @ManyToOne
    private Ecusbdporccausareprodutor cdbdporccausareprod;

}
