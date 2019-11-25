import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.IOException;
import java.io.StringWriter;

public class CsvSerializer implements AbstractSerializer {
    private final String[] header = new String[]{"name", "surname", "year", "books"};
    public String serialize(Instance instance) {
        StringWriter writer = new StringWriter();
        ICsvBeanWriter beanWriter = new CsvBeanWriter(writer, CsvPreference.STANDARD_PREFERENCE);
        try {
            beanWriter.writeHeader(header);
            beanWriter.write(instance, header);
            beanWriter.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e);;
        }
        return writer.toString();
    }
}
