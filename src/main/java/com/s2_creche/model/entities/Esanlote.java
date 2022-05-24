package com.s2_creche.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Esanlote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer cdlote;
    private String nmlote;
    private String flsituacao;
    private String flsituacao2;
    private String obs;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmedianascimento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmedianascimento2;
    private String guid;
    @JsonIgnore
    @OneToMany(mappedBy = "cdlote")
    private List<Esanmovanimais> esanmovanimaisList;

    private Integer cdentidade;

    private Integer cdempresa;

    public List<Esanmovanimais> getMovimentacoesCreche() {
        List<Esanmovanimais> mov = new ArrayList<>();
        for (Esanmovanimais m : esanmovanimaisList) {
            if (m.getCdfase().getCdfase() == 4) {
                mov.add(m);
            }
        }
        return mov;
    }

    public List<Esanmovanimais> getMortesEngorda() {
        List<Esanmovanimais> mortes = new ArrayList<>();
        for (Esanmovanimais m : getMovimentacoesEngorda()) {
            if (m.getFltipo().equals("O")) {
                mortes.add(m);
            }
        }
        return mortes;
    }

    public List<Esanmovanimais> getMortesCreche() {
        List<Esanmovanimais> mortes = new ArrayList<>();
        for (Esanmovanimais m : getMovimentacoesCreche()) {
            if (m.getFltipo().equals("O")) {
                mortes.add(m);
            }
        }
        return mortes;
    }

    public List<Esanmovanimais> getMovimentacoesEngorda() {
        List<Esanmovanimais> mov = new ArrayList<>();
        for (Esanmovanimais m : esanmovanimaisList) {
            if (m.getCdfase().getCdfase() == 6) {
                mov.add(m);
            }
        }
        return mov;
    }

    public String getFase() {
        if (this.flsituacao.equals("4")) {
            return "Creche";
        } else {
            return "Terminação";
        }
    }

}
