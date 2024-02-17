/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainesi;

/**
 *
 * @author nadaa
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class DataManager {
    private static DataManager instance;

    private String idCarte;
    private String numTrain;
    private String depart;
    private String arriver;
    private String heure;

    private DataManager() {
        // Constructeur privé pour éviter l'instanciation directe
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public String getidCarte() {
        return idCarte;
    }

    public void setidCarte(String idCarte) {
        this.idCarte = idCarte;
    }

    public String getNumTrain() {
        return numTrain;
    }

    public void setNumTrain(String numTrain) {
        this.numTrain = numTrain;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArriver() {
        return arriver;
    }

    public void setArriver(String arriver) {
        this.arriver = arriver;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public void setDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.heure = sdf.format(date);
    }
}

