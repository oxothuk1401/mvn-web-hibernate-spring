package by.htp.library.entity;


import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book{
    @Id
    @Column(name = "idbook")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id = 0;
    @Column(name = "access")
    private String access = null;
    @Column(name = "author")
    private String author = null;
    @Column(name = "title")
    private String title = null;
    @Column(name = "date")
    private String date = null;




    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Author : ");
        sb.append(this.author + "\n");
        sb.append("\n");
        sb.append("Title : ");
        sb.append(this.title + " ");
        sb.append("\n");
        sb.append("Date of publication : ");
        sb.append(this.date + " ");
        sb.append("\n");
        sb.append("Access : ");
        sb.append(this.access + " ");
        sb.append("\n");
        return sb.toString();
    }

    //	@Override
//	public int hashCode() {
//		return 31 * id + 31 * access.hashCode() + 31 * author.hashCode() + 31 * date.hashCode() + 31 * title.hashCode();
//	}
    @Override
    public int hashCode() {
        return 31 * author.hashCode() + 31 * access.hashCode() + 31 * date.hashCode() + 31 * title.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        if (!this.author.equals(book.author))
            return false;
        if (!this.access.equals(book.access))
            return false;
        if (!this.date.equals(book.date))
            return false;
        if (!this.title.equals(book.title))
            return false;
        return true;
    }

}
//@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (this.getClass() != obj.getClass())
//			return false;
//		Book book = (Book) obj;
//		if (this.id != book.id)
//			return false;
//		if (!this.access.equals(book.access))
//			return false;
//		if (!this.author.equals(book.author))
//			return false;
//		if (!this.date.equals(book.date))
//			return false;
//		if (!this.title.equals(book.title))
//			return false;
//		return true;
//	}
//}
