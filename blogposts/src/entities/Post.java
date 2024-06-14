package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    //Apesar de não parecer necessário foi solicitado para criação como private static da mesma expressão de formatação do Program
    /*private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");*/
    private Date moment;
    private String titlle;
    private String content;
    private Integer likes;

    private List<Comment> commments = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String titlle, String content, Integer likes) {
        this.moment = moment;
        this.titlle = titlle;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitlle() {
        return titlle;
    }

    public void setTitlle(String titlle) {
        this.titlle = titlle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getCommments() {
        return commments;
    }

/* Não Podemos manter o set da lista pois substituiria a lista ao inves de adicionar
    public void setCommments(List<Comment> commments) {
        this.commments = commments;
    }
*/
    public void addComment (Comment comment){
        commments.add(comment);
    }
    public  void removeComment (Comment comment){
        commments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titlle+"\n");
        sb.append(likes+" - "+moment+"\n");
        sb.append(content+"\n");
        sb.append("Comments:\n");
        // for each para cada comment
        for (Comment c : commments){
            sb.append(c.getText()+"\n");
        }


        return sb.toString();
    }
}

