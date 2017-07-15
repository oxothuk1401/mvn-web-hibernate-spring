package edu.registration.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//import java.time.Clock;

/**
 * Created by oxothuk1401 on 11.07.2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_mssg")
    private long idMssg;

    @Column(name = "id_chat", nullable = false)
    private long idChat;

    @Column(name = "id_teacher" , nullable = false)
    private long idTeacher;

    @Column(name = "message")
    private String message;

    @Column(name = "date")
    private String date;

    @Column(name = "username")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getIdMssg() {
        return idMssg;
    }

    public void setIdMssg(long idMssg) {
        this.idMssg = idMssg;
    }

    public long getIdChat() {
        return idChat;
    }

    public void setIdChat(long idChat) {
        this.idChat = idChat;
    }

    public long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (idMssg != chat.idMssg) return false;
        if (idChat != chat.idChat) return false;
        if (idTeacher != chat.idTeacher) return false;
        if (message != null ? !message.equals(chat.message) : chat.message != null) return false;
        if (date != null ? !date.equals(chat.date) : chat.date != null) return false;
        return username != null ? username.equals(chat.username) : chat.username == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (idMssg ^ (idMssg >>> 32));
        result = 31 * result + (int) (idChat ^ (idChat >>> 32));
        result = 31 * result + (int) (idTeacher ^ (idTeacher >>> 32));
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
