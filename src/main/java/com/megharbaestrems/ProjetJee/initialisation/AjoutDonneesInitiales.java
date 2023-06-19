package com.megharbaestrems.ProjetJee.initialisation;

import com.megharbaestrems.ProjetJee.business.*;
import com.megharbaestrems.ProjetJee.dao.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@AllArgsConstructor
public class AjoutDonneesInitiales implements CommandLineRunner {

    private FileDao fileDao;

    private ParasolDoa parasolDoa;

    private LienDeParenteDao lienDeParenteDao;

    private PaysDao paysDao;

    private StatutDao statutDao;


    @Override
    public void run(String... args) throws Exception {
        //blablabla
        Instant debut = Instant.now();
        System.out.println("Ajout donéees initiales");
        ajoutFiles(7);
        ajoutParasols();
        ajoutLiensDeParentes();
        ajoutPays();
        ajoutStatuts();
        Instant fin = Instant.now();
        System.out.println("Ajouts effectués en " + (fin.getNano()-debut.getNano()) + " ns");
    }



    private void ajoutFiles(int nbFile) {
        if (fileDao.count() == 0) {
            for (int i = 1; i <= nbFile; i++){
                double prix = (double) 200 / i;
                fileDao.save(new File((byte) i, prix));
            }
        }
    }

    private void ajoutParasols(){
        //blablabla
        if (parasolDoa.count() == 0) {
            fileDao.findAll().forEach(file -> {
                for (int i = 1; i <= 8; i++){
                    Parasol parasol = new Parasol(i + "F" + file.getNumero(), file);
                    file.getParasols().add(parasol);
                    parasolDoa.save(parasol);
                }
            });
        }
    }

    private void ajoutLiensDeParentes() {
        if (lienDeParenteDao.count() == 0) {
            lienDeParenteDao.save(new LienDeParente("frère/sœur", 0.5));
            lienDeParenteDao.save(new LienDeParente("cousin/cousine", 0.25));
            lienDeParenteDao.save(new LienDeParente("aucun", 0D));
        }
    }

    private void ajoutPays() {
        if (paysDao.count() == 0) {
            paysDao.save(new Pays("FRA", "France"));
            paysDao.save(new Pays("DEU", "Allemagne"));
            paysDao.save(new Pays("KOR", "Corée du Sud"));
            paysDao.save(new Pays("COL", "Colombie"));
            paysDao.save(new Pays("MEX", "Mexique"));
            paysDao.save(new Pays("BRA", "Brésil"));
            paysDao.save(new Pays("CHE", "Suisse"));
            paysDao.save(new Pays("NOR", "Norvège"));
            paysDao.save(new Pays("AUS", "Australie"));
            paysDao.save(new Pays("ISR", "Israël"));
        }
    }

    private void ajoutStatuts() {
        if (statutDao.count() == 0){
            statutDao.save(new Statut("à traiter"));
            statutDao.save(new Statut("confirmée"));
            statutDao.save(new Statut("refusée"));
        }
    }
}
