package aymen.abouzya.tp0.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;

@Named(value = "bb")
@ViewScoped
public class Bb implements Serializable {
    private String question;
    private String reponse;
    private String conversation = "";
    private String roleAPI;

    @Inject
    private GenerateurReponse generateur;

    public String envoyer() {
        if (question == null || question.trim().isEmpty()) {
            return null;
        }
        reponse = generateur.generer(question, roleAPI, conversation.isEmpty());
        conversation = "Utilisateur : " + question + "\n" + "API : " + reponse + "\n\n" + conversation;
        question = "";
        return null;
    }

    public String nouveauChat() {
        return "index.xhtml?faces-redirect=true";
    }

    // Getters et Setters
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getReponse() { return reponse; }
    public void setReponse(String reponse) { this.reponse = reponse; }

    public String getConversation() { return conversation; }
    public void setConversation(String conversation) { this.conversation = conversation; }

    public String getRoleAPI() { return roleAPI; }
    public void setRoleAPI(String roleAPI) { this.roleAPI = roleAPI; }
}