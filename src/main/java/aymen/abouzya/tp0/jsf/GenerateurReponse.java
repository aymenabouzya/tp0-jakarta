package aymen.abouzya.tp0.jsf;

import jakarta.enterprise.context.Dependent;
import java.io.Serializable;

@Dependent
public class GenerateurReponse implements Serializable {

    public String generer(String question, String role, boolean premierMessage) {
        // 1. On compte le nombre de caractères de la question
        int taille = question.trim().length();

        // 2. On inverse le texte de la question (ex: "bonjour" devient "ruojnob")
        String questionInversee = new StringBuilder(question).reverse().toString();

        // 3. On construit la réponse finale
        String res = "🤖 [" + role.toUpperCase() + "] a analysé votre question de " + taille + " caractères. "
                + "Voici votre texte à l'envers : " + questionInversee;

        return res;
    }
}