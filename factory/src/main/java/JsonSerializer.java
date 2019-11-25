import com.google.gson.Gson;

public class JsonSerializer implements AbstractSerializer {

    public String serialize(Instance instance) {
        return new Gson().toJson(instance);
    }
}
