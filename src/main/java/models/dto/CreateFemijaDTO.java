package models.dto;
import java.util.Date;

public class CreateFemijaDTO {
    private final String emri;
    private final String mbiemri;
    private final String dataLindjes;
    private final String gjinia;
    private final String adresa;
    private final String emriPrindit;
    private final String kontaktiPrindit;

    public CreateFemijaDTO(String emri, String mbiemri, String dataLindjes, String gjinia,
                           String adresa, String emriPrindit, String kontaktiPrindit) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.dataLindjes = dataLindjes;
        this.gjinia = gjinia;
        this.adresa = adresa;
        this.emriPrindit = emriPrindit;
        this.kontaktiPrindit = kontaktiPrindit;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public String getDataLindjes() {
        return dataLindjes;
    }

    public String getGjinia() {
        return gjinia;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getEmriPrindit() {
        return emriPrindit;
    }

    public String getKontaktiPrindit() {
        return kontaktiPrindit;
    }
}

