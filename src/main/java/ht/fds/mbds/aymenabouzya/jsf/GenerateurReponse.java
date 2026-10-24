package ht.fds.mbds.aymenabouzya.jsf;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GenerateurReponse {

    public GenerateurReponse() {
    }

    /**
     * Génère une réponse en fonction de la question et du rôle système.
     */
    public String genererReponse(String question, String roleSysteme) {
        // Logique de génération (vous pouvez adapter selon votre code d'origine)
        return "Ceci est une réponse simulée pour : " + question;
    }
}