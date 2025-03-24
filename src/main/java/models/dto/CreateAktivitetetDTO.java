package models.dto;
import java.util.Date;

public class CreateAktivitetetDTO {
    private final String emriAktivitetit;
    private final String pershkrimi;
    private final Date data;
    private final int grupiID;

    public CreateAktivitetetDTO(String emriAktivitetit, String pershkrimi, Date data, int grupiID) {
        this.emriAktivitetit = emriAktivitetit;
        this.pershkrimi = pershkrimi;
        this.data = data;
        this.grupiID = grupiID;
    }

    public String getEmriAktivitetit() {
        return emriAktivitetit;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public Date getData() {
        return data;
    }

    public int getGrupiID() {
        return grupiID;
    }
}
