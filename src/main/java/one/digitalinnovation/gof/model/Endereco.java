package one.digitalinnovation.gof.model;

import javax.persistence.Id;

public class Endereco {

    @Id
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getDdd() {
        return ddd;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getGia() {
        return gia;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getIbge() {
        return ibge;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }
}

