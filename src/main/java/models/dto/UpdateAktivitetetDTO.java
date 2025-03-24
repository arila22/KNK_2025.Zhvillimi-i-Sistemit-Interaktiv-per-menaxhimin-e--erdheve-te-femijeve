package models.dto;
import java.util.Date;

public class UpdateAktivitetetDTO {
    private int aktivitetiID;
    private String emriAktivitetit;
    private String pershkrimi;
    private Date data;
    private int grupiID;

    public UpdateAktivitetetDTO(int aktivitetiID, String emriAktivitetit, String pershkrimi, Date data, int grupiID) {
        this.aktivitetiID = aktivitetiID;
        this.emriAktivitetit = emriAktivitetit;
        this.pershkrimi = pershkrimi;
        this.data = data;
        this.grupiID = grupiID;
    }

    public int getAktivitetiID() {
        return aktivitetiID;
    }

    public String getEmriAktivitetit() {
        return emriAktivitetit;
    }

    public void setEmriAktivitetit(String emriAktivitetit) {
        this.emriAktivitetit = emriAktivitetit;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getGrupiID() {
        return grupiID;
    }

    public void setGrupiID(int grupiID) {
        this.grupiID = grupiID;
    }
}
