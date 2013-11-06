/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Suporte4
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Movimento.findAll", query = "SELECT m FROM Movimento m"),
    @NamedQuery(name = "Movimento.findByDescricao", query = "SELECT m FROM Movimento m where m.descricao"),
    @NamedQuery(name = "Movimento.findByData", query = "SELECT m FROM Movimento m where m.data"),
    @NamedQuery(name = "Movimento.findByTipo", query = "SELECT m FROM Movimento m where m.tipo"),
    @NamedQuery(name = "Movimento.findByStatus", query = "SELECT m FROM Movimento m where m.status"),
    @NamedQuery(name = "Movimento.findByCodigo", query = "SELECT m FROM Movimento m where m.id=:codigo")})

@Table(name = "MOVIMENTO")
public class Movimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private Long id;
    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;
    @Column(name = "VALOR", nullable = false)
    private float valor;
    @Column(name = "DT_MOVIMENTO", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column(name = "TIPO", nullable = false)
    private char tipo;
    @Column(name = "STATUS", nullable = false)
    private String status;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimento)) {
            return false;
        }
        Movimento other = (Movimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Movimento[ id=" + id + " ]";
    }

}
