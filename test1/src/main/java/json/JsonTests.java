package json;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonTests {

    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonDatum value = mapper.readValue("{\"attr\":true}", JsonDatum.class);

        System.out.println(value);

    }

    static class JsonDatum {

        private String value;

        @JsonCreator
        public JsonDatum(@JsonProperty("attr") String value) {
            super();
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

}
