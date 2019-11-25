import javax.xml.bind.JAXB;
import java.io.StringWriter;

public class XmlSerializer implements AbstractSerializer {
    public String serialize(Instance instance) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(instance, sw);
        return sw.toString();
    }
}
