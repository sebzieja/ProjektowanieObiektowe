import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Instance {
    private String name;
    private String surname;
    private int year;
    private List<String> books;

    public Instance() {
    }

    public Instance(String name, String surname, int year, List<String> books) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public String getSurname() {
        return surname;
    }
    @XmlElement
    public int getYear() {
        return year;
    }
    @XmlElement
    public List<String> getBooks() {
        return books;
    }
}
