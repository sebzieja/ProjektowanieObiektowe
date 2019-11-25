import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Instance instance = new Instance("imie", "nazwisko", 2020, Arrays.asList("ksiazka", "jakas inna ksiazka"));
        List<AbstractSerializer> serializers = new ArrayList<>();
        serializers.add(new XmlSerializer());
        serializers.add(new JsonSerializer());
        serializers.add(new CsvSerializer());
        serializers.forEach(serializer -> System.out.println(serializer.serialize(instance)));
    }
}
