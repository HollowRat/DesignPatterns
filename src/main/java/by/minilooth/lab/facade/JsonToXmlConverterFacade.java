package by.minilooth.lab.facade;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.IOException;
import java.io.StringWriter;

public class JsonToXmlConverterFacade {

    public String convert(String json) throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        JsonNode node = jsonMapper.readValue(json, JsonNode.class);
        XmlMapper xmlMapper = new XmlMapper();

        xmlMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, true);

        StringWriter w = new StringWriter();
        xmlMapper.writeValue(w, node);

        return w.toString();
    }

}
