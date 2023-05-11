package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.GeoPlugins;

public class XMLMapperr {

    XmlMapper xmlMapper = new XmlMapper();

    public GeoPlugins getPlugins(String xml) throws JsonProcessingException {
        return  xmlMapper.readValue(xml, GeoPlugins.class);
    }
}
